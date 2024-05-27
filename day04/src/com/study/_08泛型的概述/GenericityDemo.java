package com.study._08泛型的概述;

import java.util.ArrayList;

/**
 * @Classname: GenericityDemo
 * @Date: 2024/5/24 16:27
 * @Author: 聂建强
 * @Description:
 *     目标：泛型的概述。
 *
 *     什么是泛型？
 *         泛型就是一个标签：<数据类型>
 *         泛型可以在编译阶段约束只能操作某种数据类型。
 *     注意：JDK 1.7开始之后，泛型后面的申明可以省略不写!!
 *          泛型和集合都只能支持引用数据类型，不支持基本数据类型。
 *
 *     小结：
 *         泛型可以在编译阶段约束只能操作某种数据类型。
 *         泛型和集合都只能支持引用数据类型，不支持基本数据类型。
 *         JDK 1.7开始之后，泛型后面的申明可以省略不写!!
 */
public class GenericityDemo {
    public static void main(String[] args) {
        // ArrayList<String> lists = new ArrayList<String>();
        // JDK 1.7开始之后，泛型后面的申明可以省略不写
        ArrayList<String> lists = new ArrayList<>();
        lists.add("java");
        lists.add("123");
        // lists.add(123);
        // lists.add(true);
        System.out.println(lists);

        ArrayList<Integer> lists2 = new ArrayList<>();
        lists2.add(10);
        lists2.add(20);
        System.out.println(lists2);
    }
}
