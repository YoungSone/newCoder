package com.hbue.bccxzBasic.BC115;

import java.util.Scanner;

/*
题目描述
小乐乐最近在课上学习了如何求两个正整数的最大公约数与最小公倍数，但是他竟然不会求两个正整数的最大公约数与最小公倍数之和，请你帮助他解决这个问题。

输入描述:
每组输入包含两个正整数n和m。(1 ≤ n ≤ 109，1 ≤ m ≤ 109)

输出描述:
对于每组输入，输出一个正整数，为n和m的最大公约数与最小公倍数之和。
示例1
输入
复制
10 20
输出
公约数 10 公倍数20
复制
30
示例2
输入
复制
15 20
输出
复制
65
 */
public class Demo01 {
    public static void main(String[] args) {
        /*
        辗转相除法
            while(m>0){
                n%=m;
                long temp=n;
                n=m;
                m=temp
            }
         */
        Scanner in=new Scanner(System.in);
        String[] strs=in.nextLine().split("\\s");
        long n=Long.parseLong(strs[0]);
        long m=Long.parseLong(strs[1]);
        long maxComDiv=0;
        long minComMuli=0;
        if (n<m){
            for (int i = 1; i <=n; i++) {
                if (n%i==0&&m%i==0){
                    maxComDiv=i;
                }
            }
        }else if (n==m){
            maxComDiv=n;
        }else {
            for (int i = 1; i <=m; i++) {
                if (n%i==0&&m%i==0){
                    maxComDiv=i;
                }
            }
        }
        if (maxComDiv==0){
            minComMuli=n*m;
        }else {
            minComMuli=n/maxComDiv*m/maxComDiv*maxComDiv;
        }
        System.out.println(maxComDiv+minComMuli);
    }
}
