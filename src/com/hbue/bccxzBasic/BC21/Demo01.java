package com.hbue.bccxzBasic.BC21;

import java.util.Scanner;

/*
题目描述
给定一个浮点数，要求得到该浮点数的个位数。

输入描述:
一行，包括一个浮点数。
输出描述:
一行，包含一个整数，为输入浮点数对应的个位数。
示例1
输入
复制
13.141
输出
复制
3
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float num=in.nextFloat();
        System.out.println((int)num%10);
    }
}
