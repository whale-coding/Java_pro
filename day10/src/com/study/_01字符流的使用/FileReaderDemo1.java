package com.study._01字符流的使用;

import java.io.*;

/**
 * @Classname: FileReaderDemo1
 * @Date: 2024/6/9 18:18
 * @Author: 聂建强
 * @Description:
 */
public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         *  // 创建一个文件对象定位源文件
         *  File f = new File("day10/src/com/study/resources/test.txt");
         *  // 创建一个字符输入流管道与源文件接通
         *  Reader fr = new FileReader(f);
         */
        // 简化写法：创建一个字符输入流管道与源文件路径接通
        Reader fr = new FileReader("day10/src/com/study/resources/test.txt");

        // 按照字符读取，每次读取一个字符的编号返回
        int code1 = fr.read();
        // System.out.println(code1);
        System.out.print((char)code1);

        // while循环一个一个字符读取
        int ch ;  // 定义一个变量存储一个字符的编号
        while ((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }

    }
}
