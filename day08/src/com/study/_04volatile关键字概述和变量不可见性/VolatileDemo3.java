package com.study._04volatile关键字概述和变量不可见性;

/**
 * @Classname: VolatileDemo3
 * @Date: 2024/6/6 15:51
 * @Author: 聂建强
 * @Description:
 *      目标：volatile与synchronized的区别
 *      结论：
 *          1、volatile只能修饰实例变量和类变量，而synchronized可以修饰方法，以及代码块。
 *          2、volatile保证数据的可见性，但是不保证原子性(多线程进行写操作，不保证线程安全)，而synchronized是一种排他（互斥）的机制。
 */
public class VolatileDemo3 {
}
