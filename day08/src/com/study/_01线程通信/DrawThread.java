package com.study._01线程通信;

/**
 * @Classname: DrawThread
 * @Date: 2024/6/3 15:31
 * @Author: 聂建强
 * @Description: 取钱线程类
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
        while(true){
            try {
                Thread.sleep(4000);
                acc.drawMoney(10000);  // 取钱
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
