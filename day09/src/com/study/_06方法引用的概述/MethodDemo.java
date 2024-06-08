package com.study._06方法引用的概述;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname: MethodDemo
 * @Date: 2024/6/8 11:43
 * @Author: 聂建强
 * @Description:
 *      目标：方法引用的概述。(了解)
 *
 *      方法引用：
 *              方法引用是为了进一步简化Lambda表达式的写法。
 *              方法引用的格式：类型或者对象::引用的方法。
 *      关键语法是：“::”
 *
 *      小结：
 *         方法引用可以进一步简化Lambda表达式的写法。
 *         关键语法是：“::”
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
        list.forEach(System.out::println);
    }
}
