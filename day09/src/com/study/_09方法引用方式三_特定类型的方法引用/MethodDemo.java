package com.study._09方法引用方式三_特定类型的方法引用;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Classname: MethodDemo
 * @Date: 2024/6/8 12:07
 * @Author: 聂建强
 * @Description:
 *       目标：方法引用有四种形式：
 *
 *       1.静态方法的引用。
 *       2.实例方法的引用。
 *       3.特定类型方法的引用。
 *       4.构造器引用。
 *
 *       3.特定类型方法的引用。
 *            特定类型：String ,任何类型。
 *            格式：特定类型::方法。
 *            注意：
 *               如果第一个参数列表中的形参中的第一个参数作为了后面的方法的调用者，
 *               并且其余参数作为后面方法的形参，那么就可以用特定类型方法引用了。
 */
public class MethodDemo {
    public static void main(String[] args) {
        String[] strs = new String[]{"James", "AA", "John",
                "Patricia","Dlei" , "Robert","Boom", "Cao" ,"black" ,
                "Michael", "Linda","cao","after","sBBB"};

        // 需求：按照元素的首字符(忽略大小写)升序排序

        // public static <T> void sort(T[] a, Comparator<? super T> c)
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);  // 按照元素的首字母（忽略大小写）比较
            }
        });

        // 使用Lambda简化
        Arrays.sort(strs, (String o1, String o2) ->{
            return o1.compareToIgnoreCase(o2);
        });

        // 使用Lambda简化(进一步简化)
        Arrays.sort(strs, (o1,o2) -> o1.compareToIgnoreCase(o2));

        // 特定方法的方法引用
        Arrays.sort(strs, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(strs));
    }
}
