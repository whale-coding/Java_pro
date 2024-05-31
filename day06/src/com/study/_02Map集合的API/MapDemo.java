package com.study._02Map集合的API;

import java.util.*;

/**
 * @Classname: MapDemo
 * @Date: 2024/5/30 14:19
 * @Author: 聂建强
 * @Description:
 *     目标：Map集合的常用API(重点中的重点)
 *      - public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
 *      - public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
 *      - public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
 *      - public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
 *      - public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
 *      - public boolean containKey(Object key):判断该集合中是否有此键。
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 1.添加元素：无序、不重复、无索引
        map.put("iphoneX",10);
        map.put("娃娃",30);
        map.put("iphoneX",100);  // Map集合后面重复的键对应的元素会覆盖前面重复的整个元素！
        map.put("huawei",1000);
        map.put("生活用品",10);
        map.put("手表",10);

        System.out.println(map);  // {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}

        // 2.清空集合
        // map.clear();
        // System.out.println(map);

        // 3.判断Map集合是否为空，为空返回true,否则返回false
        System.out.println(map.isEmpty());

        // 4.根据键获取对应的值
        System.out.println(map.get("娃娃"));

        // 5.根据键删除整个元素。（删除键会返回键的值）
        Integer i = map.remove("iphoneX");
        System.out.println(i);
        System.out.println(map);

        // 6.判断是否包含某个键，包含返回true,否则返回false
        System.out.println(map.containsKey("手表"));  // true
        System.out.println(map.containsKey("大衣"));  // false

        // 7.判断是否包含某个值
        System.out.println(map.containsValue(1000));  // true
        System.out.println(map.containsValue(10));  // true
        System.out.println(map.containsValue("30"));  // false,包含的是整数30，不是字符串

        // 8.获取全部键的集合：public Set<K> keySet();
        // Map集合的键是无序不重复的，所以返回的是一个Set集合。
        Set<String> keys = map.keySet();
        for (String key: keys){
            System.out.println(key);
        }

        // 9.获取全部值的集合：Collection<V> values();
        // Map集合的值是不做要求的，可以重复，所以值要用Collection集合接收
        Collection<Integer> values = map.values();
        for (Integer value: values){
            System.out.println(value);
        }

        // 10.Map集合的大小
        System.out.println(map.size());

        // 11.合并其他Map集合。（扩展）
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("xiaoMi", 10);
        map2.put("cuiZi", 20);
        map.putAll(map2);  // 把Map集合map2的数据全部倒入到map集合中去

        System.out.println(map);
    }
}
