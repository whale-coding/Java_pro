package com.study._13代码块;

/**
 * @Classname: CodeDemo2
 * @Date: 2024/5/16 10:06
 * @Author: 聂建强
 * @Description:
 *     目标：代码块-实例代码块。
 *
 *     实例代码块的格式：
 *          {
 *
 *          }
 *
 *     实例代码块的特点：
 *         -- 无static修饰。
 *         -- 会与类的对象一起加载，每次创建类的对象的时候，
 *             实例代码块都会被加载且自动触发执行一次。
 *         -- 实例代码块的代码在底层实际上是提取到每个构造器中去执行的！
 *
 *     实例代码块的作用：
 *         -- 实例代码块可以在创建对象之前进行实例资源的初始化操作。
 *
 *     小结：
 *         实例代码块无static修饰,属于对象，与对象一起加载执行。
 *         实例代码块的代码在底层实际上是提取到每个构造器中去执行的！
 *         实例代码块可以在创建对象之前进行实例资源的初始化操作。
 */
public class CodeDemo2 {
    private String name;  // 实例变量
    {
        System.out.println("实例代码块执行一次");
        name = "黑马";
    }

    public static void main(String[] args) {
        CodeDemo2 c1 =new CodeDemo2();
        CodeDemo2 c2 = new CodeDemo2();

        System.out.println(c1.name);
        System.out.println(c2.name);

    }
}
