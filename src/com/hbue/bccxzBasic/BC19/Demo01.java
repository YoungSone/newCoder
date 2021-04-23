package com.hbue.bccxzBasic.BC19;

import java.util.Scanner;

/*
题目描述
将一个四位数，反向输出。


输入描述:
一行，输入一个整数n（1000 <= n <= 9999）。
输出描述:
针对每组输入，反向输出对应四位数。
示例1
输入
复制
1234
输出
复制
4321

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        byte[] bytes=str.getBytes();
        for (int i = bytes.length - 1; i >= 0; i--) {
            System.out.print((char)bytes[i]);
        }
    }
}
