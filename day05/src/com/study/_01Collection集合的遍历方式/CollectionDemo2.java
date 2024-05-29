package com.study._01Collection集合的遍历方式;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Classname: CollectionDemo2
 * @Date: 2024/5/28 09:38
 * @Author: 聂建强
 * @Description:
 *      目标：Collection集合的遍历方式。
 *
 *      什么是遍历? 为什么开发中要遍历？
 *      遍历就是一个一个的把容器中的元素访问一遍。
 *      开发中经常要统计元素的总和，找最值，找出某个数据然后干掉等等业务都需要遍历。
 *
 *      Collection集合的遍历方式是全部集合都可以直接使用的，所以我们学习它。
 *      Collection集合的遍历方式有三种:
 *          （1）迭代器。
 *          （2）foreach(增强for循环)。
 *          （3）JDK 1.8开始之后的新技术Lambda表达式。
 *
 *      b.foreach(增强for循环)遍历集合。
 *          foreach是一种遍历形式，可以遍历集合或者数组。
 *          foreach遍历集合实际上是迭代器遍历的简化写法。
 *          foreach遍历的关键是记住格式：
 *             for(被遍历集合或者数组中元素的类型 变量名称 : 被遍历集合或者数组){
 *
 *             }
 *         小结：
 *             foreach遍历集合或者数组很方便。
 *             缺点：foreach遍历无法知道遍历到了哪个元素了，因为没有索引。
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);  // [张三, 李四, 王五]
        // foreach遍历
        for (String ele:list){
            System.out.println(ele);
        }

        // foreach也可以遍历数组
        int[] ages = new int[]{17,18,33,23};
        for (Integer age:ages){
            System.out.println(age);
        }
    }
}
