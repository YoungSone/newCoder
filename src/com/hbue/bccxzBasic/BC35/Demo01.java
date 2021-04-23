package com.hbue.bccxzBasic.BC35;

import java.util.Scanner;

/*
题目描述
从键盘任意输入一个字符，编程判断是否是字母（包括大小写）。
输入描述:
多组输入，每行输入包括一个字符。
输出描述:
针对每行输入，输出该字符是字母（YES）或不是（NO）。
示例1
输入
复制
H
9
输出
复制
YES
NO

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        byte[] a;
        while (in.hasNext()){
            a=in.next().getBytes();;
            if ((a[0]>=65&&a[0]<=90)||(a[0]>=97&&a[0]<=122)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
