package com.study._05实用Lambda表达式示例;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Classname: LambdaDemo2
 * @Date: 2024/6/7 19:49
 * @Author: 聂建强
 * @Description: 使用Lambda表达式进行集合排序
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","orange");

        // 常规排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        // 使用Lambda表达式
        Collections.sort(list,(o1,o2) -> o1.compareTo(o2));
    }
}
