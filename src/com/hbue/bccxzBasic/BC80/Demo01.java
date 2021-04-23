package com.hbue.bccxzBasic.BC80;

import java.util.Scanner;

/*
题目描述
有个软件系统登录的用户名和密码为（用户名：admin，密码：admin），用户输入用户名和密码，判断是否登录成功。
输入描述:
多组测试数据，每行有两个用空格分开的字符串，第一个为用户名，第二个位密码。
输出描述:
针对每组输入测试数据，输出为一行，一个字符串（“Login Success!”或“Login Fail!”）。
示例1
输入
复制
admin admin
输出
复制
Login Success!
示例2
输入
复制
admin abc
输出
复制
Login Fail!

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String[] strs=str.split("\\s");
        if (strs[0].equals("admin")&&strs[1].equals("admin")){
            System.out.println("Login Success!");
        }else {
            System.out.println("Login Fail!");
        }
    }
}
