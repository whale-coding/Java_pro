package com.study._14final关键字;

/**
 * @Classname: FinalDemo3
 * @Date: 2024/5/16 10:14
 * @Author: 聂建强
 * @Description:
 *     目标：final修饰静态成员变量。
 *
 *     final修饰变量的总规则：有且仅能被赋值一次。
 *     final修饰静态成员变量，变量变成了常量。
 *     常量：有public static final修饰，名称字母全部大写，多个单词用下划线连接。
 *
 *     拓展：
 *         final修饰静态成员变量可以在哪些地方赋值一次：
 *         1.定义的时候赋值一次。
 *         2.可以在静态代码块中赋值一次。
 */
public class FinalDemo3 {
    // 常量
    public static final String SCHOOL_NAME = "黑马" ;
    public static final String SCHOOL_NAME1;

    static {
        SCHOOL_NAME1 = "黑马1";
        // SCHOOL_NAME1 = "黑马2"; // 报错，第二次赋值！
    }

    public static void main(String[] args) {
        // SCHOOL_NAME = "传智播客" ;  // 报错，第二次赋值
    }
}
