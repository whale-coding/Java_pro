package com.study._14final关键字;

/**
 * @Classname: FinalDemo4
 * @Date: 2024/5/16 10:14
 * @Author: 聂建强
 * @Description:
 *      目标：final修饰实例成员变量。(了解。用不到)
 *
 *      final修饰变量的总规则：有且仅能被赋值一次。
 *      拓展：
 *         final修饰实例成员变量可以在哪些地方赋值1次：
 *             1.定义的时候赋值一次。
 *             2.可以在实例代码块中赋值一次。
 *             3.可以在每个构造器中赋值一次。
 */
public class FinalDemo4 {
    private final String name = "黑马";
    private final String name1;
    private final String name2;

    {
        // 可以在实例代码块中赋值一次
        name1 = "黑马1";
    }

    // 可以在每个构造器中赋值一次
    public FinalDemo4(){
        name2 = "黑马2";
    }
    // 注意是每个构造器中都要赋值！！！
    public FinalDemo4(String n){
        name2 = "黑马Java";
    }

    public static void main(String[] args) {
        FinalDemo4 f = new FinalDemo4();
        System.out.println(f.name);
    }
}
