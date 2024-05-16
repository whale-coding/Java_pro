package com.study._15单例模式;

/**
 * @Classname: SingleInstanceDemo1
 * @Date: 2024/5/16 10:51
 * @Author: 聂建强
 * @Description:
 *      目标：面试常考（单例模式）。
 *
 *      单例模式的含义： 单例模式，是一种常用的软件设计模式。通过单例模式可以保证系统中，
 *          应用该模式的这个类永远只有一个实例。即一个类永远只有一个对象实例。
 *          单例是为了节约内存，单例在有些业务场景下还必须用到！！
 *
 *      单例的应用场景：在实际开发中，有很多业务对象永远只需要一个，无论启动多少次
 *      我们只需要一个对象，例如任务管理对象，只需要一个对象。节约内存和性能。
 *      因为对象越多内存占用越大，极有可能出现内存溢出！
 *
 *      实现单例模式目前提供两种方式：
 *             1.饿汉单例设计模式
 *                  在用类获取对象的时候，对象已经提前为你创建好了。
 *                  设计步骤：
 *                  a.定义一个类，把构造器私有。
 *                  b.定义一个静态变量存储一个对象。
 *                  c.提供一个返回单例对象的方法。
 *
 *             2.懒汉单例设计模式
 */
public class SingleInstanceDemo1 {
    public static void main(String[] args) {
        SingleInstance1 s1 = SingleInstance1.getInstance();
        SingleInstance1 s2 = SingleInstance1.getInstance();

        System.out.println(s1 == s2);
    }
}

// 饿汉单例设计模式，设计一个单例模式的类
class SingleInstance1{

    // 2、定义一个静态成员变量用于存储一个对象！
    // （饿汉单例在返回对象的时候，对象要已经做好，所以这里直接创建出来）
    private static SingleInstance1 ins = new SingleInstance1();

    // 1、把类的构造器私有，构造器只能在本类中访问
    private SingleInstance1(){

    }

    // 3、提供一个方法，返回单例对象
    public static SingleInstance1 getInstance(){
        return ins;
    }

}
