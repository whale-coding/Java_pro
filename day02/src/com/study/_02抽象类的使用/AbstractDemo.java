package com.study._02抽象类的使用;

/**
 * @Classname: AbstractDemo
 * @Date: 2024/5/14 21:27
 * @Author: 聂建强
 * @Description:
 *     目标：抽象类的使用。
 *
 *     抽象类的作用：为了被子类继承。
 *
 *     总结：
 *         一个类继承了抽象类，必须重写完抽象类的全部抽象方法，否则这个类必须定义成抽象类。
 *         因为拥有抽象方法的类必须定义成抽象类。
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.work();
        t.run();

        Manage m = new Manage();
        m.work();
        m.run();
    }
}

class Manage extends Employee{

    @Override
    public void work() {
        System.out.println("班主任需要管理班级");
    }

    @Override
    public void run() {

    }
}

class Teacher extends Employee{

    @Override
    public void work() {
        System.out.println("老师需要授课");
    }

    @Override
    public void run() {

    }
}

// 需求：一家公司开发员工管理系统（讲师，班主任），每个员工都要工作，但是工作内容不一样。
abstract class Employee{
    // 子类都要完成工作这个功能，但是工作的内容不一样
    public abstract void work();
    public abstract void run();
}