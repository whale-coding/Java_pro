package com.study._27字节流做文件复制;

import java.io.*;

/**
 * @Classname: CopyDemo1
 * @Date: 2024/6/9 14:41
 * @Author: 聂建强
 * @Description:
 *     目标：字节流做文件复制。
 *
 *     字节流复制的思想：
 *         字节是计算机中一切文件的组成，所以
 *         字节流适合做一切文件的复制。
 *         复制是把源文件的全部字节一字不漏的转移到目标文件，只要文件前后的格式一样，绝对不会有问题。
 *
 *     需求：
 *         原文件：D:\itcast\图片资源\meinv.jpg
 *         目标文件：D:\itcast\meimei.jpg
 *     分析步骤：
 *         （1）创建一个字节输入流管道与源文件接通。
 *         （2）创建一个字节输出流与目标文件接通。
 *         （3）创建一个字节数组作为桶
 *         （4）从字节输入流管道中读取数据，写出到字节输出流管道即可。
 *         （5）关闭资源！
 */
public class CopyDemo1 {
    public static void main(String[] args) {
        InputStream is = null ;
        OutputStream os = null ;
        try {
            // 1.创建一个字节输入流管道与源文件接通
            is = new FileInputStream("day09/src/com/study/resources/test.jpg");
            // 2.创建一个字节输出流与目标文件接通
            os = new FileOutputStream("day09/src/com/study/resources/test_copy.jpg");
            // 3.创建一个字节数组作为桶
            byte[] buffer = new byte[1024];
            // 4.从字节输入流管道中读取数据，写出到字节输出流管道即可
            int len = 0;
            while((len = is.read(buffer)) != -1){
                // 读取多少就倒出多少
                os.write(buffer, 0 , len);
            }
            System.out.println("复制完成！");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 5.关闭资源！
            try {
                if (os != null) os.close();
                if (is != null) is.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
