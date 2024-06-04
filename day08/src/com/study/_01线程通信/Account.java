package com.study._01线程通信;

/**
 * @Classname: Account
 * @Date: 2024/6/4 12:25
 * @Author: 聂建强
 * @Description: 账户对象
 */
public class Account {
    private String cardId ;
    private double money ;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // 3个爸爸（亲爸，干爹，岳父）存钱
    public synchronized void saveMoney(double money){
        try {
            // 1、知道是谁来取钱
            String name = Thread.currentThread().getName();
            // 2、判断余额是否足够
            if (this.money > 0){
                // 5.等待自己，唤醒别人
                this.notifyAll();
                this.wait();
            }else {
                // 3.钱没有，存钱
                this.money += money;
                System.out.println(name+"来存钱，存入了"+money+"剩余："+this.money);
                // 4.等待自己，唤醒别人
                this.notifyAll();
                this.wait();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 小明、小红取钱
    public synchronized void drawMoney(double money) {
        try{
            // 1.知道是谁来取钱
            String name = Thread.currentThread().getName();
            // 2.判断余额是否足够
            if(this.money > 0){
                // 3.账户有钱，有钱可以取
                this.money -= money;
                System.out.println(name+"来取钱"+money+"取钱后剩余："+this.money);
                // 4.没钱，先唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            }else{
                // 5.余额不足，没钱，先唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
