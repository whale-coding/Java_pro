package com.study._14Date日期类;

import java.util.Date;

/**
 * @Classname: DateDemo2
 * @Date: 2024/5/23 15:21
 * @Author: 聂建强
 * @Description:
 *     拓展：时间毫秒值的作用。
 *
 *     时间毫秒值可以用于做时间的计算：例如代码的执行性能分析。
 */
public class DateDemo2 {
    public static void main(String[] args) {
        // 1.拿到此刻日期时间对象的毫秒数
        long startTime = new Date().getTime();
        for (int i = 1; i < 1000000; i++) {
            System.out.println("输出："+i);
        }
        // 2.拿到此刻日期时间对象的毫秒数
        long endTime = new Date().getTime();

        // 时间差值：代码执行所话费的时间
        System.out.println((endTime-startTime) / 1000.0+"s");
    }
}
