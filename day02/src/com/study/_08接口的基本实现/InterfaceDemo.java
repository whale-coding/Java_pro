package com.study._08接口的基本实现;

/**
 * @Classname: InterfaceDemo
 * @Date: 2024/5/15 18:39
 * @Author: 聂建强
 * @Description:
 *     目标：接口的基本实现。
 *
 *     接口是用来被类实现的。
 *
 *     引入：
 *         类与类是继承关系：一个类只能直接继承一个父类。
 *         类与接口是实现关系：一个类可以实现多个接口。
 *         实现接口的类称为“实现类”。
 *
 *         子类   继承   父类
 *         实现类 实现   接口
 *
 *     实现类实现接口的格式：
 *         修饰符 class 实现类名称 implements 接口1,接口2,接口3,....{
 *
 *         }
 *         implements:实现的含义。
 *         接口是可以被多实现的：一个类可以实现多个接口。
 *
 *     小结：
 *         接口是用类被实现的，实现接口的类称为实现类。
 *         实现接口的关键字是：implements。
 *         接口是可以被类多实现的。
 *         注意：一个类实现接口必须重写完接口中全部抽象方法，否则这个类必须定义成抽象类！！
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        PingPongMan zjk = new PingPongMan("张继科");
        zjk.run();
        zjk.win();
    }
}

// 实现类 实现 SportMan接口
// 一个类实现接口必须重写完接口中全部抽象方法，否则这个类必须定义成抽象类！！
class PingPongMan implements SportMan{
    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+"必须天天运动。正在跑步训练");
    }

    @Override
    public void win() {
        System.out.println(name+"参加比赛中");
    }
}

// 定义一个接口：表示运动员的规范
interface SportMan{
    void run();  // 跑步
    void win();  // 比赛得奖
}