package com.study._26字节流的使用;

import java.io.*;

/**
 * @Classname: FileInputStreamDemo4
 * @Date: 2024/6/9 14:14
 * @Author: 聂建强
 * @Description:
 *     目标：字节输出流的使用。
 *
 *     IO流的体系：
 *             字节流                                   字符流
 *     字节输入流           字节输出流               字符输入流       字符输出流
 *     InputStream         OutputStream           Reader         Writer     (抽象类)
 *     FileInputStream     FileOutputStream       FileReader     FileWriter (实现类)
 *
 *     a.FileOutputStream文件字节输出流
 *         -- 作用：以内存为基准，把内存中的数据，按照字节的形式写出到磁盘文件中去。
 *                  简单来说，把内存数据按照字节写出到磁盘文件中去。
 *         -- 构造器：
 *             public FileOutputStream(File file):创建一个字节输出流管道通向目标文件对象。
 *             public FileOutputStream(String file):创建一个字节输出流管道通向目标文件路径。
 *             public FileOutputStream(File file , boolean append):创建一个追加数据的字节输出流管道通向目标文件对象。
 *             public FileOutputStream(String file , boolean append):创建一个追加数据的字节输出流管道通向目标文件路径。
 *         -- 方法：
 *            public void write(int a):写一个字节出去 。
 *            public void write(byte[] buffer):写一个字节数组出去。
 *            public void write(byte[] buffer , int pos , int len):写一个字节数组的一部分出去。
 *                         参数一，字节数组；参数二：起始字节索引位置，参数三：写多少个字节数出去。
 *     小结：
 *         字节输出流只能写字节出去。
 *         字节输出流默认是覆盖数据管道。
 *         换行用： os.write("\r\n".getBytes());
 *         关闭和刷新：刷新流可以继续使用，关闭包含刷新数据但是流就不能使用了！
 */
public class FileInputStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
         *  File file = new File("day09/src/com/study/resources/test2.txt");
         *  OutputStream outputStream = new FileOutputStream(file);
         */
        // 写数据到文件，文件会自动创建
        // 创建一个字节输出流管道与目标文件路径接通（默认是数据覆盖管道）
        OutputStream outputStream = new FileOutputStream("day09/src/com/study/resources/test2.txt");
        // 第二个参数设置为true，可以创建追加管道
        // OutputStream outputStream = new FileOutputStream("day09/src/com/study/resources/test2.txt",true);

        // 写数据到文件中
        // 1.写入一个字节
        outputStream.write('a');
        outputStream.write(97);
        // outputStream.write('张');  // 只会写出中文的第一个字节，写出去就乱码
        outputStream.write("\r\n".getBytes());  // 换行符

        // 2.写入一个字节数组（写入一个桶）
        String str = "我爱Java!";
        byte[] bytes = str.getBytes();  // 获取字节数，默认以当前代码编码(UTF-8)提取字节数
        // byte[] bytes = str.getBytes("GBK");  // 获取字节数，指定编码格式
        outputStream.write(bytes);
        outputStream.write("\r\n".getBytes());  // 换行符

        // 3.写一个字节数组的一部分出去
        outputStream.write(bytes,0,9);
        outputStream.write("\r\n".getBytes());  // 换行符

        outputStream.flush();  // 立即刷新数据到文件中去，刷新后管道可以继续使用
        outputStream.close();  // 关闭资源管道，关闭包括了刷新，关闭后管道就不能再使用了
    }
}
