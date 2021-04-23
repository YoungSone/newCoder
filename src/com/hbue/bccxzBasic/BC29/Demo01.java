package com.hbue.bccxzBasic.BC29;

import java.util.Scanner;

/*
题目描述
不使用累计乘法的基础上，通过移位运算（<<）实现2的n次方的计算。

输入描述:
多组输入，每一行输入整数n（0 <= n < 31）。
输出描述:
针对每组输入输出对应的2的n次方的结果。
示例1
输入
复制
2
10
输出
复制
4
1024
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        while (in.hasNext()){
            n=in.nextInt();
            System.out.println(2<<n-1);
        }
    }
}
