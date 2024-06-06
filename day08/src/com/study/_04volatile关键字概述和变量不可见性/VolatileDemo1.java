package com.study._04volatile关键字概述和变量不可见性;

/**
 * @Classname: VolatileDemo1
 * @Date: 2024/6/6 15:00
 * @Author: 聂建强
 * @Description:
 *     目标：并发编程下，多线程访问变量的不可见性问题。
 *
 *     引入:
 *         多个线程访问共享变量，会出现一个线程修改变量的值后，其他线程看不到变量最新值的情况。
 *
 *     结论：并发编程下，多线程修改变量，会出现线程间变量的不可见性。
 *
 *     不可见性的原因：
 *          每个线程都有自己的工作内存，线程都是从主内存拷贝共享变量的副本值。
 *          每个线程是在自己的工作内存中操作共享变量的。
 */

// 演示并发编程下，变量不可见性问题
public class VolatileDemo1 {
    public static void main(String[] args) {
        // 1.启动子线程，把线程对象中的flag改为true
        VolatileThread t = new VolatileThread();
        t.start();

        // 2.主线程
        while (true){
            // 这里读取到了flag值一直是false,虽然线程已经把它的值改成了true
            if(t.isFlag()){
                System.out.println("主线程进入执行一次");
            }
        }
    }
}

// 线程类
class VolatileThread extends Thread{
    private  boolean flag = false ;  // 定义成员变量

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