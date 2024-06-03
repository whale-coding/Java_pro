package com.study._18线程同步_同步代码块;

/**
 * @Classname: DrawThread
 * @Date: 2024/6/3 15:31
 * @Author: 聂建强
 * @Description: 线程类：用于创建取钱线程对象。
 */
public class DrawThread extends Thread{
    // 定义一个成员变量接收账户对象
    private Account acc ;

    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(100000);  // 小明/小红取钱100000
    }
}
