package com.study._02Calendar日历类的详细使用;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Classname: CalendarDemo
 * @Date: 2024/5/23 16:43
 * @Author: 聂建强
 * @Description:
 *     目标：日历类Calendar的使用。
 *
 *     Calendar代表了系统此刻日期对应的日历对象。
 *     Calendar是一个抽象类，不能直接创建对象。
 *     Calendar日历类创建日历对象的语法：
 *         Calendar rightNow = Calendar.getInstance();
 *     Calendar的方法：
 *         1.public static Calendar getInstance(): 返回一个日历类的对象。
 *         2.public int get(int field)：取日期中的某个字段信息。
 *         3.public void set(int field,int value)：修改日历的某个字段信息。
 *         4.public void add(int field,int amount)：为某个字段增加/减少指定的值
 *         5.public final Date getTime(): 拿到此刻日期对象。
 *         6.public long getTimeInMillis(): 拿到此刻时间毫秒值
 *     小结：
 *         记住。
 */
public class CalendarDemo {
    public static void main(String[] args) {
        // 1.通过调用日历类的静态方法getInstance得到一个当前此刻日期对象对应的日历对象。
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow);

        // 2.获取年和月
        int year = rightNow.get(Calendar.YEAR);
        System.out.println(year);
        // 注意月份是从0开始的
        int mm = rightNow.get(Calendar.MONTH)+1;
        System.out.println(mm);

        // 3.一年中的第几天
        int days = rightNow.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);

        // 4.修改日历的信息
        rightNow.set(Calendar.YEAR , 2019);
        System.out.println(rightNow.get(Calendar.YEAR));

        // 5.日历得到此刻日期对象
        Date d = rightNow.getTime();
        System.out.println(d);

        // 6.此刻时间毫秒值
        long time = rightNow.getTimeInMillis();
        System.out.println(time);

        // 让日历往后走，比如问701天，15小时后是哪个日期
        rightNow.add(Calendar.DAY_OF_YEAR , 701);  // 让日历的一年中的第几天往后走701天
        rightNow.add(Calendar.HOUR , 15);  // 让日历的小时往后走15h
        long time1 = rightNow.getTimeInMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        System.out.println(sdf.format(time1));
    }
}
