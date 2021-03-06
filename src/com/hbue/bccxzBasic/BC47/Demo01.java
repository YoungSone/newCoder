package com.hbue.bccxzBasic.BC47;

import java.util.Scanner;

/*
题目描述
KiKi想判断输入的字符是不是字母，请帮他编程实现。

输入描述:
多组输入，每一行输入一个字符。
输出描述:
针对每组输入，输出单独占一行，判断输入字符是否为字母，输出内容详见输出样例。
示例1
输入
复制
A
6
输出
复制
A is an alphabet.
6
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            byte[] bytes=in.nextLine().getBytes();
            if ((bytes[0]>=65&&bytes[0]<=90)||(bytes[0]>=97&&bytes[0]<=122)){
                System.out.println((char)bytes[0]+" is an alphabet.");
            }else {
                System.out.println((char)bytes[0]+" is not an alphabet.");
            }
        }
    }
}
