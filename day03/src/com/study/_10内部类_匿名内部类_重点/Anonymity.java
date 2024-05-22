package com.study._10内部类_匿名内部类_重点;

/**
 * @Classname: Anonymity
 * @Date: 2024/5/22 22:58
 * @Author: 聂建强
 * @Description:
 *     目标：匿名内部类的概述、
 *
 *     什么是匿名内部类？
 *         就是一个没有名字的局部内部类。
 *         匿名内部类目的是为了：简化代码，也是开发中常用的形式。
 *
 *     匿名内部类的格式：
 *         new 类名|抽象类|接口(形参){
 *             方法重写。
 *         }
 *      匿名内部类的特点：
 *          1.匿名内部类是一个没有名字的内部类。
 *          2.匿名内部类一旦写出来，就会立即创建一个匿名内部类的对象返回。
 *          3.匿名内部类的对象的类型相当于是当前new的那个的类型的子类类型。
 *     小结：
 *          1.匿名内部类是一个没有名字的内部类。
 *          2.匿名内部类一旦写出来，就会立即创建一个匿名内部类的对象返回。
 *          3.匿名内部类的对象的类型相当于是当前new的那个的类型的子类类型。
 */
public class Anonymity {
    public static void main(String[] args) {
        // 匿名内部类
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("猫跑的贼6");
            }
        };
        a.run();  // 编译看左边，运行看右边
        a.go();  // 编译看左边，运行看右边

        // 匿名内部类
        Animal a1 = new Animal() {
            @Override
            public void run() {
                System.out.println("狗跑的贼快");
            }
        };
        a1.run();  // 编译看左边，运行看右边
        a1.go();  // 编译看左边，运行看右边

    }
}

// 抽象类
abstract class Animal{
    public abstract void run();

    public void go(){
        System.out.println("开始go");
    }
}