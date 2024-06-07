package com.study._08并发包_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @Classname: CountDownLatchDemo
 * @Date: 2024/6/6 21:41
 * @Author: 聂建强
 * @Description:
 *     目标：CountDownLatch的使用。
 *
 *      CountDownLatch允许一个或多个线程等待其他线程完成操作，再执行自己。
 *      例如：线程1要执行打印：A和C，线程2要执行打印：B，但线程1在打印A后，
 *         要线程2打印B之后才能打印C，所以：线程1在打印A后，
 *         必须等待线程2打印完B之后才能继续执行
 *
 *      需求：
 *         提供A线程，打印 A , C
 *         提供B线程，打印 B
 *
 *      构造器：
 *          public CountDownLatch(int count)// 初始化唤醒需要的down几步。
 *      方法：
 *          public void await() throws InterruptedException// 让当前线程等待，必须down完初始化的数字才可以被唤醒，否则进入无限等待
 *          public void countDown()	// 计数器进行减1 （down 1）
 *      小结：
 *          CountDownLatch可以用于让某个线程等待几步才可以继续执行，
 *          从而可以实现控制线程执行的流程！
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        //创建一个CountDownLatch对象（计数器）用于监督A，B线程的执行情况。
        CountDownLatch down = new CountDownLatch(1);

        new ThreadA(down).start();
        new ThreadB(down).start();
    }
}

class ThreadA extends Thread{
    private CountDownLatch down;

    public ThreadA(CountDownLatch down) {
        this.down = down;
    }

    @Override
    public void run() {
        System.out.println("A");
        try {
            down.await();  // A线程等待自己，当前线程让出CPU，等待自己（根据监督者中的数量决定）
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("C");
    }
}

class ThreadB extends Thread{
    private CountDownLatch down;

    public ThreadB(CountDownLatch down) {
        this.down = down;
    }

    @Override
    public void run() {
        System.out.println("B");
        down.countDown();  // 这里相当于是让监督者中的计数器-1，代表自己执行完毕了。被等待的线程就会被唤醒（A线程被唤醒）。
    }
}