package com.study._01线程通信;

/**
 * @Classname: ThreadCommunication
 * @Date: 2024/6/4 12:24
 * @Author: 聂建强
 * @Description:
 *     目标：线程通信（了解原理，代码几乎不用）
 *
 *     线程通信：多个线程因为在同一个进程中，所以互相通信比较容易的。
 *
 *     线程通信的经典模型：生产者与消费者问题。
 *          生产者负责生成商品，消费者负责消费商品。
 *          生产不能过剩，消费不能没有。
 *
 *     模拟一个案例：
 *         小明和小红有一个共同账户：共享资源
 *         他们有3个爸爸（亲爸，岳父，干爹）给他们存钱。
 *
 *         模型：小明和小红去取钱，如果有钱就取出，然后等待自己，唤醒他们3个爸爸们来存钱
 *              他们的爸爸们来存钱，如果发现有钱就不存，没钱就存钱，然后等待自己，唤醒孩子们来取钱。
 *              做整存整取：10000元。
 *     分析：
 *         生产者线程：亲爸，岳父，干爹
 *         消费者线程：小明，小红
 *         共享资源：账户对象。
 *
 *     注意：线程通信一定是多个线程在操作同一个资源才需要进行通信。
 *          线程通信必须先保证线程安全，否则毫无意义，代码也会报错！
 *
 *     线程通信的核心方法：
 *         public void wait(): 让当前线程进入到等待状态 此方法必须锁对象调用.
 *         public void notify() : 唤醒当前锁对象上等待状态的某个线程  此方法必须锁对象调用
 *         public void notifyAll() : 唤醒当前锁对象上等待状态的全部线程  此方法必须锁对象调用
 *     小结：
 *         是一种等待唤醒机制。
 *         必须是在同一个共享资源才需要通信，而且必须保证线程安全。
 */
public class ThreadCommunication {
    public static void main(String[] args) {
        // 1.创建一个共享账户对象
        Account acc = new Account("ICBC-1313113",0);
        // 2.创建2个取钱线程
        new DrawThread("小明",acc).start();
        new DrawThread("小红",acc).start();

        // 3.创建3个存钱线程
        new SaveThread(acc , "亲爹").start();
        new SaveThread(acc , "干爹").start();
        new SaveThread(acc , "岳父").start();
    }
}
