package com.study._10方法引用方式四_构造器引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

/**
 * @Classname: ConstructorDemo
 * @Date: 2024/6/8 12:16
 * @Author: 聂建强
 * @Description:
 *    目标：方法引用有四种形式：
 *         1.静态方法的引用。
 *         2.实例方法的引用。
 *         3.特定类型方法的引用。
 *         4.构造器引用。
 *    4.构造器引用。
 *       格式是：类名::new。
 *       注意点：前后参数一致的情况下，又在创建对象就可以使用构造器引用
 *       s -> new Student(s) => Student::new
 *
 *    小结：
 *         方法引用是可遇不可求，能用则用，不能用就不要用！
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // 集合默认只能转成Object类型的数组
        Object[] objs =list.toArray();
        System.out.println("Object类型的数组："+ Arrays.toString(objs));

        // 需求：将集合转换成字符串类型的数组

        // default <T> T[] toArray(IntFunction<T[]> generator)
        String[] str = list.toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        // 使用Lambda表达式
        String[] str1 = list.toArray(s -> new String[s]);

        // 使用构造器方法引用
        String[] str2 = list.toArray(String[]::new);

        System.out.println("String类型的数组："+Arrays.toString(str2));
    }
}
