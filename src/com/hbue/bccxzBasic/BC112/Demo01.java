package com.hbue.bccxzBasic.BC112;

import java.util.Scanner;

/*
题目描述
小乐乐最近接触了求和符号Σ，他想计算的结果。但是小乐乐很笨，请你帮助他解答。

输入描述:
输入一个正整数n  (1 ≤ n ≤ 109)

输出描述:
输出一个值，为求和结果。
示例1
输入
复制
1
输出
复制
1
示例2
输入
复制
10
输出
复制
55
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long i=in.nextLong();
        long sum=0;
        for (long l = 1; l <= i; l++) {
            sum+=l;
        }
        System.out.println(sum);
    }

}
