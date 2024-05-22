package com.study._10内部类_匿名内部类_重点;

/**
 * @Classname: Anonymity02
 * @Date: 2024/5/22 23:13
 * @Author: 聂建强
 * @Description:
 *    目标： 匿名内部类的使用形式。(关注语法)
 *
 *     需求：很多角色要一起参加游泳比赛（老师，学生，运动员）
 */
public class Anonymity2 {
    public static void main(String[] args) {
        // 匿名内部类
        Swim baozai = new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师游泳很6");
            }
        };
        go(baozai);

        // 匿名内部类
        Swim boniu = new Swim() {
            @Override
            public void swimming() {
                System.out.println("波妞学生快乐的狗爬式");
            }
        };
        go(boniu);

        // 匿名内部类的匿名对象
        go(new Swim() {
            @Override
            public void swimming() {
                System.out.println("波妞学生快乐的狗爬式");
            }
        });
    }
    // 提供一个方法让全部角色进入比赛
    public static void go(Swim s){
        System.out.println("开始");
        s.swimming();
        System.out.println("结束");
    }
}

interface Swim{
    void swimming();
}