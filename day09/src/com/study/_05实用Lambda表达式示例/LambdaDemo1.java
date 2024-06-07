package com.study._05实用Lambda表达式示例;

import java.util.Arrays;
import java.util.List;

/**
 * @Classname: LambdaDemo1
 * @Date: 2024/6/7 19:44
 * @Author: 聂建强
 * @Description: 使用Lambda表达式进行集合遍历
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","orange");

        // 常规遍历
        for (String fruit : list){
            System.out.println(fruit);
        }

        // 使用Lambda表达式
        list.forEach(fruit -> System.out.println(fruit));
    }
}
