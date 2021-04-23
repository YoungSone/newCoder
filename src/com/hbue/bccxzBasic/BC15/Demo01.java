package com.hbue.bccxzBasic.BC15;

import java.util.Scanner;

/*
题目描述

输入两个整数，范围-231~231-1，交换两个数并输出。

输入描述:
输入只有一行，按照格式输入两个整数，范围，中间用“,”分隔。
输出描述:
把两个整数按格式输出，中间用“,”分隔。
示例1
输入
复制
a=1,b=2
输出
复制
a=2,b=1
备注:
如果格式控制串中有非格式字符则输入时也要输入该非格式字符。
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String[] strings=str.split("\\,");
        byte[] bytes1=strings[0].getBytes();
        byte[] bytes2=strings[1].getBytes();
        String a="";
        String b="";
        for (int i = 2; i < bytes1.length; i++) {
            a+=""+(char)bytes1[i];
        }
        for (int i = 2; i < bytes2.length; i++) {
            b+=""+(char)bytes2[i];
        }
        System.out.println("a="+b+",b="+a);

    }
}
