package com.study._14线程的常用API;

/**
 * @Classname: ThreadDemo3
 * @Date: 2024/6/3 12:42
 * @Author: 聂建强
 * @Description:
 *     目标：通过Thread类的有参数构造器为当前线程对象取名字。
 *         -- public Thread()
 *         -- public Thread(String name):创建线程对象并取名字。
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new MyThread2("1号线程");
        t1.start();

        Thread t2 = new MyThread2("2号线程");
        t2.start();

        Thread.currentThread().setName("main线程");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "=>" + i);
        }
    }

}


// 定义一个线程类继承Thread。线程类并不是线程对象，用来创建线程对象的
class MyThread2 extends Thread{
    //  public Thread(String name):父类的有参数构造器
    public MyThread2(String name) {
        super(name);  // 调用父类的有参数构造器初始化当前线程对象的名称！
    }

    // 重写run()方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "=>" + i);
        }
    }
}