package com.study._04Map集合存储自定义类型;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname: MapDemo
 * @Date: 2024/5/31 09:43
 * @Author: 聂建强
 * @Description:
 *     目标：Map集合存储自定义类型;
 *
 *     Map集合的键和值都可以存储自定义类型。
 *
 *     小结：
 *         Map集合的键和值都可以存储自定义类型。
 *         如果希望Map集合认为自定义类型的键对象重复了，必须重写对象的hashCode()和equals()方法
 */
public class MapDemo {
    public static void main(String[] args) {
        // 自定义类型做key
        Map<Orange, String> map = new HashMap<>();
        Orange o1 = new Orange("黄橘子",20.3 , "贼便宜！");
        Orange o2 = new Orange("黑橘子",30.3 , "坏了");
        Orange o3 = new Orange("青橘子",34.3 , "9.9包邮");
        // 重写对象的hashCode()和equals()方法之后，我们就认为它是重复的。默认是地址一样才算一样
        Orange o4 = new Orange("黄橘子",20.3 , "贼便宜！");

        map.put(o1, "江西\n");
        map.put(o2 , "赣州\n");
        map.put(o3 , "广州\n");
        map.put(o4 , "广西\n");

        System.out.println(map);
    }
}
