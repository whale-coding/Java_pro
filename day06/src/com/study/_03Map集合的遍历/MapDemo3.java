package com.study._03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname: MapDemo3
 * @Date: 2024/5/30 15:06
 * @Author: 聂建强
 * @Description:
 *     目标：Map集合的遍历方式。
 *
 *     Map集合的遍历方式有：3种。
 *         （1）“键找值”的方式遍历：先获取Map集合全部的键，再根据键找值。
 *         （2）“键值对”的方式遍历：难度较大。
 *         （3）JDK 1.8开始之后的新技术：Lambda表达式。
 *
 *     c.JDK 1.8开始之后的新技术：Lambda表达式。（暂时了解）
 */
public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",25);
        map.put("王五",23);
        System.out.println(map);

        System.out.println("--------遍历方式3：Lambda表达式---------------");
        map.forEach((k,v) ->{
            System.out.println(k+"==>"+v);
        });
    }
}
