package com.study._08序列化;

import java.io.*;

/**
 * @Classname: SerializeDemo1
 * @Date: 2024/6/9 19:32
 * @Author: 聂建强
 * @Description:
 *      目标:对象序列化技术。
 *
 *      对象序列化：就是把Java对象数据直接存储到文件中去。           对象 => 文件中
 *      对象反序列化：就是把Java对象的文件数据恢复到Java对象中。     文件中 => 对象
 *
 *                    字节流                                    字符流
 *      字节输入流               字节输出流              字符输入流          字符输出流
 *      InputStream             OutputStream          Reader             Writer   (抽象类)
 *      FileInputStream         FileOutputStream      FileReader         FileWriter(实现类)
 *      BufferedInputStream     BufferedOutputStream  BufferedReader     BufferedWriter(实现类，缓冲流)
 *                                                    InputStreamReader  OutputStreamWriter
 *      ObjectInputStream       ObjectOutputStream
 *
 *      对象序列化流（对象字节输出流）：ObjectOutputStream
 *          -- 作用：把内存中的Java对象数据保存到文件中去。
 *          -- 构造器：   public ObjectOutputStream(OutputStream out)
 *          -- 序列化方法：public final void writeObject(Object obj)
 *
 *      注意：对象如果想参与序列化，对象必须实现序列化接口 implements Serializable ，否则序列化失败！
 *
 *     小结：
 *          注意：对象如果想参与序列化，对象必须实现序列化接口 implements Serializable ，否则序列化失败！
 *          对象序列化使用的流是对象字节输出流：ObjectOutputStream
 */
public class SerializeDemo1 {
    public static void main(String[] args) throws IOException {
        // 1.创建User用户对象
        User user = new User("tsgz","003197","铁扇公主");

        // 2.创建低级的字节输出流通向目标文件
        OutputStream os = new FileOutputStream("day10/src/com/study/resources/obj.dat",true);

        // 3.把低级的字节输出流包装成高级的对象字节输出流ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(os);

        // 4.通过对象字节输出流序列化对象：
        oos.writeObject(user);

        // 5.释放资源
        oos.close();

        System.out.println("序列化对象成功~~~~");
    }
}
