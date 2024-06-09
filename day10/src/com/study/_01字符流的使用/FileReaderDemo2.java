package com.study._01字符流的使用;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Classname: FileReaderDemo2
 * @Date: 2024/6/9 18:24
 * @Author: 聂建强
 * @Description:
 *      目标：字符输入流的使用-按照字符数组读取。
 *
 *      IO流的体系：
 *             字节流                                       字符流
 *      字节输入流           字节输出流               字符输入流       字符输出流
 *      InputStream         OutputStream           Reader         Writer     (抽象类)
 *      FileInputStream     FileOutputStream       FileReader     FileWriter (实现类)
 *
 *      c.FileReader:文件字符输入流。
 *          -- 作用：以内存为基准，把磁盘文件的数据以字符的形式读入到内存。
 *             简单来说，读取文本文件内容到内存中去。
 *          -- 构造器：
 *             public FileReader(File file):创建一个字符输入流与源文件对象接通。
 *             public FileReader(String filePath):创建一个字符输入流与源文件路径接通。
 *          -- 方法：
 *             public int read(): 读取一个字符的编号返回！ 读取完毕返回-1
 *             public int read(char[] buffer):读取一个字符数组，
 *                     读取多少个字符就返回多少个数量，读取完毕返回-1
 *      小结：
 *          字符流按照字符数组循环读取数据，可以解决中文读取输出乱码的问题，而且性能也较好！！
 */
public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("day10/src/com/study/resources/test.txt");

        // 按照字符数组读取内容
        char[] buffer = new char[1024];   // 1K
        int len;  // 定义一个整数记录每次桶读取的字符数据量
        while((len = fr.read(buffer)) != -1 ) {
            // 读取多少倒出多少字符
            System.out.print(new String(buffer, 0 , len));
        }

    }
}
