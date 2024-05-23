package com.study._03Math类的详细使用;

/**
 * @Classname: MathDemo
 * @Date: 2024/5/23 17:08
 * @Author: 聂建强
 * @Description:
 *     目标：Math类的使用。
 *
 *     Math用于做数学运算。
 *     Math类中的方法全部是静态方法，直接用类名调用即可。
 *     方法：
 *           方法名                                        说明
 *           public static int abs(int a)                  获取参数a的绝对值：
 *           public static double ceil(double a)           向上取整
 *           public static double floor(double a)          向下取整
 *           public static double pow(double a, double b)  获取a的b次幂
 *           public static long round(double a)            四舍五入取整
 *     小结：
 *         记住。
 */
public class MathDemo {
    public static void main(String[] args) {
        // 1.取绝对值：返回正数
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10.3));
        // 2.向上取整
        System.out.println(Math.ceil(4.00000001));
        // 3.向下取整
        System.out.println(Math.floor(4.99999999));
        // 4.求指数次方
        System.out.println(Math.pow(2 , 3));
        // 5.四舍五入
        System.out.println(Math.round(4.49999));
        System.out.println(Math.round(4.500001));
    }
}
