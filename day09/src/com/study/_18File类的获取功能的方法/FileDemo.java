package com.study._18File类的获取功能的方法;

import java.io.File;

/**
 * @Classname: FileDemo
 * @Date: 2024/6/8 15:39
 * @Author: 聂建强
 * @Description:
 *      目标：File类的获取功能的API
 *      - public String getAbsolutePath()  ：返回此File的绝对路径名字符串。
 *      - public String getPath()  ： 获取创建文件对象的时候用的路径
 *      - public String getName()  ： 返回由此File表示的文件或目录的名称。
 *      - public long length()  ：    返回由此File表示的文件的长度。
 */
public class FileDemo {
    public static void main(String[] args) {
        // 1.绝对路径创建一个文件对象
        File f =new File("/Users/macbook/workspace/Java/study/Java_pro/day09/src/com/study/resources/test.jpg");

        // 1.1获取它的绝对路径
        System.out.println(f.getAbsolutePath());
        // 1.2获取文件定义的时候使用的路径
        System.out.println(f.getPath());
        // 1.3获取文件的名称：带后缀
        System.out.println(f.getName());
        // 1.4获取文件的大小：字节个数
        System.out.println(f.length());

        System.out.println("------------------------");

        // 2.相对路径创建一个文件对象
        File f2 = new File("day09/src/com/study/resources/test.jpg");

        // 2.1获取它的绝对路径
        System.out.println(f2.getAbsolutePath());
        // 2.2获取文件定义的时候使用的路径
        System.out.println(f2.getPath());
        // 2.3获取文件的名称：带后缀
        System.out.println(f2.getName());
        // 2.4获取文件的大小：字节个数
        System.out.println(f2.length());
    }
}
