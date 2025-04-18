package com.study._02InetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Classname: InetAddressDemo
 * @Date: 2024/6/9 22:38
 * @Author: 聂建强
 * @Description:
 *     目标：InetAddress类概述
 *          一个该类的对象就代表一个IP地址对象。
 *     InetAddress类成员方法：
 *          static InetAddress getLocalHost()
 *             * 获得本地主机IP地址对象。
 *          static InetAddress getByName(String host)
 *             * 根据IP地址字符串或主机名获得对应的IP地址对象。
 *          String getHostName()
 *             * 获得主机名。
 *          String getHostAddress()
 *             * 获得IP地址字符串。
 */
public class InetAddressDemo {
    public static void main(String[] args) throws IOException {
        // 1.获取本机地址对象
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostName());  // 获取主机名
        System.out.println(ip.getHostAddress());  // 获取本机IP地址

        // 2.获取域名ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        // 3.获取公网IP对象
        InetAddress ip3 = InetAddress.getByName("153.3.238.102");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());

        // 4.判断是否能通： ping  5s之前测试是否可通
        System.out.println(ip2.isReachable(5000));

    }
}
