package com.study._07并发包_ConcurrentHashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname: ConcurrentHashMapDemo
 * @Date: 2024/6/6 21:13
 * @Author: 聂建强
 * @Description:
 *     目标：并发包的介绍。(面试的重点中的重点)
 *
 *     并发包的来历：
 *         在实际开发中如果不需要考虑线程安全问题，大家不需要做线程安全，因为如果做了反而性能不好！
 *         但是开发中有很多业务是需要考虑线程安全问题的，此时就必须考虑了。否则业务出现问题。
 *         Java为很多业务场景提供了性能优异，且线程安全的并发包，程序员可以选择使用！
 *
 *     Map集合中的经典集合：HashMap它是"线程不安全"的，性能好
 *         -- 如果在要求线程安全的业务情况下就不能用这个集合做Map集合，否则业务会崩溃~
 *     为了保证线程安全，可以使用Hashtable。注意：线程中加入了计时
 *         -- Hashtable是线程安全的Map集合，但是性能较差！(已经被淘汰了，虽然安全，但是性能差)
 *     为了保证线程安全，再看ConcurrentHashMap（不止线程安全，而且效率高，性能好，最新最好用的线程安全的Map集合）
 *         -- ConcurrentHashMap保证了线程安全，综合性能较好！
 *     小结：
 *         HashMap是线程不安全的。
 *         Hashtable线程安全基于synchronized，综合性能差,被淘汰了。
 *         ConcurrentHashMap：线程安全的，分段式锁，综合性能最好，线程安全开发中推荐使用
 */

public class ConcurrentHashMapDemo {
    // public static Map<String,String> map = new HashMap<>();  // 线程不安全

    // public static Map<String,String> map = new Hashtable<>();  // 线程安全，性能较差(因为底层很多地方加锁)

    public static Map<String,String> map = new ConcurrentHashMap<>();  // 线程安全，性能高

    // 演示HashMap在高并发下的线程不安全
    public static void main(String[] args) {
        // 提供两个线程分别给map集合加入1000个数据，检查是否会出现线程安全问题
        Thread t1 = new AddMapDataThread();
        Thread t2 = new AddMapDataThread();
        t1.start();
        t2.start();

        // 确保两个线程执行完毕
        try {
            t1.join();  // 让t1跑完,主线程不能竞争t1的CPU
            t2.join();  // 让t2跑完,主线程不能竞争t2的CPU
        }catch (Exception e){
            e.printStackTrace();
        }

        // 等两个线程执行完毕以后去获取集合最终的元素个数
        System.out.println("元素个数："+map.size());
    }
}

// 线程类
class AddMapDataThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            ConcurrentHashMapDemo.map.put(Thread.currentThread().getName()+"键："+i,"值"+i);
        }
    }
}

