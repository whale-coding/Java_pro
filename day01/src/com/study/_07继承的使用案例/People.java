package com.study._07继承的使用案例;

/**
 * @Classname: People
 * @Date: 2024/5/13 22:52
 * @Author: 聂建强
 * @Description:
 */
public class People {
    private String name;
    private int age;

    // 通用的方法
    public void eat(){
        System.out.println(name+",在吃饭！");
    }

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
