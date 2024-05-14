package com.study._11继承后_方法重写;

/**
 * @Classname: ExtendsDemo02
 * @Date: 2024/5/14 15:01
 * @Author: 聂建强
 * @Description:
 *     目标：super调用父类被重写的方法。
 *
 *     super:代表了父类引用。
 *     super可以用在子类的实例方法中调用父类被重写的方法。
 */
public class ExtendsDemo02 {
    public static void main(String[] args) {
        SportMan yaoMing = new SportMan();
        yaoMing.run();
    }
}

class SportMan extends People{
    @Override
    public void run() {
        super.run();
        System.out.println("运动员跑的贼快");
    }
    // 中转的方法，来同时调用父类和子类的方法
    public void go(){
        super.run();  // 父类的
        run();  // 子类的
    }
}

class People{
    public void run(){
        System.out.println("人会跑");
    }
}
