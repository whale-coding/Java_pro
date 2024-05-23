package com.study._14Date日期类;

import java.util.Date;

/**
 * @Classname: DateDemo3
 * @Date: 2024/5/23 15:24
 * @Author: 聂建强
 * @Description:
 *     目标:Date类的有参数构造器的使用。
 *
 *     构造器：
 *          -- public Date():创建当前系统的此刻日期时间对象。
 *          -- public Date(long time):把时间毫秒值转换成日期对象。
 *     流程：
 *         Date日期对象 -> getTime() -> 时间毫秒值
 *         时间毫秒值 -> new Date(时间毫秒值) -> Date日期对象
 *     小结：
 *         public Date(long time):把时间毫秒值转换成日期对象。
 */
public class DateDemo3 {
    public static void main(String[] args) {
        // 需求：问121s以后的时间是多少？
        // 1.拿到此刻日期对象
        Date d = new Date();
        // 2.拿到此刻日期对象的时间毫秒值 往后加121s
        long time = d.getTime() + 121*1000;
        // 3.把时间毫秒值转换成日期对象
        Date d2 = new Date(time);
        System.out.println(d2);
    }
}
