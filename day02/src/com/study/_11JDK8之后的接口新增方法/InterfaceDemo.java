package com.study._11JDK8之后的接口新增方法;

/**
 * @Classname: InterfaceDemo
 * @Date: 2024/5/15 23:22
 * @Author: 聂建强
 * @Description:
 *     目标：JDK 1.8开始之后接口新增的三种方法（理解语法，属于Java自己的技术）
 *
 *     引入：
 *         JDK 1.8之前接口中只能是抽象方法，常量。
 *         JDK 1.8开始之后接口不再纯洁了。
 *         JDK 1.8开始之后接口新增了如下三种方法。
 *
 *     a.默认方法（就是之前写的普通实例方法）
 *         -- 必须用default修饰，默认会public修饰
 *         -- 必须用接口的实现类的对象来调用。
 *
 *     b.静态方法
 *         -- 默认会public修饰
 *         -- 注意：接口的静态方法必须用接口的类名本身来调用。
 *
 *     c.私有方法（就是私有的实例方法）: JDK 1.9才开始有的。
 *         -- 只能在本类中被其他的默认方法或者私有方法访问。
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        // 1、默认方法调用：必须用接口的实现类对象调用。
        PingPongMan zjk = new PingPongMan();
        zjk.run();

        // 2.接口的静态方法必须用接口的类名本身来调用。
        SportMan.inAddr();
    }
}

class PingPongMan implements SportMan{

}

interface SportMan{
    // 1、默认方法：其实就是我们之前写的实例方法
    // 只能用接口的实现类的对象来调用
    default void run(){
        go();
        System.out.println("开始跑步");
    }

    // 2、静态方法：可以直接加static修饰。默认会加public修饰。
    // 接口的静态方法只能用接口的类名称本身调用。
    static void inAddr(){
        System.out.println("我在安徽合肥");
    }

    // 3、私有方法：私有的实例方法，只能在本接口中被访问
    // 私有方法通常是给私有方法或者默认方法调用的
    private void go(){
        System.out.println("开始");
    }
}