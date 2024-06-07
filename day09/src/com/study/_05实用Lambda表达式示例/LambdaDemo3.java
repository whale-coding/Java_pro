package com.study._05实用Lambda表达式示例;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname: LambdaDemo3
 * @Date: 2024/6/7 19:52
 * @Author: 聂建强
 * @Description: 过滤
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","orange");

        // 提取出a开头的数据,常规写法
        List<String> list2 = new ArrayList<>();
        for (String s : list){
            if (s.startsWith("a")){
                list2.add(s);
            }
        }

        // 使用Lambda表达式
        List<String> list3 = list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(list3);
    }
}
