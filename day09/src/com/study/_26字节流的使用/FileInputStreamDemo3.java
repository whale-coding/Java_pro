package com.study._26字节流的使用;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname: FileInputStreamDemo3
 * @Date: 2024/6/9 14:06
 * @Author: 聂建强
 * @Description:
 *     拓展：解决字节输入流读取中文内容输出乱码的问题。
 *
 *     引入：
 *         一个一个字节读取中文输出
 *         一个一个字节数组读取中文输出均无法避免乱码。
 *     如何实现读取可以避免乱码呢？
 *         1.定义一个字节数组与文件的大小刚刚一样大，然后一桶水读取全部字节数据再输出！
 *     小结：
 *         定义一个字节数组与文件的大小刚刚一样大，然后一桶水读取全部字节数据再输出！
 *         可以避免中文读取输出乱码，但是如果读取的文件过大，会出现内存溢出！！
 *
 *         字节流并不适合读取文本文件内容输出，读写文件内容建议使用字符流。
 */
public class FileInputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("day09/src/com/study/resources/test.txt");

        // 将桶的大小设置为文件所有内容的字节大小，可以避免乱码
        byte[] buffer = is.readAllBytes();
        String rs = new String(buffer);
        System.out.println(rs);
    }
}
