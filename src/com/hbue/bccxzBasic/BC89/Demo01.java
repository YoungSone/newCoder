package com.hbue.bccxzBasic.BC89;


import java.util.Scanner;
/*
题目描述
用户登录网站，通常需要注册，一般需要输入两遍密码。请编程判断输入的两次密码是否一致，一致输出“same”，不一致输出“different”


输入描述:
每行有两个用空格分开的字符串，第一个为密码，第二个为重复密码。
输出描述:
每组输出一个字符串（“same”或“different”）。
示例1
输入
复制
abc abc
输出
复制
same
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strs=in.nextLine().split("\\s");
        if (strs[0].equals(strs[1])){
            System.out.println("same");
        }else {
            System.out.println("different");
        }
    }
}
