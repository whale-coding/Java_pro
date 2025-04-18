package com.study._16枚举的应用;

/**
 * @Classname: EnumDemo1
 * @Date: 2024/5/16 11:41
 * @Author: 聂建强
 * @Description:
 *     目标：枚举的概述和作用。
 *
 *     枚举是Java中的一种特殊类型。
 *     枚举的作用：是为了做信息的标志和信息的分类。
 *
 *     定义枚举的格式：
 *         修饰符 enum 枚举名称{
 *             第一行都是罗列枚举实例的名称。
 *         }
 *     枚举类的编译以后源代码：
 *          public final class Season extends java.lang.Enum<Season> {
 *              public static final Season SPRING = new Season();
 *              public static final Season SUMMER = new Season();
 *              public static final Season AUTUMN = new Season();
 *              public static final Season WINTER = new Season();
 *
 *              public static Season[] values();
 *              public static Season valueOf(java.lang.String);
 *          }
 *     枚举的特点：
 *          1.枚举类是用final修饰的，枚举类不能被继承！
 *          2.枚举类默认继承了java.lang.Enum枚举类。
 *          3.枚举类的第一行都是常量,存储都是枚举类的对象。
 *          4.枚举类的第一行必须是罗列枚举类的实例名称。
 *          所以：枚举类相当于是多例设计模式。
 *     小结：
 *          枚举类的特点：
 *          1.枚举类是用final修饰的，枚举类不能被继承！
 *          2.枚举类默认继承了java.lang.Enum枚举类。
 *          3.枚举类的第一行都是常量,存储都是枚举类的对象。
 *          4.枚举类的第一行必须是罗列枚举类的实例名称。
 *          所以：枚举类相当于是多例设计模式。
 */
public class EnumDemo1 {
    public static void main(String[] args) {
        Sex s1 =Sex.BOY;
        Sex s2 =Sex.GIRL;

        System.out.println(s1);  // BOY
        System.out.println(s2);  // GIRL
        System.out.println(s1.ordinal());  // 0 枚举对象的索引位置
        System.out.println(s2.ordinal());  // 1 枚举对象的索引位置
    }
}

// 枚举类的格式
enum Sex{
    BOY, GIRL;
}

// 枚举类的格式
enum Season{
    SPRING , SUMMER , AUTUMN , WINTER;
}