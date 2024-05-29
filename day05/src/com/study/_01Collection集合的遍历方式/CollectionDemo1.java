package com.study._01Collection集合的遍历方式;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Classname: CollectionDemo1
 * @Date: 2024/5/28 09:30
 * @Author: 聂建强
 * @Description:
 *     目标：Collection集合的遍历方式。
 *
 *     什么是遍历? 为什么开发中要遍历？
 *         遍历就是一个一个的把容器中的元素访问一遍。
 *         开发中经常要统计元素的总和，找最值，找出某个数据然后干掉等等业务都需要遍历。
 *
 *     Collection集合的遍历方式是全部集合都可以直接使用的，所以我们学习它。
 *     Collection集合的遍历方式有三种:
 *         （1）迭代器。
 *         （2）foreach(增强for循环)。
 *         （3）JDK 1.8开始之后的新技术Lambda表达式(了解)
 *
 *     a.迭代器遍历集合。
 *         -- 方法：
 *             public Iterator iterator(): 获取集合对应的迭代器，用来遍历集合中的元素的
 *             E next():获取下一个元素值！
 *             boolean hasNext():判断是否有下一个元素，有返回true ,反之。
 *         --流程：
 *             1.先获取当前集合的迭代器
 *                 Iterator<String> it = lists.iterator();
 *             2.定义一个while循环，问一次取一次。
 *               通过it.hasNext()询问是否有下一个元素，有就通过
 *               it.next()取出下一个元素。
 *         小结：
 *             记住！
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);  // [张三, 李四, 王五]

        // 1.得到集合的迭代器对象
        Iterator<String> it = list.iterator();
        // System.out.println(it.next());  // 张三
        // System.out.println(it.next());  // 李四
        // System.out.println(it.next());  // 王五
        // System.out.println(it.next());  // 出现没有此元素异常：NoSuchElementException

        // 2.使用while循环遍历(更推荐，可以防止越界问题)
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
