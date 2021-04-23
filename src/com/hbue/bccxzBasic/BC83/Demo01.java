package com.hbue.bccxzBasic.BC83;

import java.util.Scanner;

/*
题目描述
判断一个整数是否能5整除是一个挺简单的问题，懒惰的KiKi还是不想自己做，于是找到你帮他写代码，你就帮帮他吧。


输入描述:
输入包括一个整数M（1≤M≤100,000）。
输出描述:
输出包括一行，如果M可以被5整除就输出YES，否则输出NO（结果大小写敏感）。
示例1
输入
复制
10
输出
复制
YES
示例2
输入
复制
9
输出
复制
NO
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(n%5==0?"YES":"NO");
    }
}
