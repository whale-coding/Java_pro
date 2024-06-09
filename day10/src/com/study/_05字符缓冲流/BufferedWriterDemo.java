package com.study._05字符缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Classname: BufferedWriterDemo
 * @Date: 2024/6/9 19:05
 * @Author: 聂建强
 * @Description:
 *      目标：字符缓冲输出流的使用。
 *
 *             字节流                              字符流
 *      字节输入流               字节输出流              字符输入流         字符输出流
 *      InputStream             OutputStream          Reader            Writer   (抽象类)
 *      FileInputStream         FileOutputStream      FileReader        FileWriter(实现类)
 *      BufferedInputStream     BufferedOutputStream  BufferedReader    BufferedWriter(实现类，缓冲流)
 *
 *      字符缓冲输出流：BufferedWriter
 *             -- 作用：把字符输出流包装成一个高级的缓冲字符输出流，提高写字符数据的性能。
 *             -- 构造器：public BufferedWriter(Writer writer):
 *             -- 原理：高级的字符缓冲输出流多了一个8k的字符缓冲池，写数据性能极大提高了!
 *             -- 字符缓冲输出流除了提高字符输出流写数据的性能，还多了一个换行的特有功能：
 *                  public void newLine()：新建一行。
 *      小结：
 *         缓冲字符输出流可以把低级的字符输出流进行包装。提高了写字符的性能。
 *         多了一个换行的功能：public void newLine()：新建一行。
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        // 1.定义一个低级的字符输出流写数据出去(默认是数据覆盖管道),这里创建的是追加管道
        Writer fw = new FileWriter("day10/src/com/study/resources/test.txt",true);

        // 2.把低级的字符输出流包装成高级的缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(fw);

        // 3.写字符输出
        bw.write("我在黑马学IO流~~~~");
        bw.newLine();  // 换行
        bw.write("我在黑马学IO流~~~~");
        bw.newLine();  // 换行

        // 关闭流
        bw.close();

    }
}
