package com.study._14线程的常用API;

/**
 * @Classname: ThreadDemo2
 * @Date: 2024/6/3 12:42
 * @Author: 聂建强
 * @Description:
 *     目标：线程休眠API.
 *
 *     public static void sleep(long time): 让当前线程休眠多少毫秒再继续执行。
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);  // 让当前线程休眠1s
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
