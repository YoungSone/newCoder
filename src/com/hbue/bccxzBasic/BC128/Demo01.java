package com.hbue.bccxzBasic.BC128;

import java.util.Scanner;

/*
题目描述
小乐乐想计算一下1!+2!+3!+...+n!。
输入描述:
一行，一个整数n。
输出描述:
一行，一个整数，表示1!+2!+3!+...+n!的结果。
示例1
输入
复制
3
输出
复制
9
备注:
结果范围在int类型范围之内
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        System.out.println(f1(n));
    }

    private static int f(int n) {
        if (n==1){
            return 1;
        }
        return f(n-1)*n;
    }

    private static int f1(int n){
        if (n==1){
            return 1;
        }
        return f1(n-1)+f(n);
    }
}
