package com.study._03抽象类的特征;


/**
 * @Classname: AbstractDemo
 * @Date: 2024/5/14 21:37
 * @Author: 聂建强
 * @Description:
 *     目标：抽象类的特征研究和深入。
 *
 *     抽象类的特征：有得有失。
 *         有得：抽象类拥有了得到抽象方法的能力。
 *         失去：抽象类失去了创建对象的能力。（抽象类不能创建对象）
 *
 *     面试题：抽象类是否有构造器，是否可以创建对象，为什么?
 *          答：抽象类作为类一定有构造器，而且必须有构造器。
 *          提供给子类继承后调用父类构造器使用的。
 *
 *          抽象类虽然有构造器，但是抽象类绝对不能创建对象。
 *          抽象类中可能存在抽象方法，抽象方法不能执行。
 *          抽象在学术上本身意味着不能实例化。
 *          反证法：假如抽象类可以创建对象，
 *          Animal a = new Animal();
 *          a.run();  // 抽象方法不能执行，因为它没有方法体，所以抽象类不能创建对象！
 *          ps:设计上的、约定上的面试问题，可以尝试使用反证法去说。
 *     抽象类除了有得有失之外，类的其他成分人家都具备！！
 *     抽象本身意味着不能具体化！！！
 *
 *     小结：
 *         抽象类不能创建对象。
 *         抽象类除了不能创建对象之外，类的其他成分它都具备！
 *         抽象类中也可以没有抽象方法！！
 */
public class AbstractDemo {
    public static void main(String[] args) {
        // Animal a = new Animal();  // 抽象类不能创建对象！

        // a.run();  // 抽象方法不能执行，抽象类不能创建对象！！
    }
}

abstract class Animal{
    private String name;
    private int age;
    public static String schoolName = "黑马";
    // 构造器
    public Animal(){}

    // 抽象方法
    public abstract void run();

    // 普通方法（非静态）
    public void go(){

    }
    // 普通方法（静态）
    public static void test(){

    }
}