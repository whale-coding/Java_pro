package com.study._05实用Lambda表达式示例;

import java.util.Arrays;
import java.util.List;

/**
 * @Classname: LambdaDemo5
 * @Date: 2024/6/7 20:01
 * @Author: 聂建强
 * @Description: 归约
 */
public class LambdaDemo5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum =0;
        for (Integer v:list){
            sum += v;
        }
        System.out.println(sum);

        // 使用Lambda表达式
        int num2 =list.stream().reduce(0,(a,b) -> a+b);
        System.out.println(num2);
    }
}
