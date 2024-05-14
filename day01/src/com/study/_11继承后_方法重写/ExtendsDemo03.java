package com.study._11继承后_方法重写;

/**
 * @Classname: ExtendsDemo03
 * @Date: 2024/5/14 15:06
 * @Author: 聂建强
 * @Description:
 *     目标：静态方法和私有方法是否可以被重写（拓展语法）
 *
 *     可以吗?  都不可以.
 */
public class ExtendsDemo03 {
}

class Mac extends Computer{
    // @Override
    public static void test(){}
    // @Override
    private void go(){}
}

class Computer{
    public static void test(){

    }
    private void go(){

    }
}
