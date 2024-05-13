package com.study._01知识回顾;

/**
 * @Classname: PackageDemo
 * @Date: 2024/5/13 19:44
 * @Author: 聂建强
 * @Description:
 *     目标：this关键字知识回顾。
 *
 *     this关键字的作用：
 *         this代表了当前对象的引用。
 *         this关键字可以用在实例方法和构造器中。
 *         this用在方法中，谁调用这个方法，this就代表谁。
 *         this用在构造器，代表了构造器正在初始化的那个对象的引用。
 */
public class ThisDemo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setName("金毛");
        System.out.println(a1.getName());

        Animal a2 = new Animal("泰迪",3,'公');
        System.out.println(a2.getName());
    }
}

class Animal{
    private String name;
    private int age;
    private char sex;

    public Animal() {
    }

    public Animal(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;  // a1.name  this有时候可以省略不写！！
    }

    public void setName(String name) {
        // 谁调用这个方法，this就代表谁!!!
        this.name = name;  //  a1.name = 金毛
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}