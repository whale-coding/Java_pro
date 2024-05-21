package com.study._04多态_引用类型强制类型转换;


/**
 * @Classname: PolymorphicDemo
 * @Date: 2024/5/21 14:03
 * @Author: 聂建强
 * @Description:
 *     目标：引用类型强制类型转换
 *
 *     引用类型强制类型转换的语法：
 *         1.父类类型的变量或者对象必须强制类型转换成子类类型的变量，否则报错!
 *
 *     强制类型转换的格式：
 *         类型 变量名称 = (类型)(对象或者变量)
 *
 *     注意：有继承/实现关系的两个类型就可以进行强制类型转换，编译阶段一定不报错！
 *          但是运行阶段可能出现：类型转换异常 ClassCastException
 *
 *     Java建议在进行强制类型转换之前先判断变量的真实类型，再强制类型转换!
 *         变量 instanceof 类型： 判断前面的变量是否是后面的类型或者其子类类型才会返回true,
 *
 *     小结：
 *         有继承/实现关系的两个类型就可以进行强制类型转换，编译阶段一定不报错！
 *         但是运行阶段可能出现：类型转换异常 ClassCastException
 *         Java建议在进行强制类型转换之前先判断变量的真实类型，再强制类型转换!
 *             变量 instanceof 类型： 判断前面的变量是否是后面的类型或者其子类类型才会返回true,
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        Animal a = new Wolf();
        a.run();
        // a.catchSheep();  // 报错！

        // 1、把动物类型的变量a转换成真实的狼类型
        Wolf w = (Wolf) a;
        w.catchSheep();

        // 2.多态下类型转换异常问题研究（重点）
        Animal a1 = new Animal();
        // Wolf w1 = (Wolf) a1;  // 编译阶段没有报错！在运行阶段出现ClassCastException类型转换异常！

        // 正确的做法是先用instanceof判断类型，再进行转换
        if (a1 instanceof Cat){
            Cat c1 = (Cat) a1;
            c1.catchMouse();
        }else if (a1 instanceof Wolf){
            Wolf w1 = (Wolf) a1;
            w1.catchSheep();
        }
    }
}

class Wolf extends Animal{
    @Override
    public void run(){
        System.out.println("狼跑的飞快");
    }
    // 独有方法
    public void catchSheep(){
        System.out.println("狼抓羊");
    }
}

class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("猫跑的贼快");
    }
    // 独有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Animal{
    public void run(){
        System.out.println("动物可以跑");
    }
}