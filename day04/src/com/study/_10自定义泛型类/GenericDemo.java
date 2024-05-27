package com.study._10自定义泛型类;

import java.util.ArrayList;

/**
 * @Classname: GenericDemo
 * @Date: 2024/5/27 20:23
 * @Author: 聂建强
 * @Description:
 *     目标：自定义泛型类。
 *
 *     引入：
 *         我们之前用的泛型都是别人写好的，接下来我们来自定义泛型类使用。
 *
 *     泛型类的概念：
 *         使用了泛型定义的类就是泛型类。
 *
 *     泛型类的格式：
 *         修饰符 class 类名<泛型变量>{
 *
 *         }
 *         泛型变量建议使用 E , T , K , V
 *
 *     需求：模拟ArrayList集合自定义一个集合MyArrayList集合。
 *     泛型类的核心思想：是把出现泛型变量的地方全部替换成传输的真实数据类型。
 *
 *     小结：
 *         自定义泛型的核心思想：是把出现泛型变量的地方全部替换成传输的真实数据类型。
 */
public class GenericDemo {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList();
        list.add("java");
        list.add("c++");
        // list.add(12);  // 添加失败，因为不是String类型，不符合泛型要求！
        list.remove("java");
        System.out.println(list);
    }
}


class MyArrayList<E>{
    private ArrayList lists = new ArrayList();

    public void add(E e){
        lists.add(e);
    }

    public void remove(E e){
        lists.remove(e);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}