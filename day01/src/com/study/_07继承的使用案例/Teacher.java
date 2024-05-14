package com.study._07继承的使用案例;

/**
 * @Classname: Teacher
 * @Date: 2024/5/13 22:55
 * @Author: 聂建强
 * @Description:
 */
public class Teacher extends People{
    // 特有功能
    public void teach(){
        System.out.println(getName()+"老师要授课");
    }
}
