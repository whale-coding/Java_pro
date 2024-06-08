package com.study._22递归的概述和应用理论;

/**
 * @Classname: RecursionDemo1
 * @Date: 2024/6/8 16:12
 * @Author: 聂建强
 * @Description:
 *     目标：递归的形式
 *
 *     递归：方法在方法中又调用了自己。
 *
 *     递归：
 *         直接递归：自己的方法调用自己。
 *         间接递归：自己的方法调用别的方法，别的方法又调用自己。
 *     小结：
 *          递归是自己调用自己。
 *          递归如果控制的不恰当，会形成递归的死循环，从而导致栈内存溢出错误！！
 *          递归应该防止进入递归的死循环！
 */
public class RecursionDemo1 {
    public static void main(String[] args) {
        testA();
    }

    public static void testA(){
        System.out.println("--A--");
        testA();  // 直接递归
    }
}
