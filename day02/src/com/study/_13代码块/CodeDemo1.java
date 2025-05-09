package com.study._13代码块;

import java.util.ArrayList;

/**
 * @Classname: CodeDemo1
 * @Date: 2024/5/16 09:45
 * @Author: 聂建强
 * @Description:
 *     目标：代码块-静态代码块。
 *
 *     代码块是类的成分之一：
 *         成员变量，方法，构造器，代码块，内部类。
 *     代码块按照有无static修饰分为：
 *         1.静态代码块。
 *         2.实例代码块。
 *     静态代码块的格式：
 *         static {
 *
 *         }
 *     静态代码块特点：
 *         -- 必须有static修饰。
 *         -- 会与类一起优先加载，且自动触发执行一次。
 *     静态代码块作用：
 *         -- 可以在执行类的方法等操作之前先在静态代码块中进行静态资源的初始化操作。
 *
 *     小结：
 *         静态代码块有static修饰，与类一起加载，自动触发执行一次。
 *         静态代码块的作用：可以用于在静态代码块中进行静态资源的初始化操作。
 */
public class CodeDemo1 {
    public static String schoolName;
    public static ArrayList<String> list = new ArrayList<>();

    // 静态代码块，属于类，与类一起加载一次！
    static {
        System.out.println("静态代码块被触发执行");
        // 在静态代码块中进行静态资源的初始化操作
        schoolName = "黑马";
        list.add("3");
        list.add("4");
        list.add("5");
    }

    public static void main(String[] args) {
        System.out.println("main方法执行一次");
        System.out.println(schoolName);
        System.out.println(list);
    }
}
