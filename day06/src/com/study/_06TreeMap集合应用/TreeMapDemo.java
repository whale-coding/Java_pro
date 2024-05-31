package com.study._06TreeMap集合应用;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Classname: TreeMapDemo
 * @Date: 2024/5/31 10:01
 * @Author: 聂建强
 * @Description:
 *     目标：TreeMap集合的特点和使用。
 *
 *     TreeMap集合按照键是可排序不重复的键值对集合。(默认升序)
 *     TreeMap集合按照键排序的特点与TreeSet是完全一样的。
 *     小结：
 *         TreeMap集合和TreeSet集合都是排序不重复集合
 *         TreeSet集合的底层是基于TreeMap，只是键没有附属值而已。
 *         所以TreeMap集合指定大小规则有2种方式：
 *              a.直接为对象的类实现比较器规则接口Comparable，重写比较方法（拓展方式）
 *              b.直接为集合设置比较器Comparator对象,重写比较方法
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        // 按照键默认排序
        System.out.println("---------按照键默认排序--------------");
        Map<Integer,String> map = new TreeMap<>();
        map.put(1000000,"张三");
        map.put(1000000,"张三1");
        map.put(10000,"李四");
        map.put(10,"王五");
        map.put(24244,"张麻子");

        System.out.println(map);

        // 按照键定制排序方式1：自定义引用类实现Comparable接口，重写compareTo方法
        System.out.println("---------按照键定制排序方式1：Comparable接口--------------");
        Map<Pig,String> pigs = new TreeMap<>();
        pigs.put(new Pig("佩奇",99.5 , 500.0), "荷兰");
        pigs.put(new Pig("乔治",99.4 , 605.0), "澳大利亚");
        pigs.put(new Pig("野猪",199.4 , 305.0), "山上");
        pigs.put(new Pig("野猪",199.4 , 305.0), "山上2");
        System.out.println(pigs);

        // 按照键定制排序方式2：为集合设置比较器Comparator对象,重写compare比较方法
        System.out.println("---------按照键定制排序方式2：Comparator接口--------------");
        //  public TreeMap(Comparator<? super K> comparator)
        Map<Pig,String> pigs2 = new TreeMap<>(new Comparator<Pig>() {
            @Override
            public int compare(Pig o1, Pig o2) {
                return Double.compare(o1.getWeight(),o2.getWeight());
            }
        });
        pigs2.put(new Pig("佩奇",99.5 , 500.0), "荷兰");
        pigs2.put(new Pig("乔治",99.4 , 605.0), "澳大利亚");
        pigs2.put(new Pig("野猪",199.4 , 305.0), "山上");
        pigs2.put(new Pig("野猪",199.4 , 305.0), "山上2");
        System.out.println(pigs2);
        // 说明：如果类和集合都存在比较规则，默认使用集合自带的规则(Comparator接口的compare方法)进行排序
    }
}
