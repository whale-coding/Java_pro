package com.study._02多态的优劣势;

/**
 * @Classname: PolymorphicDemo
 * @Date: 2024/5/20 23:17
 * @Author: 聂建强
 * @Description:
 *     目标：多态的优劣势。
 *
 *     优势：
 *         1.在多态形式下，右边对象可以实现组件化切换，业务功能也随之改变，
 *            便于扩展和维护。可以实现类与类之间的解耦。
 *         2.实际开发的过程中，父类类型作为方法形式参数，传递子类对象给方法，
 *             可以传入一切子类对象进行方法的调用，更能体现出多态的扩展性与便利。
 *
 *     劣势：
 *         1.多态形式下，不能直接调用子类特有的功能。编译看左边!! 左边
 *         父类中没有子类独有的功能，所以代码在编译阶段就直接报错了！
 *     小结：
 *          记住以上语法！
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        // 父类类型 对象名称 = new 子类构造器;
        Animal cat = new Cat();
        cat.run();  // 对于方法的调用：编译看左边，运行看右边。
        // cat.catchMouse();  // 报错了，多态形式下，编译看左边，左边没有独有功能

        Animal c = new Cat();
        go(c);
        Animal dog = new Dog();
        go(dog);
    }

    // 开发一个游戏：所有动物都可以进来比赛
    public static void go(Animal d){
        System.out.println("开始。。");
        d.run();
        System.out.println("结束。。");
    }
}

class Dog extends Animal {
    @Override
    public void run() {
        System.out.println("狗跑得贼快");
    }
    // 独有功能
    public void lookDoor(){
        System.out.println("狗看门");
    }
}

class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("猫跑的飞快");
    }
    // 独有功能
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Animal {
    public void run() {
        System.out.println("动物跑");
    }
}