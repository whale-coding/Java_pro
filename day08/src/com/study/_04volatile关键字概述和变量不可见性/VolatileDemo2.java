package com.study._04volatile关键字概述和变量不可见性;

/**
 * @Classname: VolatileDemo2
 * @Date: 2024/6/6 15:11
 * @Author: 聂建强
 * @Description:
 *      目标：并发编程下变量不可见性解决方案。
 *
 *      现象：并发编程下，多线程修改变量，会出现线程间变量的不可见性。
 *
 *      解决线程间变量的不可见性方案有两种常见方式：
 *          1、加锁
 *              -- 每次加锁会清空线程自己的工作内存，从新读取主内存最新值。
 *          2、对共享的变量进行volatile关键字修饰。
 *              -- volatile关键字修饰的变量可以在多线程并发修改下，实现线程间变量的可见性。
 *              -- 一旦一个线程修改了volatile关键字修饰的变量，另一个线程可以立即取到最新值。
 */
public class VolatileDemo2 {
    public static void main(String[] args) {
        // 1.启动子线程，把线程对象中的flag改为true
        VolatileThread2 t = new VolatileThread2();
        t.start();

        // 2.主线程
        while (true){
            // 这里读取到了flag值一直是false,虽然线程已经把它的值改成了true
            if(t.isFlag()){
                System.out.println("主线程进入执行一次");
            }
        }

        /* 并发编程下变量不可见性解决方案1：加锁*/

        // while (true){
        //     // 使用类名.class作为锁对象
        //     // 加锁会清空工作内存，读取主内存中的最新值到工作内存中
        //     synchronized (VolatileDemo2.class){
        //         if (t.isFlag()){
        //             System.out.println("主线程进入执行一次");
        //         }
        //     }
        // }

    }
}

// 线程类
class VolatileThread2 extends Thread{
    /* 并发编程下变量不可见性解决方案2：对共享的变量进行volatile关键字修饰*/
    private volatile  boolean flag = false ;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 线程中修改变量flag的值为true
        this.flag = true ;
        System.out.println("线程修改了flag=" + flag);
    }
}