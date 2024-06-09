package com.study._09打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @Classname: PrintStreamDemo2
 * @Date: 2024/6/9 19:45
 * @Author: 聂建强
 * @Description:
 *    目标：打印流改变输出的流向。重定向。
 *
 *     System:
 *         public static void setOut(PrintStream out) :让系统的输出流向打印流。
 */
public class PrintStreamDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("==itheima0==");
        PrintStream ps = new PrintStream("day10/src/com/study/resources/log.txt");
        System.setOut(ps);  // 让系统的输出流向打印流。

        System.out.println("==itheima1==");
        System.out.println("==itheima2==");
        System.out.println("==itheima3==");
        System.out.println("==itheima4==");
        System.out.println("==itheima5==");
    }
}
