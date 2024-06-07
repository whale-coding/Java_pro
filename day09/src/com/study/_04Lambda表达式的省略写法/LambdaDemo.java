package com.study._04Lambda表达式的省略写法;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Classname: LambdaDemo
 * @Date: 2024/6/7 19:31
 * @Author: 聂建强
 * @Description:
 *  Lambda表达式的省略写法（进一步在Lambda表达式的基础上继续简化）
 *     （1）如果Lambda表达式的方法体代码只有一行代码。可以省略大括号不写,同时要省略分号！
 *     （2）如果Lambda表达式的方法体代码只有一行代码。可以省略大括号不写。
 *         此时，如果这行代码是return语句，必须省略return不写，同时也必须省略";"不写
 *     （3）参数类型可以省略不写。
 *     （4）如果只有一个参数，参数类型可以省略，同时()也可以省略。
 */
public class LambdaDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");

        // 遍历集合
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 简化写法1
        names.forEach((String s) ->{
            System.out.println(s);
        });

        // 简化写法2：省略参数类型
        names.forEach((s) ->{
            System.out.println(s);
        });

        // 简化写法3：省略参数类型和()
        names.forEach(s ->{
            System.out.println(s);
        });

        // 简化写法4:省略参数类型和()+省略大括号不写
        names.forEach(s -> System.out.println(s) );

        // 简化写法5：结合方法引用
        names.forEach(System.out::println);
    }
}
