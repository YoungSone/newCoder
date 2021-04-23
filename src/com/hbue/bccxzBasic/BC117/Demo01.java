package com.hbue.bccxzBasic.BC117;

import java.util.Scanner;

/*
题目描述
小乐乐上课需要走n阶台阶，因为他腿比较长，所以每次可以选择走一阶或者走两阶，那么他一共有多少种走法？

输入描述:
输入包含一个整数n (1 ≤ n ≤ 30)
输出描述:
输出一个整数，即小乐乐可以走的方法数。
示例1
输入
复制
2
输出
复制
2
示例2
输入
复制
10
输出
复制
89
 */
public class Demo01 {
    /*
        1  1种
        2  两种 11  2
        3  三种 111 12 21
        4  四种 1111 112 121 211 22
        5      11111 1121 1211 2111 221 1112 122
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(f(n));
    }

    private static int f(int n) {
        if (n==1){
            return 1;
        }else if (n==2){
            return 2;
        }else {
            return f(n-1)+f(n-2);
        }
    }
}
