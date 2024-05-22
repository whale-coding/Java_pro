package com.study._09内部类_局部内部类;

/**
 * @Classname: InnerClass
 * @Date: 2024/5/22 22:14
 * @Author: 聂建强
 * @Description:
 */
public class InnerClass {

    static {
        abstract class A{

        }
    }

    public static void main(String[] args) {
        class A{
            private String name;

            public void test(){

            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        A a = new A();
        a.test();
    }

    public static void test(){
        class Animal{

        }

        class Cat extends Animal{

        }
    }
}
