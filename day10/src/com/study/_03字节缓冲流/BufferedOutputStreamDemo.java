package com.study._03字节缓冲流;

import java.io.*;

/**
 * @Classname: BufferedOutputStreamDemo
 * @Date: 2024/6/9 18:42
 * @Author: 聂建强
 * @Description:
 *      目标：字节缓冲输出流的使用。
 *
 *                 字节流                              字符流
 *      字节输入流               字节输出流              字符输入流         字符输出流
 *      InputStream             OutputStream          Reader            Writer   (抽象类)
 *      FileInputStream         FileOutputStream      FileReader        FileWriter(实现类)
 *      BufferedInputStream     BufferedOutputStream  BufferedReader    BufferedWriter(实现类，缓冲流)
 *
 *      字节缓冲输出流：BufferedOutputStream
 *          -- 作用：可以把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能。
 *          -- 构造器：public BufferedOutputStream(OutputStream os)
 *          -- 原理：缓冲字节输出流自带了8KB缓冲池,数据就直接写入到缓冲池中去，性能极高了！
 *      小结：
 *             字节缓冲输出流可以把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能。
 *             功能几乎不变。
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 1.写一个原始的字节输出流
        OutputStream os = new FileOutputStream("day10/src/com/study/resources/test.txt");

        // 2.把低级的字节输出流包装成一个高级的缓冲字节输出流
        BufferedOutputStream bos =  new BufferedOutputStream(os);

        // 3.写数据出去
        bos.write('a');
        bos.write(100);
        bos.write('b');
        bos.write("我爱中国".getBytes());

        bos.close();
    }
}
