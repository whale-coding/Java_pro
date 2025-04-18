package com.study._07finally关键字;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Classname: FinallyDemo
 * @Date: 2024/6/2 22:55
 * @Author: 聂建强
 * @Description:
 *     目标：finally关键字
 *
 *     用在捕获处理的异常格式中的，放在最后面。
 *         try{
 *             // 可能出现异常的代码！
 *         }catch(Exception e){
 *             e.printStackTrace();
 *         }finally{
 *             // 无论代码是出现异常还是正常执行，最终一定要执行这里的代码！！
 *         }
 *         try: 1次。
 *         catch：0-N次  (如果有finally那么catch可以没有!!)
 *         finally: 0-1次
 *
 *     finally的作用: 可以在代码执行完毕以后进行资源的释放操作。
 *     什么是资源？资源都是实现了Closeable接口的，都自带close()关闭方法！！
 */
public class FinallyDemo {
    public static void main(String[] args) {
        // chu();
        System.out.println(chu1());
    }

    public static int chu1(){
        try {
            int a = 10/2 ;
            // System.exit(0);  // 干掉虚拟机，如果加上这句代码，a 无法返回，finally里面的代码也不会执行
            return a;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }finally {
            System.out.println("===finally被执行===");
            // return -2;  // 不建议在finally中写return，会覆盖前面所有的return值!
        }
    }

    public static void chu(){
        InputStream is = null;
        try {
            /*
             * 假如这里出了异常，那么is还没有赋值，finally里面就无法is.close(),因为会报空指针，
             * 因此需要在finally里面进行非空校验，同时还需要再进行一次异常处理。
             *
             */
            System.out.println(10 / 0);  // 可能出现异常
            is = new FileInputStream("C:/monkey.jpg");
            System.out.println(10 / 0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("===finally被执行===");
            // 回收资源。用于在代码执行完毕以后进行资源的回收操作！
            try {
                if (is != null) is.close();  // 仍然可能出现异常，需要进行异常处理（这里是try-catch）
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
