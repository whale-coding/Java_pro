package com.study._07正则表达式的演示;

import java.util.Scanner;

/**
 * @Classname: RegexDemo3
 * @Date: 2024/5/24 15:43
 * @Author: 聂建强
 * @Description:
 *     目标：正则表达式的实际应用。
 */
public class RegexDemo3 {
    public static void main(String[] args) {
        checkEmail();
        checkTel();
        checkPhone();
    }

    // 校验手机号
    public static void checkPhone(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入手机号：");
        String phone =sc.nextLine();
        if (phone.matches("1[3-9]\\d{9}")){
            System.out.println("手机号合法");
        }else {
            System.out.println("手机号格式不正确");
        }
    }

    // 校验电话号码
    public static void checkTel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入电话号码：");
        String phone =sc.nextLine();
        if (phone.matches("0\\d{2,5}-?\\d{5,15}")){
            System.out.println("电话号码合法");
        }else {
            System.out.println("电话号码格式不正确");
        }
    }

    // 校验邮箱
    public static void checkEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入邮箱：");
        String phone =sc.nextLine();
        if (phone.matches("\\\\w{1,}@\\\\w{2,10}(\\\\.\\\\w{2,10}){1,2}")){
            System.out.println("邮箱合法");
        }else {
            System.out.println("邮箱格式不正确");
        }
    }
}
