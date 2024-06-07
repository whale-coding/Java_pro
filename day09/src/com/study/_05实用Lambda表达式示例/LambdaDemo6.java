package com.study._05实用Lambda表达式示例;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Classname: LambdaDemo6
 * @Date: 2024/6/7 20:04
 * @Author: 聂建强
 * @Description: 分组
 */
public class LambdaDemo6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","orange");
        Map<Integer,List<String>> groups = new HashMap<>();
        for (String s: list){
            int length =s.length();
            if (!groups.containsKey(length)){
                groups.put(length,new ArrayList<>());
            }
            groups.get(length).add(s);
        }
        System.out.println(groups);

        // 使用Lambda表达式
        Map<Integer,List<String>> groups2 = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groups2);
    }
}
