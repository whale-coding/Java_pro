package com.study._19线程同步_同步方法;

/**
 * @Classname: Account
 * @Date: 2024/6/3 15:29
 * @Author: 聂建强
 * @Description: 账户类
 */
public class Account {
    private String cardID;
    private double money;

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
    /* 直接在方法上加synchronized 关键字*/
    public synchronized void  drawMoney(double money) {
        // 开始判断取钱逻辑
        // 1.先拿到是谁来取钱：取当前线程对象的名称
        String name = Thread.currentThread().getName();
        // 2.判断余额是否足够
        if(this.money >= money){
            System.out.println(name+"来取钱，余额足够，吐出"+money);
            // 3.更新余额
            this.money -= money;
            System.out.println(name+"来取钱后，余额剩余"+ this.money);
        }else{
            System.out.println(name+"来取钱，余额不足！");
        }
    }
}
