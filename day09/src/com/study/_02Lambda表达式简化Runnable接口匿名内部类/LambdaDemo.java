package com.study._02Lambda表达式简化Runnable接口匿名内部类;

/**
 * @Classname: LambdaDemo
 * @Date: 2024/6/7 19:13
 * @Author: 聂建强
 * @Description:
 *      目标：Lambda表达式简化Runnable接口的匿名内部类写法
 *
 *      函数式接口注解@FunctionalInterface：
 *         一旦某个接口加上了这个注解，这个接口只能有且仅有一个抽象方法。
 *         这个接口就可以被Lambda表达式简化。
 */
public class LambdaDemo {
    public static void main(String[] args) {
        Thread t =new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":执行");
            }
        });
        t.start();

        // 简化写法1
        Thread t1 = new Thread(() ->{
            System.out.println(Thread.currentThread().getName()+":执行");
        });
        t1.start();

        // 简化写法2
        new Thread(() ->{
            System.out.println(Thread.currentThread().getName()+":执行");
        }).start();

        // 简化写法3：只有一条语句时，可以省略
        new Thread(() -> System.out.println(Thread.currentThread().getName()+":执行")).start();
    }
}
