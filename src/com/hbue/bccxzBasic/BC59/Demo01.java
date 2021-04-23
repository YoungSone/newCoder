package com.hbue.bccxzBasic.BC59;

import java.util.Scanner;

/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的翻转直角三角形图案。
输入描述:
多组输入，一个整数（2~20），表示翻转直角三角形直角边的长度，即“*”的数量，也表示输出行数。
输出描述:
针对每行输入，输出用“*”组成的对应长度的翻转直角三角形，每个“*”后面有一个空格。
示例1
输入
复制
5
输出
复制
* * * * *
* * * *
* * *
* *
*
示例2
输入
复制
6
输出
复制
* * * * * *
* * * * *
* * * *
* * *
* *
*
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            for (int i = n; i >= 1; i--) {
                for (int i1 = 0; i1 < i; i1++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
