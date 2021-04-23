package com.hbue.bccxzBasic.BC68;

import java.util.Scanner;

/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的X形图案。
输入描述:
多组输入，一个整数（2~20），表示输出的行数，也表示组成“X”的反斜线和正斜线的长度。
输出描述:
针对每行输入，输出用“*”组成的X形图案。

示例1
输入
复制
5
输出
复制
*   *
 * *
  *
 * *
*   *
 */
public class Demo01 {
    public static void main(String[] args) {
        //看出二维数组， 首尾对称
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            for (int i = 1; i <=n; i++) {
                for (int i1 = 1; i1 <=n; i1++) {
                    if ((i==i1)||(i==n-i1+1)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }

                }
                System.out.print("\n");
            }
        }
    }
}
