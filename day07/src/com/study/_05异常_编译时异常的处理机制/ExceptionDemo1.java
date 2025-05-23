package com.study._05异常_编译时异常的处理机制;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname: ExceptionDemo1
 * @Date: 2024/6/2 21:59
 * @Author: 聂建强
 * @Description:
 *     目标：编译时异常的处理方式一。
 *
 *     编译时异常：编译阶段就会报错，一定需要程序员处理的，否则代码无法通过！！
 *
 *     抛出异常格式：
 *         方法 throws 异常1 ,  异常2 , ..{
 *
 *         }
 *         建议抛出异常的方式：代表可以抛出一切异常，
 *         方法 throws Exception{
 *
 *         }
 *
 *     方式一：
 *         在出现编译时异常的地方层层把异常抛出去给调用者，调用者最终抛出给JVM虚拟机。
 *         JVM虚拟机输出异常信息，直接干掉程序，这种方式与默认方式是一样的。
 *         虽然可以解决代码编译时的错误，但是一旦运行时真的出现异常，程序还是会立即死亡！
 *         这种方式并不好!
 *
 *     小结：
 *         编译时异常编译阶段就报错，必须程序员处理。
 *         方式一：出现异常的地方层层抛出，谁都不处理，最终抛出给虚拟机。
 *         这种方式虽然可以解决编译时异常，但是如果异常真的出现了，程序会直接死亡，所以这种方式并不好!
 */
public class ExceptionDemo1 {
    // Exception是异常的最高类型，可以抛出一切异常。
    public static void main(String[] args) throws Exception {
        System.out.println("程序开始");
        parseDate("2024-06-02 21:23:22");
        System.out.println("程序结束");
    }

    // 可以一个异常，一个异常的抛出，也可以一次直接抛出Exception，即抛出最高异常(见上面的main方法)
    public static void parseDate(String time) throws ParseException, FileNotFoundException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(time);
        System.out.println(d);

        InputStream is = new FileInputStream("C:/monkey.jpg");
        System.out.println(is);
    }
}
