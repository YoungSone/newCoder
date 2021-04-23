package com.hbue.bccxzBasic.BC57;

import java.util.Scanner;

/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的正方形图案。
输入描述:
多组输入，一个整数（1~20），表示正方形的长度，也表示输出行数。

输出描述:
针对每行输入，输出用“*”组成的对应边长的正方形，每个“*”后面有一个空格。

示例1
输入
复制
4
输出
复制
* * * *
* * * *
* * * *
* * * *
示例2
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            for (int i = 1; i <=n; i++) {
                for (int i1 = 1; i1 <=n; i1++) {
                    System.out.print("* ");

                }
                System.out.println("");

            }
        }
    }
}
