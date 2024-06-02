package com.study._05异常_编译时异常的处理机制;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname: ExceptionDemo3
 * @Date: 2024/6/2 22:00
 * @Author: 聂建强
 * @Description:
 *     目标：编译时异常的处理方式三。
 *
 *     方式三： 在出现异常的地方把异常一层一层的抛出给最外层调用者，
 *             最外层调用者集中捕获处理！！（规范做法）
 *
 *     小结：
 *         编译时异常的处理方式三：底层出现的异常抛出给最外层调用者集中捕获处理。
 *         这种方案最外层调用者可以知道底层执行的情况，同时程序在出现异常后也不会立即死亡，这是
 *         理论上最好的方案。
 *
 *         虽然异常有三种处理方式，但是开发中只要能解决你的问题，每种方式都有可能用到!!
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            parseDate("2024-06-02 21:23:22");
            System.out.println("功能成功执行");
        }catch (Exception e){
            e.printStackTrace();  // 打印异常栈信息
            System.out.println("功能执行失败");
        }
        System.out.println("程序结束");
    }

    // 可以拦截所有异常
    public static void parseDate(String time) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(time);
        System.out.println(d);

        InputStream is = new FileInputStream("C:/monkey.jpg");
        System.out.println(is);
    }
}
