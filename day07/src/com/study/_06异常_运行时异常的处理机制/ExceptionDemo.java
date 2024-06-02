package com.study._06异常_运行时异常的处理机制;

/**
 * @Classname: ExceptionDemo
 * @Date: 2024/6/2 22:53
 * @Author: 聂建强
 * @Description:
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。");
        try{
            chu(10 , 0);
            System.out.println("操作成功！");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("操作失败！");
        }
        System.out.println("程序结束。。。。");
    }

    public static void chu(int a , int b)  {
        System.out.println( a / b );
    }
}
