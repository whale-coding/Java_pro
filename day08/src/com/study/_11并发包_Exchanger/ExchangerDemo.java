package com.study._11并发包_Exchanger;

import java.util.concurrent.Exchanger;

/**
 * @Classname: ExchangerDemo
 * @Date: 2024/6/7 15:54
 * @Author: 聂建强
 * @Description:
 *      目标：Exchanger
 *
 *      作用
 *            Exchanger（交换者）是一个用于线程间协作的工具类。Exchanger用于进行线程间的数据交换。
 *            这两个线程通过exchange方法交换数据，如果第一个线程先执行exchange()方法，它会一直等待第二个线程也执行exchange方法，
 *            当两个线程都到达同步点时，这两个线程就可以交换数据，将本线程生产出来的数据传递给对方。
 *      Exchanger构造方法：
 *             public Exchanger()
 *      Exchanger重要方法：
 *             public V exchange(V x)
 *      分析：
 *         （1）需要2个线程
 *         （2）需要一个交换对象负责交换两个线程执行的结果。
 *
 *     小结：
 *          Exchanger可以实现线程间的数据交换。
 *          一个线程如果等不到对方的数据交换就会一直等待。
 *          我们也可以控制一个线程等待的时间。
 *          必须双方都进行交换才可以正常进行数据的交换。
 */
public class ExchangerDemo {
    public static void main(String[] args) {
        // 创建交换对象（信使）
        Exchanger<String> exchanger = new Exchanger<>();
        // 创建2个线程对象,进行通信
        new A(exchanger).start();
        new B(exchanger).start();
    }
}


class A extends Thread{
    private Exchanger<String> exchanger;

    public A(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println("线程A,做好了礼物A,等待线程B送来的礼物B.....");
        try {
            // 开始交换礼物。参数是送给其他线程的礼物!
            System.out.println("线程A收到线程B的礼物："+exchanger.exchange("礼物A"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class B extends Thread{
    private Exchanger<String> exchanger;

    public B(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println("线程B,做好了礼物B,等待线程A送来的礼物A.....");
        try {
            // 开始交换礼物。参数是送给其他线程的礼物!
            System.out.println("线程B收到线程A的礼物："+exchanger.exchange("礼物B"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}