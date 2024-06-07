package com.study._03Lambda简化Comparator接口匿名内部类写法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Classname: CollectionsDemo
 * @Date: 2024/6/7 19:24
 * @Author: 聂建强
 * @Description:
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("李铭",18,'男');
        Student s2 = new Student("冯龙",23,'男');
        Student s3 = new Student("王乐乐",21,'男');
        Collections.addAll(list , s1 , s2 , s3);

        // 按照年龄进行升序排序！
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // 简化写法1
        Collections.sort(list, (Student o1, Student o2) ->{
            return o1.getAge() - o2.getAge();
        });

        // 简化写法2:只有一条语句时，可以省略
        Collections.sort(list,(Student o1, Student o2) -> o1.getAge() - o2.getAge());

        // 简化写法3:参数类型可以省略
        Collections.sort(list,(t1,t2) -> t1.getAge() - t2.getAge());

        System.out.println(list);
    }
}
