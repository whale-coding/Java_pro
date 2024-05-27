package com.study._11自定义泛型方法;

/**
 * @Classname: GenericDemo
 * @Date: 2024/5/27 20:29
 * @Author: 聂建强
 * @Description:
 *     目标：自定义泛型方法。
 *
 *     什么是泛型方法？
 *         定义了泛型的方法就是泛型方法。
 *     泛型方法的定义格式:
 *         修饰符 <泛型变量> 返回值类型 方法名称(形参列表){
 *
 *         }
 *         注意：方法定义了是什么泛型变量，后面就只能用什么泛型变量。
 *         泛型类的核心思想：是把出现泛型变量的地方全部替换成传输的真实数据类型。
 *
 *     需求：给你任何一个类型的数组，都能返回它的内容。
 *
 *     小结：
 *         泛型方法和泛型类可以做通用技术架构。
 */
public class GenericDemo {
    public static void main(String[] args) {
        Integer[] nums = {10,20,30,40,50};
        String rs1 = arrToString(nums);
        System.out.println(rs1);

        String[] names = {"张三", "李四", "王五"};
        String rs2 = arrToString(names);
        System.out.println(rs2);
    }

    public static<T> String arrToString(T[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (arr != null && arr.length > 0){
            for (int i = 0; i < arr.length; i++) {
                T ele = arr[i];
                sb.append(i == arr.length-1 ? ele : ele + ",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
