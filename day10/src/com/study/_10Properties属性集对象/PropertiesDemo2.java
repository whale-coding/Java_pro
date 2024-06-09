package com.study._10Properties属性集对象;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Classname: PropertiesDemo2
 * @Date: 2024/6/9 19:47
 * @Author: 聂建强
 * @Description:
 *     目标：Properties读取属性文件中的键值对信息。（读取）
 *     Properties的方法：
 *         -- public Object setProperty(String key, String value) ： 保存一对属性。
 *         -- public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值
 *         -- public Set<String> stringPropertyNames() ：所有键的名称的集合
 *         -- public void store(OutputStream out, String comments):保存数据到属性文件中去
 *         -- public synchronized void load(InputStream inStream):加载属性文件的数据到属性集对象中去
 *         -- public synchronized void load(Reader fr):加载属性文件的数据到属性集对象中去
 *     小结：
 *         属性集对象可以加载读取属性文件中的数据！
 */
public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        // 1.创建一个属性集对象
        Properties properties = new Properties();
        System.out.println(properties);

        // 2.字节输入流加载属性文件的数据到属性集对象properties中去。
        properties.load(new FileInputStream("day10/src/com/study/resources/users.properties"));
        System.out.println(properties);

        System.out.println(properties.getProperty("zs"));
        System.out.println(properties.getProperty("admin"));
    }
}
