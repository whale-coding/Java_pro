package com.study._12Stream流的获取;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Classname: StreamDemo
 * @Date: 2024/6/8 13:13
 * @Author: 聂建强
 * @Description:
 *      目标：Stream流的获取
 *
 *      Stream流式思想的核心：
 *                  是先得到集合或者数组的Stream流（就是一根传送带）
 *                  然后就用这个Stream流操作集合或者数组的元素。
 *                  然后用Stream流简化替代集合操作的API.
 *
 *      集合获取流的API:
 *          (1) default Stream<E> stream();
 *
 *      小结：
 *          集合获取Stream流用: stream();
 *          数组：Arrays.stream(数组)   /  Stream.of(数组);
 */
public class StreamDemo {
    public static void main(String[] args) {
        /* --------------------Collection集合获取Stream流------------------------------- */
        Collection<String>  collection = new ArrayList<>();
        Stream<String> stream = collection.stream();

        /* --------------------Map集合获取Stream流------------------------------- */
        Map<String, Integer> map = new HashMap<>();
        // 获取键的Stream流
        Stream<String> keyStream = map.keySet().stream();
        // 获取值的Stream流
        Stream<Integer> valueStream = map.values().stream();
        // 获取键值对的Stream流（key=value : Map.Entry<String,Integer>）
        Stream<Map.Entry<String,Integer>> entryStream = map.entrySet().stream();

        /* --------------------数组获取Stream流------------------------------- */
        String[] arr = new String[]{"A","B","C"};
        Stream<String> arrStream = Arrays.stream(arr);  // 获取方式1
        Stream<String> arrStream2 = Stream.of(arr);  // 获取方式2
    }
}
