package com.study._01线程通信;

/**
 * @Classname: SaveThread
 * @Date: 2024/6/4 12:31
 * @Author: 聂建强
 * @Description: 存钱线程类
 */
public class SaveThread extends Thread{
    private Account acc ; // 定义了一个账户类型的成员变量接收取款的账户对象
    public SaveThread(Account acc , String name){
        super(name); // 为当前线程对象取名字
        this.acc = acc ;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(4000);
                acc.saveMoney(10000);  // 存钱
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
