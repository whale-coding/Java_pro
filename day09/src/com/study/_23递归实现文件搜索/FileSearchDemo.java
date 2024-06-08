package com.study._23递归实现文件搜索;


import java.io.File;

/**
 * @Classname: FileSearchDemo
 * @Date: 2024/6/8 16:20
 * @Author: 聂建强
 * @Description:
 *     目标：递归实现文件搜索(非规律递归)
 *
 *     需求：希望去D:/soft目录寻找出eclipse.exe文件。
 *
 *     分析：
 *         （1）定义一个方法用于做搜索。
 *         （2）进入方法中进行业务搜索分析。
 *     小结：
 *         非规律化递归应该按照业务流程开发！
 */
public class FileSearchDemo {
    public static void main(String[] args) {
        // 调用搜索方法
        searchFiles(new File("day09/src/com/study/resources/") , "test.jpg");
    }

    public static void searchFiles(File dir , String fileName){
        // 1.判断是否存在该路径，是否是文件夹
        if (dir.exists() && dir.isDirectory()){
            // 2.提取当前目录下的全部一级文件对象
            File[] files = dir.listFiles();
            // 3.判断是否存在一级文件对象（判断是否不为空目录）
            if (files != null && files.length > 0){
                // 4.判断一级文件对象
                for (File f: files){
                    // 5.判断file是文件还是文件夹
                    if (f.isFile()){
                        // 6.判断该文件是否为我要找的文件对象
                        if (f.getName().contains(fileName)){
                            // 输出文件路径，也可以进行各种操作
                            System.out.println(f.getAbsolutePath());
                        }
                    }else {
                        // 7.该文件是文件夹，文件夹要递归进入继续寻找
                        searchFiles(f, fileName);
                    }
                }
            }
        }
    }
}
