package com.study._20线程同步_Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname: Account
 * @Date: 2024/6/3 15:29
 * @Author: 聂建强
 * @Description: 账户类
 */
public class Account {
    private String cardID;
    private double money;

    // 创建一把锁对象:因为账户对象对于小明小红是唯一的，所以这里的锁对象对于小明小红也是唯一的
    private final Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // 小明线程/小红线程
    public void drawMoney(double money) {
        // 1.先拿到是谁来取钱：取当前线程对象的名称
        String name = Thread.currentThread().getName();
        lock.lock(); // 上锁!
        try{
            if(this.money >= money){
                // 3.余额足够
                System.out.println(name+"来取钱，吐出："+money);
                // 4.更新余额
                this.money -= money;
                // 5.输出结果
                System.out.println(name+"来取钱"+money+"成功，取钱后剩余："+this.money);
            }else{
                // 6.余额不足
                System.out.println(name+"来取钱，余额不足，剩余"+this.money);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock(); // 解锁!
        }
    }
}
