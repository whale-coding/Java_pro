package com.study._14final关键字;

/**
 * @Classname: FinalDemo1
 * @Date: 2024/5/16 10:13
 * @Author: 聂建强
 * @Description:
 *     目标：final关键字。
 *
 *     final是最终的含义。
 *     final用于修饰：类，方法，变量。
 *
 *     1.final修饰类，类不能被继承了。
 *     2.final可以修饰方法，方法就不能被重写了。
 *     3.final修饰变量总规则：变量有且仅能被赋值一次。
 *
 *     拓展：final和abstract的关系?
 *           互斥关系,不能同时修饰类或者同时修饰方法！！
 */
public class FinalDemo1 {
    public static void main(String[] args) {

    }
}

class Animal{
    public final void run(){

    }
}

class Cat extends Animal{
    // final修饰方法，方法不能被重写
    // @Override
    // public void run(){}
}

// final修饰类，类不能被继承了。
// final class Animal{
//
// }
// class Cat extends Animal{
//
// }
