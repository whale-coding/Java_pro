package com.study._05实用Lambda表达式示例;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname: LambdaDemo8
 * @Date: 2024/6/7 20:13
 * @Author: 聂建强
 * @Description:
 */
public class LambdaDemo8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","orange");
        List<String> list2 =new ArrayList<>();

        for (String s:list){
            if (s.startsWith("a")){
                list2.add(s.toUpperCase());
            }
        }
        Collections.sort(list2);

        // 使用Lambda表达式
        List<String> list3 = list.stream().filter(s -> s.startsWith("a"))
                .map(String:: toUpperCase).sorted().collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(list3);
    }
}
