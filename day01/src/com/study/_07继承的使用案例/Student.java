package com.study._07继承的使用案例;

/**
 * @Classname: Student
 * @Date: 2024/5/13 22:55
 * @Author: 聂建强
 * @Description:
 */
public class Student extends People{
    // 特有功能
    public void study(){
        System.out.println(getName()+"学生认真学习~~~");
    }
}
