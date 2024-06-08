package com.study._22递归的概述和应用理论;

/**
 * @Classname: RecursionDemo3
 * @Date: 2024/6/8 16:15
 * @Author: 聂建强
 * @Description:
 *     拓展：递归的核心思想-公式转换
 *
 *     已知： f(x) = f(x + 1) + 2
 *           f(1) = 1
 *     求：   f(10) = ?
 *
 *     公式转换：
 *         f(n-1) = f(n-1+1)+2
 *         f(n-1) = f(n)+2
 *         f(n) = f(n-1)- 2 ;
 *
 *     递归算法的三要素：
 *          （1）递归的公式：   f(n) = f(n-1)- 2 ;
 *          （2）递归的终结点：  f(1) = 1
 *          （3）递归的方向：必须走向终结点。
 *     小结：
 *         必须满足三要素，否则递归会出现死亡！
 */
public class RecursionDemo3 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    // 递归方法
    public static int f(int n){
        if (n ==1){
            return 1;
        }else {
            return f(n-1) -2;
        }
    }
}
