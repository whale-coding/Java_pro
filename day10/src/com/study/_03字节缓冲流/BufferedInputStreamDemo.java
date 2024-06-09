package com.study._03字节缓冲流;

import java.io.*;

/**
 * @Classname: BufferedInputStreamDemo
 * @Date: 2024/6/9 18:39
 * @Author: 聂建强
 * @Description:
 *      目标：字节缓冲输入流的使用。
 *
 *                 字节流                              字符流
 *      字节输入流               字节输出流              字符输入流         字符输出流
 *      InputStream             OutputStream          Reader            Writer   (抽象类)
 *      FileInputStream         FileOutputStream      FileReader        FileWriter(实现类)
 *      BufferedInputStream     BufferedOutputStream  BufferedReader    BufferedWriter(实现类，缓冲流)
 *
 *      a.字节缓冲输入流：BufferedInputStream
 *             -- 作用：可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道,
 *                     从而提高字节输入流读数据的性能。
 *             -- 构造器: public BufferedInputStream(InputStream in)
 *             -- 原理：缓冲字节输入流管道自带了一个8KB的缓冲池，每次可以直接借用操作系统的功能最多提取8KB
 *                 的数据到缓冲池中去，以后我们直接从缓冲池读取数据，所以性能较好！
 *      小结：
 *          字节缓冲输入流：BufferedInputStream
 *          可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道,从而提高字节输入流读数据的性能。
 *          功能几乎无变化。
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 1.定义一个低级的字节输入流与源文件接通
        InputStream is = new FileInputStream("day10/src/com/study/resources/test.txt");

        // 2.把低级的字节输入流包装成一个高级的缓冲字节输入流。
        BufferedInputStream bis = new BufferedInputStream(is);

        // 3.定义一个字节数组按照循环读取。
        byte[] buffer = new byte[1024];
        int len ;
        while((len = is.read(buffer)) != -1){
            String rs = new String(buffer, 0 , len);
            System.out.print(rs);
        }
    }
}
