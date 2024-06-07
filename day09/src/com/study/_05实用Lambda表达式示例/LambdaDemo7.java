package com.study._05实用Lambda表达式示例;

import java.util.Optional;

/**
 * @Classname: LambdaDemo7
 * @Date: 2024/6/7 20:11
 * @Author: 聂建强
 * @Description:
 */
public class LambdaDemo7 {
    public static void main(String[] args) {
        String str = "hello world";
        if (str != null){
            System.out.println(str.toUpperCase());
        }

        // 使用Lambda表达式
        Optional.ofNullable(str).map(String::toUpperCase).ifPresent(System.out::println);
    }
}
