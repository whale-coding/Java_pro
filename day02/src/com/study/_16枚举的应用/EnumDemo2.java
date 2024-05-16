package com.study._16枚举的应用;



/**
 * @Classname: EnumDemo2
 * @Date: 2024/5/16 11:54
 * @Author: 聂建强
 * @Description:
 *     目标：枚举的作用：是为了做信息的标志和信息的分类。
 *
 *     常量做信息分类和信息标志：
 *         虽然可以实现可读性，但是入参不受限制！！！
 *
 *     Java建议做信息标志和信息分类应该使用枚举实现：最优雅的方式。
 *         可以实现可读性，而且入参受限制，不能乱输入！！！
 *
 *     小结：
 *         枚举的作用：是为了做信息的标志和信息的分类。
 */

enum Oritation{
    UP , DOWN , LEFT , RIGHT ;
}

public class EnumDemo2 {
    // public static final int UP = 0;
    // public static final int DOWN = 1;
    // public static final int LEFT = 2;
    // public static final int RIGHT = 3;
    //
    // // 控制玛丽的移动
    // public static void move(int oritation){
    //     switch (oritation){
    //         case UP:
    //             System.out.println("控制玛丽往上跳");
    //             break;
    //         case DOWN:
    //             System.out.println("控制玛丽往下跳");
    //             break;
    //         case LEFT:
    //             System.out.println("控制玛丽往左跳");
    //             break;
    //         case RIGHT:
    //             System.out.println("控制玛丽往右跳");
    //             break;
    //     }
    // }

    // 提供一个方法控制玛丽的方向。
    // 上下左右
    public static void move(Oritation o){
        switch (o){
            case UP:
                System.out.println("控制玛丽往上跳");
                break;
            case DOWN:
                System.out.println("控制玛丽往下跳");
                break;
            case LEFT:
                System.out.println("控制玛丽往左跳");
                break;
            case RIGHT:
                System.out.println("控制玛丽往右跳");
                break;
        }
    }

    public static void main(String[] args) {
        // move(UP);
        move(Oritation.RIGHT); // 方法入参只能输入枚举的4个类型！
    }
}
