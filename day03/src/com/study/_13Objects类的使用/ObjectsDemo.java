package com.study._13Objects类的使用;

import com.study._12Object类的详细使用.Student;

import java.util.Objects;

/**
 * @Classname: ObjectsDemo
 * @Date: 2024/5/23 15:06
 * @Author: 聂建强
 * @Description:
 *     目标：Objects类的使用。
 *
 *     Objects类与Object还是继承关系。
 *     Objects类是从JDK 1.7开始之后才有的。
 *
 *     Objects的方法：
 *         1.public static boolean equals(Object a, Object b)
 *             -- 比较两个对象的。
 *             -- 底层进行非空判断，从而可以避免空指针异常。更安全！！推荐使用！！
 *              public static boolean equals(Object a, Object b) {
 *                      return a == b || a != null && a.equals(b);
 *              }
 *         2.public static boolean isNull(Object obj)
 *             -- 判断变量是否为null ,为null返回true ,反之！
 */
public class ObjectsDemo {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = new Student();
        System.out.println(Objects.equals(s1,s2));  // 可以避免空指针异常，更加安全。
        // System.out.println(s1.equals(s2));  // 会空指针异常

        // 判断s1是否为null，为null返回true，反之返回false
        System.out.println(Objects.isNull(s1));
        System.out.println(s1 == null);  // 用 == 判断也可以
    }
}
