package com.study._02线程池;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Classname: ThreadPoolsDemo3
 * @Date: 2024/6/5 22:15
 * @Author: 聂建强
 * @Description:
 *     目标：创建一个线程池。
 *
 *     线程池在Java中的代表类：ExecutorService(接口)。
 *
 *     Java在Executors类下提供了一个静态方法得到一个线程池的对象：
 *          1.public static ExecutorService newFixedThreadPool(int nThreads)：
 *             创建一个线程池返回。
 *
 *     ExecutorService提交线程任务对象执行的方法：
 *          1.Future<?> submit(Runnable task):提交一个Runnable的任务对象给线程池执行。
 *          1.Future<?> submit(Callable task):提交一个Runnable的任务对象给线程池执行。
 *     小结：
 *         Callable做线程池的任务，可以得到它执行的结果！！
 */
public class ThreadPoolsDemo3 {
    public static void main(String[] args) {
        // a.创建一个线程池，指定线程的固定数量是3.
        ExecutorService pools = Executors.newFixedThreadPool(3);
        // b.把线程任务放入到线程池中去执行,返回未来任务对象
        Future<String> t1 = pools.submit(new MyCallable(10));  // 第1次提交任务，此时会创建一个新线程，自动启动线程执行！
        Future<String> t2 = pools.submit(new MyCallable(20));  // 第2次提交任务，此时会创建一个新线程，自动启动线程执行！
        Future<String> t3 = pools.submit(new MyCallable(30));  // 第3次提交任务，此时会创建一个新线程，自动启动线程执行！
        Future<String> t4 = pools.submit(new MyCallable(40));  // 第4次提交任务，不会再创建新线程，会复用之前的线程来处理这个任务

        try{
            // c.可以得到线程池执行的任务结构
            String rs1 = t1.get();  // 获取call()方法的返回值
            String rs2 = t2.get();  // 获取call()方法的返回值
            String rs3 = t3.get();  // 获取call()方法的返回值
            String rs4 = t4.get();  // 获取call()方法的返回值

            System.out.println(rs1);
            System.out.println(rs2);
            System.out.println(rs3);
            System.out.println(rs4);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


// 定义一个线程任务类实现Callable接口,申明线程执行的结果类型。
class MyCallable implements Callable<String>{
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    // 重写线程任务类的call()方法,这个方法可以直接返回执行的结果
    @Override
    public String call() throws Exception {
        // 需求：使用线程池，计算出1-100,1-200,1-300的和并返回
        int sum = 0 ;
        for(int i = 1 ; i <= n ; i++){
            System.out.println(Thread.currentThread().getName()+" => "+i);
            sum += i ;
        }
        return Thread.currentThread().getName()+"计算1-"+n+"的和："+sum;
    }
}