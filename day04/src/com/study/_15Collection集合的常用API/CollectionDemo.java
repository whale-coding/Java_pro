package com.study._15Collection集合的常用API;

import java.util.*;

/**
 * @Classname: CollectionDemo
 * @Date: 2024/5/27 21:15
 * @Author: 聂建强
 * @Description:
 *     目标：Collection集合的常用API.
 *
 *     Collection是集合的祖宗类，它的功能是全部集合都可以继承使用的，所以要学习它。
 *     Collection API如下：
 *          - public boolean add(E e)：  把给定的对象添加到当前集合中 。
 *          - public void clear() :清空集合中所有的元素。
 *          - public boolean remove(E e): 把给定的对象在当前集合中删除。
 *          - public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
 *          - public boolean isEmpty(): 判断当前集合是否为空。
 *          - public int size(): 返回集合中元素的个数。
 *          - public Object[] toArray(): 把集合中的元素，存储到数组中
 *     小结：
 *         记住以上API。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // ArrayList:添加的元素是有序，可重复，有索引。
        Collection<String> list = new ArrayList<>();
        // 1.添加元素，添加成功返回true
        System.out.println(list.add("张三"));  // true
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);  // 集合重写了toString()方法，默认打印出内容信息

        // 2.清空集合的元素
        // list.clear();
        // System.out.println(list);

        // 3.判断集合是否为空，为空返回true，否则返回false
        System.out.println(list.isEmpty());

        // 4.获取集合的大小
        System.out.println(list.size());

        // 5.判断集合中是否包含某个元素
        System.out.println(list.contains("张三"));

        // 6.删除某个元素：如果有多个重复元素默认删除前面的第一个
        list.remove("张三");
        System.out.println(list);

        // 7.把集合转换成数组
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        String[] arr2 = list.toArray(String[]::new);  // 指定转换的数组类型
        System.out.println(Arrays.toString(arr2));

        // 8.两个集合取并集
        Collection<String> c1 = new ArrayList<>();
        c1.add("A");
        c1.add("B");
        Collection<String> c2 = new ArrayList<>();
        c1.add("C");

        c1.addAll(c2);  // 把c2集合的元素全部倒入到c1
        System.out.println(c1);
    }
}
