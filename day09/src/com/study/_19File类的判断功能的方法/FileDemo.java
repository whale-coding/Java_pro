package com.study._19File类的判断功能的方法;

import java.io.File;

/**
 * @Classname: FileDemo
 * @Date: 2024/6/8 15:54
 * @Author: 聂建强
 * @Description:
 *      目标：File类的判断功能的方法
 *      - public boolean exists() ：此File表示的文件或目录是否实际存在。
 *      - public boolean isDirectory()：此File表示的是否为目录。
 *      - public boolean isFile() ：此File表示的是否为文件
 */
public class FileDemo {
    public static void main(String[] args) {
        // 创建一个文件对象
        File f = new File("day09/src/com/study/resources/test.jpg");

        // 1判断文件路径是否存在
        System.out.println(f.exists());
        // 2.判断文件对象是否是文件,是文件返回true，反之返回false
        System.out.println(f.isFile());
        // 3.判断文件对象是否是文件夹,是文件夹返回true，反之返回false
        System.out.println(f.isDirectory());
    }
}
