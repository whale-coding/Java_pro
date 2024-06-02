package com.study._05异常_编译时异常的处理机制;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname: ExceptionDemo2
 * @Date: 2024/6/2 22:00
 * @Author: 聂建强
 * @Description:
 *     目标：编译时异常的处理方式二。
 *
 *     方式二：在出现异常的地方自己处理，谁出现谁处理。
 *
 *     自己捕获异常和处理异常的格式：捕获处理
 *          try{
 *             // 监视可能出现异常的代码！
 *          }catch(异常类型1 变量){
 *             // 处理异常
 *          }catch(异常类型2 变量){
 *             // 处理异常
 *          }...
 *
 *     监视捕获处理异常企业级写法：
 *          try{
 *              // 可能出现异常的代码！
 *          }catch (Exception e){
 *             e.printStackTrace(); // 直接打印异常栈信息
 *          }
 *          Exception可以捕获处理一切异常类型！
 *
 *     小结：
 *         第二种方式，可以处理异常，并且出现异常后代码也不会死亡。
 *         这种方案还是可以的。
 *         但是从理论上来说，这种方式不是最好的，上层调用者不能直接知道底层的执行情况！
 */
public class ExceptionDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("程序开始");
        parseDate3("2024-06-02 21:23:22");
        System.out.println("程序结束");
    }

    // 1、可以一个异常，一个异常的捕获处理   抛出，也可以一次直接抛出Exception，即抛出最高异常(见上面的main方法)
    public static void parseDate1(String time){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(time);
            System.out.println(d);

            InputStream is = new FileInputStream("C:/monkey.jpg");
            System.out.println(is);
        }catch (FileNotFoundException e){
            e.printStackTrace();  // 打印异常栈信息
        }catch (ParseException e){
            e.printStackTrace();  // 打印异常栈信息
        }

    }

    // 2、多个异常一次捕获处理
    public static void parseDate2(String time){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(time);
            System.out.println(d);

            InputStream is = new FileInputStream("C:/monkey.jpg");
            System.out.println(is);
        }catch (FileNotFoundException | ParseException e){
            e.printStackTrace();  // 打印异常栈信息
        }
    }

    // 3、直接捕获Exception异常并进行处理
    public static void parseDate3(String time){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(time);
            System.out.println(d);

            InputStream is = new FileInputStream("C:/monkey.jpg");
            System.out.println(is);
        }catch (Exception e){
            e.printStackTrace();  // 打印异常栈信息
        }
    }
}
