package com.study._06原子性问题的解决;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Classname: VolatileAtomicThreadDemo
 * @Date: 2024/6/6 16:37
 * @Author: 聂建强
 * @Description:
 *      目标：保证原子性操作的方案研究。
 *
 *      保证原子性操作的方案：
 *          1、加锁
 *              -- 虽然安全性得到了保证，但是性能不好！
 *          2、基于CAS方式的原子类
 *              -- Java已经提供了一些本身即可实现原子性（线程安全）的类。
 *              -- 概述：java从JDK1.5开始提供了java.util.concurrent.atomic包(简称Atomic包)，
 *                         这个包中的原子操作类提供了一种用法简单，性能高效，线程安全地更新一个变量的方式。
 *              -- 操作整型的原子类
 *                  public AtomicInteger()：	   			初始化一个默认值为0的原子型Integer
 *                  public AtomicInteger(int initialValue)： 初始化一个指定值的原子型Integer
 *                  int get():   			 				 获取值
 *                  int getAndIncrement():      			 以原子方式将当前值加1，注意，这里返回的是自增前的值
 *                  int incrementAndGet():     			     以原子方式将当前值加1，注意，这里返回的是自增后的值
 *                  int addAndGet(int data):				 以原子方式将输入的数值与实例中的值（AtomicInteger里的value）相加，并返回结果
 *                  int getAndSet(int value):   			 以原子方式设置为newValue的值，并返回旧值
 *      结论：
 *          1、可以使用加锁或者使用原子类保证原子性操作，从而实现线程安全。
 *          2、为什么使用原子类可以保证原子性操作且性能好，而且线程安全呢？
 *              -- 原子类底层是基于CAS乐观锁机制，每次修改数据不会加锁，等到修改的时候会判断有没有别人修改了。
 *
 *      CAS与Synchronized总结：
 *      CAS和Synchronized都可以保证多线程环境下共享数据的安全性。那么他们两者有什么区别？
 *          Synchronized是从悲观的角度出发：
 *              总是假设最坏的情况，每次去拿数据的时候都认为别人会修改，所以每次在拿数据的时候都会上锁，这样别人想拿这个数据就会阻塞直到它拿到锁。
 *              （共享资源每次只给一个线程使用，其它线程阻塞，用完后再把资源转让给其它线程）。
 *              因此Synchronized我们也将其称之为悲观锁。jdk中的ReentrantLock也是一种悲观锁。性能较差！
 *          CAS是从乐观的角度出发:
 *              总是假设最好的情况，每次去拿数据的时候都认为别人不会修改，所以不会上锁，但是在更新的时候会判断一下在此期间别人有没有去更新这个数据。
 *              CAS这种机制我们也可以将其称之为乐观锁。综合性能较好！
 *
 */
public class VolatileAtomicThreadDemo {
    public static void main(String[] args) {
        // 创建VolatileAtomicThread对象
        Runnable target = new VolatileAtomicThread();
        // 开启100个线程执行这一个任务
        for (int i = 0; i < 100; i++) {
            new Thread(target).start();
        }
    }
}


class VolatileAtomicThread implements Runnable{

    private int count = 0;  // 定义一个int类型的变量

    // 保证原子性的方案2：基于CAS方式的原子类
    // ① 创建一个Integer更新的原子类AtomicInteger,初始值为0
    private AtomicInteger atomicInteger = new AtomicInteger(0);  // 原子类中封装好了整型变量，默认值是0

    // 重写run()方法
    @Override
    public void run() {

        // for (int i = 0; i < 100; i++) {
        //     // 保证原子性的方案1：加锁
        //     synchronized (this){
        //         count++;
        //         System.out.println("count ===>" + count);
        //     }
        // }

        for (int i = 0; i < 100; i++) {
            // 保证原子性的方案2：基于CAS方式的原子类
            // ② 使用原子类的方法
            int count = atomicInteger.incrementAndGet();  // 底层变量+1且返回！
            System.out.println("count ===>" + count);
        }

    }
}