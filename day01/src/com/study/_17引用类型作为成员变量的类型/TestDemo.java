package com.study._17引用类型作为成员变量的类型;

/**
 * @Classname: TestDemo
 * @Date: 2024/5/14 16:47
 * @Author: 聂建强
 * @Description:
 * 目标：引用类型作为成员变量的类型（复合类型）。
 */
public class TestDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(19);
        Address addr = new Address("110","北京市东城区",98,98);
        s.setAddress(addr);

        Address address = s.getAddress();
        System.out.println(address.getCode()+"--->"+address.getName());
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
