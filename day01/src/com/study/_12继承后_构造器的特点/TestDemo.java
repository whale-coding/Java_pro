package com.study._12继承后_构造器的特点;

/**
 * @Classname: ExtendsDemo
 * @Date: 2024/5/14 15:30
 * @Author: 聂建强
 * @Description:
 *     目标：继承后构造器的特点。
 *
 *     继承后子类构造器的特点：
 *         调用子类构造器的时候，子类的构造器一定会先调用父类的无参数构造器再执行自己的构造器。
 *     为什么子类构造器一定要先调用父类无参数构造器：
 *         1.子类的全部构造器的第一行默认有一个super()调用父类无参数构造器。
 *         2.调用子类构造器初始化子类对象的时候，必须先调用父类构造器去初始化继承自父类的成员。
 *     小结：
 *         子类构造器默认一定会先调用父类的无参数构造器再执行自己。
 */
public class TestDemo {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger("老虎");
    }
}

class Animal{
    public Animal(){
        System.out.println("==父类Animal的无参数构造器==");
    }
}

class Tiger extends Animal{
    public Tiger(){
        //super(); // 默认存在的，根据参数去匹配调用父类的构造器。
        System.out.println("==子类Tiger的无参数构造器==");
    }

    public Tiger(String name){
        //super(); // 默认存在的，根据参数去匹配调用父类的构造器。
        System.out.println("==子类Tiger的有参数构造器==");
    }
}