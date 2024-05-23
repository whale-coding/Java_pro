package com.study._01DateFormat时间格式化类;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname: SimpleDateFormatDemo2
 * @Date: 2024/5/23 15:49
 * @Author: 聂建强
 * @Description:
 *     拓展：简单日期格式化类SimpleDateFormat格式化时间毫秒值。
 *
 *     SimpleDateFormat简单日期格式化类：
 *          包：java.text.SimpleDateFormat
 *          构造器：public SimpleDateFormat(String pattern)：指定时间的格式创建简单日期格式化对象。
 *          方法：
 *              -- public String format(Date date):可以把日期对象格式化成我们喜欢的时间形式，返回的是字符串!
 *              -- public String format(Object time):可以把时间毫秒值格式化成我们喜欢的时间形式，返回的是字符串!
 *              -- public Date parse(String date) throws ParseException:把字符串的时间解析成日期对象
 *
 *     小结：简单日期格式化类SimpleDateFormat可以直接格式化时间毫秒值
 *          public String format(Object time)
 */
public class SimpleDateFormatDemo2 {
    public static void main(String[] args) {
        // 需求：问121s后的时间是多少？(格式化输出)
        // 1.得到此刻日期对象
        Date d = new Date();
        // 2.得到当前时间的毫秒值
        long time = d.getTime()+ 121 *1000;
        // 3.格式化时间毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(time));
    }
}
