package com.study._03反射_获取Class类对象;

/**
 * @Classname: ReflectDemo
 * @Date: 2024/6/10 14:18
 * @Author: 聂建强
 * @Description:
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 反射的第一步永远是先得到类的Class文件对象: 字节码文件
        // 1.类名.class
        Class c1 = Student.class;
        System.out.println(c1);

        // 2.对象.getClass()
        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println(c2);

        // 3.Class.forName("类的全限名"),直接去加载该类的class文件
        Class c3 = Class.forName("com.study._03反射_获取Class类对象.Student");
        System.out.println(c3);

        System.out.println(c1.getSimpleName());  // 获取类名本身（简名）
        System.out.println(c1.getName());  // 获取类的全限名

        // Student s1 = (Student)c1.newInstance();  // 调用无参数构造器得到对象，方法已经被淘汰了

    }
}
