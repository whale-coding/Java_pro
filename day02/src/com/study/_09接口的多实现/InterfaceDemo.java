package com.study._09接口的多实现;

/**
 * @Classname: InterfaceDemo
 * @Date: 2024/5/15 23:10
 * @Author: 聂建强
 * @Description:
 *      目标：接口的多实现介绍。
 *
 *      实现类实现接口的格式：
 *          修饰符 class 实现类名称 implements 接口1,接口2,接口3,....{
 *
 *          }
 *
 *      类与类是单继承。
 *      类与接口是多实现。
 *
 *     小结：
 *         一个类可以实现多个接口。
 *         一个类如果实现了多个接口，必须重写完全部接口中的全部抽象方法
 *         否则这个类必须定义抽象类。
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        BasketBall yaoMing = new BasketBall();
        yaoMing.rule();
        yaoMing.rule();
        yaoMing.win();
    }
}

class BasketBall implements SportMan, Law{

    @Override
    public void rule() {

    }

    @Override
    public void run() {

    }

    @Override
    public void win() {

    }
}

interface Law{
    void rule();
    void run();
}

interface  SportMan{
    void run();
    void win();
}