package com.study._05实用Lambda表达式示例;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname: LambdaDemo4
 * @Date: 2024/6/7 19:53
 * @Author: 聂建强
 * @Description: 映射
 */
public class LambdaDemo4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","orange");

        // 取出每个元素的长度
        List<Integer> list2 = new ArrayList<>();
        for (String s: list){
            list2.add(s.length());
        }

        // 使用Lambda表达式
        List<Integer> list3 = list.stream().map(s -> s.length()).collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(list3);
    }

}
