package com.study._05原子性介绍;

/**
 * @Classname: VolatileAtomicThreadDemo
 * @Date: 2024/6/6 16:16
 * @Author: 聂建强
 * @Description:
 *      目标：volatile修饰变量的原子性研究。
 *
 *      什么是原子性？
 *          原子性：是指一批操作是一个整体，要么同时成功，要么同时失败，不能被干扰。
 *
 *      结论：volatile只能保证线程间变量的可见性，但是不能保证变量操作的原子性。
 */

// 原子性问题演示
public class VolatileAtomicThreadDemo {
    public static void main(String[] args) {
        // 创建VolatileAtomicThread对象
        Runnable target = new VolatileAtomicThread();
        // 开启100个线程执行这一个任务
        for (int i = 0; i < 100; i++) {
            new Thread(target).start();
        }
        // 按道理说，100个线程，每个线程都执行对count++，100次的任务，结果应该是10000。
        // 但是由于没有原子性，得到的结果可能并不是10000
    }
}

// 线程类
class VolatileAtomicThread implements Runnable{

    // private int count = 0;  // 定义一个int类型的变量

    // 哪怕加了volatile关键字修饰，仍然保证不了原子性
    private volatile int count = 0;

    // 重写run()方法
    @Override
    public void run() {
        // 对count变量进行++操作100次(一次任务是一个整体)
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("count ===>" + count);
        }

    }
}