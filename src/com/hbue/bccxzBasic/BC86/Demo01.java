package com.hbue.bccxzBasic.BC86;

import java.util.Scanner;

/*
题目描述
任意输入一个正整数N，统计1~N之间奇数的个数和偶数的个数，并输出。

输入描述:
一行，一个正整数N。（1≤N≤100,000）
输出描述:
一行，1~N之间奇数的个数和偶数的个数，用空格分开。
示例1
输入
复制
5
输出
复制
3 2
 */
public class Demo01 {
    public static void main(String[] args) {
        int coutodd=0;
        int counteven=0;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%2==0){
                counteven++;
            }else {
                coutodd++;
            }
        }
        System.out.println(coutodd+" "+counteven);
    }
}
