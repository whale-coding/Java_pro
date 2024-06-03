package com.study._15线程的创建_方式二;

/**
 * @Classname: ThreadDemo2
 * @Date: 2024/6/3 14:39
 * @Author: 聂建强
 * @Description:
 * 目标：方式二的匿名内部类写法。简化写法。
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        // 创建一个线程任务对象(注意：线程任务对象不是线程对象，只是执行线程的任务的)
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "=>" + i);
                }
            }
        };
        // 把线程任务对象包装成线程对象.且可以指定线程名称
        Thread t = new Thread(target);
        // 调用线程对象的start()方法启动线程
        t.start();

        // 更加简化的写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "=>" + i);
                }
            }
        }).start();

        // main线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "=>" + i);
        }
    }
}
