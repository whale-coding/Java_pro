package com.study._17File类的概述;

import java.io.File;

/**
 * @Classname: FileDemo
 * @Date: 2024/6/8 13:53
 * @Author: 聂建强
 * @Description:
 *     目标：File类的概述和API
 *
 *     File类：代表操作系统的文件对象。
 *     File类：是用来操作操作系统的文件对象的，删除文件，获取文件信息，创建文件（文件夹）...
 *     广义来说操作系统认为文件包含（文件和文件夹）
 *
 *     File类的创建文件对象的API:
 *          包：java.io.File
 *         （1）构造器：
 *             -- public File(String pathname):根据路径获取文件对象
 *             -- public File(String parent , String child):根据父路径和文件名称获取文件对象！
 *             -- public File(File parent , String child)
 *
 *     File类创建文件对象的格式:
 *         a.File f = new File("绝对路径/相对路径");
 *             绝对路径：从磁盘的的盘符一路走到目的位置的路径。
 *                 -- 绝对路径依赖具体的环境，一旦脱离环境，代码可能出错！！
 *                 -- 一般是定位某个操作系统中的某个文件对象。
 *             相对路径：不带盘符的。（重点）
 *                 -- 默认是直接相对到工程目录下寻找文件的。
 *                 -- 相对路径只能用于寻找工程下的文件。
 *                 -- 能用相对路径就应该尽量使用，可以跨平台！
 *
 *         b.File f = new File("文件对象/文件夹对象");
 *             广义来说：文件是包含文件和文件夹的。
 *     小结：
 *         创建文件对象可以用绝对路径也可以用相对路径。
 *         相对路径只能用于寻找工程下的文件。
 *         文件对象可以表示文件也可以表示文件夹！
 */
public class FileDemo {
    public static void main(String[] args) {
        // 1.创建文件对象：使用绝对路径
        /*
         *  文件路径分隔符：
         *      -1.使用正斜杠： /
         *      -2.使用反斜杠： \\
         *      -3.使用分隔符API:File.separator
         */
        File f =new File("/Users/macbook/workspace/Java/study/Java_pro/day09/src/com/study/resources/test.jpg");
        File f2 = new File("D:\\it\\图片资源\\beautiful.jpg");
        File f3 = new File("D:"+File.separator+"it"+File.separator+"图片资源"+File.separator+"beautiful.jpg");

        System.out.println(f.length());  // 获取文件的大小，字节大小

        // 2.创建文件对象：使用相对路径
        File f4 = new File("day09/src/com/study/resources/test.jpg");
        System.out.println(f4.length());

        // 3.创建文件对象：代表文件夹
        File f5 = new File("day09/src/com/study/resources/");

        System.out.println(f5.exists());  // 判断路径是否存在
    }
}
