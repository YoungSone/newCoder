package com.hbue.bccxzBasic.BC75;

import java.util.Scanner;

/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用数字组成的数字三角形图案。
输入描述:
多组输入，一个整数（3~20），表示数字三角形边的长度，即数字的数量，也表示输出行数。
输出描述:
针对每行输入，输出用数字组成的对应长度的数字三角形，每个数字后面有一个空格。

示例1
输入
复制
4
输出
复制
1
1 2
1 2 3
1 2 3 4
示例2
输入
复制
5
输出
复制
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int i1 = 1; i1 <= i; i1++) {
                    System.out.print(i1+" ");
                }
                System.out.print("\n");
            }
        }
    }
}
