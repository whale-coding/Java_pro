package com.study._03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Classname: MapDemo1
 * @Date: 2024/5/30 15:06
 * @Author: 聂建强
 * @Description:
 *     目标：Map集合的遍历方式。
 *
 *     Map集合的遍历方式有：3种。
 *         （1）“键找值”的方式遍历：先获取Map集合全部的键，再根据遍历键找值。
 *         （2）“键值对”的方式遍历：难度较大。
 *         （3）JDK 1.8开始之后的新技术：Lambda表达式。（暂时了解）
 *
 *     a.“键找值”的方式遍历Map集合。
 *         1.先获取Map集合的全部键的Set集合。
 *         2.遍历键的Set集合，然后通过键找值。
 *     小结：
 *         代码简单，需要记住!
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",25);
        map.put("王五",23);
        System.out.println(map);

        System.out.println("--------遍历方式1：键找值---------------");
        // a.获取当前Map集合的全部键的集合
        Set<String> keys = map.keySet();
        // b.通过遍历键然后通过键取对应的值
        for (String key : keys){
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
