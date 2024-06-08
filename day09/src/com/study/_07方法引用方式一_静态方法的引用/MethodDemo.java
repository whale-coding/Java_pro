package com.study._07方法引用方式一_静态方法的引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Classname: MethodDemo
 * @Date: 2024/6/8 11:53
 * @Author: 聂建强
 * @Description:
 *    目标：方法引用有四种形式：
 *         1.静态方法的引用。
 *         2.实例方法的引用。
 *         3.特定类型方法的引用。
 *         4.构造器引用。
 *
 *    1.静态方法的引用。
 *       引用格式：
 *          类名::静态方法。
 *       简化步骤：
 *          a.定义一个静态方法，把需要简化的代码放到一个静态方法中去。
 *       静态方法引用的注意事项
 *          ” 重要：被引用的方法的参数列表要和函数式接口中的抽象方法的参数列表一致。“
 *    小结：
 *         静态方法引用的格式： 类名::静态方法。
 *         重要：被引用的方法的参数列表要和函数式接口中的抽象方法的参数列表一致,才可以引用简化！
 */
public class MethodDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("李铭",18,'男');
        Student s2 = new Student("冯龙",23,'男');
        Student s3 = new Student("王乐乐",21,'男');
        Collections.addAll(list , s1 , s2 , s3);

        // 按照年龄进行升序排序

        // 使用Lambda进行排序
        Collections.sort(list, (o1,o2) -> Student.compareByAge(o1, o2));
        // 使用静态方法引用，进一步简化。如果前后参数是一样的，而且方法是静态方法，就可以使用静态方法引用
        Collections.sort(list, Student::compareByAge);

        System.out.println(list);
    }
}
