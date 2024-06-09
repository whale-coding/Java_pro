package com.study._26字节流的使用;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Classname: OutputStreamDemo5
 * @Date: 2024/6/9 14:16
 * @Author: 聂建强
 * @Description:
 *     目标：字节输出流的使用-追加数据管道。
 *
 *     IO流的体系：
 *             字节流                                   字符流
 *     字节输入流           字节输出流               字符输入流       字符输出流
 *     InputStream         OutputStream           Reader         Writer     (抽象类)
 *     FileInputStream     FileOutputStream       FileReader     FileWriter (实现类)
 *
 *     FileOutputStream字节输出流每次启动写数据的时候都会先清空之前的全部数据，从新写入。
 *     小结：
 *         覆盖数据管道： OutputStream os = new FileOutputStream("Day09Demo/out05");
 *         追加数据的管道：OutputStream os = new FileOutputStream("Day09Demo/out05" , true);
 *                  参数二代表了此管道是追加数据的管道，不会覆盖之前的数据！
 */
public class OutputStreamDemo5 {
    public static void main(String[] args) throws IOException {
        // 创建一个字节输出流管道与目标文件路径接通（默认是数据覆盖管道）
        // OutputStream outputStream = new FileOutputStream("day09/src/com/study/resources/test2.txt");

        // 第二个参数设置为true，可以创建追加管道
        OutputStream outputStream = new FileOutputStream("day09/src/com/study/resources/test2.txt",true);

        // 写入一个字节数组（写入一个桶）
        String str = "我爱Java!";
        byte[] bytes = str.getBytes();  // 获取字节数
        outputStream.write(bytes);
        outputStream.write("\r\n".getBytes());  // 换行符

        outputStream.close();  // 关闭资源管道
    }
}
