package com.study._20线程同步_Lock锁;

/**
 * @Classname: ThreadSafe
 * @Date: 2024/6/3 15:34
 * @Author: 聂建强
 * @Description:
 *     目标：线程同步_lock显示锁
 *
 *     线程同步的作用：就是为了解决线程安全问题的方案。
 *
 *     线程同步解决线程安全问题的核心思想：
 *             让多个线程实现先后依次访问共享资源，这样就解决了安全问题。
 *     线程同步的做法：
 *             是把共享资源进行上锁，每次只能一个线程进入访问完毕以后，其他线程才能进来。
 *
 *     线程同步的方式有三种：
 *         （1）同步代码块。
 *         （2）同步方法。
 *         （3）lock显示锁。
 *
 *    c.lock显示锁。
 *         java.util.concurrent.locks.Lock机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作,
 *         同步代码块/同步方法具有的功能Lock都有,除此之外更强大
 *
 *         Lock锁也称同步锁，加锁与释放锁方法化了，如下：
 *              - `public void lock() `:加同步锁。
 *              - `public void unlock()`:释放同步锁。
 *
 *    总结：
 *         线程安全，性能差。
 *         线程不安全性能好。假如开发中不会存在多线程安全问题，建议使用线程不安全的设计类。
 */
public class ThreadSafe {
    public static void main(String[] args) {
        // a.创建一个共享资源账户对象
        Account acc = new Account("ICBC-110", 100000);

        // b.创建2个线程对象去账户对象中取钱
        Thread littleMing = new DrawThread("小明", acc);
        littleMing.start();

        Thread litterRed = new DrawThread("小红", acc);
        litterRed.start();
    }
}
