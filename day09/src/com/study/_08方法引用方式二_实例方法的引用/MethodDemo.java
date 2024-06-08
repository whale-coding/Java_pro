package com.study._08方法引用方式二_实例方法的引用;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname: MethodDemo
 * @Date: 2024/6/8 12:04
 * @Author: 聂建强
 * @Description:
 *      目标：方法引用有四种形式：
 *      1.静态方法的引用。
 *      2.实例方法的引用。
 *      3.特定类型方法的引用。
 *      4.构造器引用。
 *
 *      2.实例方法的引用
 *           格式： 对象::实例方法。
 *           简化步骤：
 *               a.定义一个实例方法，把需要的代码放到实例方法中去。
 *           实例方法引用的注意事项
 *              ” 重要：被引用的方法的参数列表要和函数式接口中的抽象方法的参数列表一致。“
 */
public class MethodDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Lambda表达式
        list.forEach(s -> System.out.println(s));

        // Lambda表达式+方法引用
        /*
         * 对象是 System.out = new PrintStream();
         * 实例方法：println()
         * 前后参数正好都是一个
         */
        list.forEach(System.out::println);
    }
}
