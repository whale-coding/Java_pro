package com.study._01知识回顾;

/**
 * @Classname: ClassDemo01
 * @Date: 2024/5/13 19:29
 * @Author: 聂建强
 * @Description:
 *
 *    目标：知识回顾。
 *
 *     面向对象：
 *         用代码去高度模拟现实世界，以便为人类的业务服务。
 *         Java是一种面向对象的高级编程语言。
 *         高级编程语言：代码风格很像人类的自然语言。
 *         zhubajie.eat("西瓜");
 *     面向对象最重要的两个概念：类和对象。
 *
 *     类：是描述相同事物的共同特征的抽象。 人类。
 *     对象：是具体存在的实例，是真实的。  实例==对象。
 *
 *     在代码层面：必须先有类，才能创建出对象。
 *
 *     定义类的格式：
 *         修饰符 class 类名{
 *             // 1.成员变量（Field：描述类和对象的属性信息的）.
 *             // 2.成员方法（Method:描述类或者对象的行为信息的）
 *             // 3.构造器（Constructor:初始化一个类的对象并返回引用）
 *             // 4.代码块
 *             // 5.内部类
 *         }
 *         注意：
 *            -- 类名的首字母应该大写，满足“驼峰写法”。
 *            -- 一个Java代码文件中可以定义多个类。但是只能有一个类
 *              是用public修饰的，而且public修饰的类名必须成为代码的文件名称。
 *
 *     类中的成分研究：
 *         类中有且仅有五大成分（五大金刚）
 *         1.成员变量（Field：描述类和对象的属性信息的）.
 *         2.成员方法（Method:描述类或者对象的行为信息的）
 *         3.构造器（Constructor:初始化一个类的对象并返回引用）
 *         4.代码块
 *         5.内部类
 *         注意：只要不是这5大成分放在类下就会报错.
 *
 *     构造器的复习:
 *         作用：初始化一个类的对象并返回引用。
 *         格式：
 *             修饰符 类名(形参){
 *
 *             }
 *         构造器初始化对象的格式：
 *             类名 对象名称 = new 构造器;
 *         注意：一个类默认会自带一个无参数构造器，即使不写它也存在，但是如果一个类
 *             它写了一个构造器，那么默认的无参数构造器就被覆盖了!!
 *     小结：
 *         类的5大成分
 *         构造器的作用。
 */
public final class ClassDemo {
    public static void main(String[] args) {
        Student student = new Student();
    }
}

class Student{

}