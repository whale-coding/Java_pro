package com.study._03List系列集合的使用;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname: ListDemo2
 * @Date: 2024/5/29 15:38
 * @Author: 聂建强
 * @Description:
 *     拓展：List系列集合的遍历方式有：4种。
 *
 *     List系列集合多了索引，所以多了一种按照索引遍历集合的for循环。
 *
 *     List遍历方式：
 *         （1）for循环。
 *         （2）迭代器。
 *         （3）foreach。
 *         （4）JDK 1.8新技术:Lambda表达式
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");

        /* for 循环遍历 */
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
        }
        System.out.println("----------------------");

        /* 使用迭代器遍历 */
        Iterator<String> it =list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------------");

        /* foreach遍历 */
        for (String ele : list) {
            System.out.println(ele);
        }
        System.out.println("----------------------");

        /* 使用Lambda表达式遍历 */
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
