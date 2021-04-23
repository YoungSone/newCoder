package com.hbue.bccxzBasic.BC90;

import java.util.Scanner;

/*
题目描述
输入NxM矩阵，矩阵元素均为整数，计算其中大于零的元素之和。

输入描述:
第一行为N M(N: 矩阵行数；M: 矩阵列数,且M,N<=10)，接下来的N行为矩阵各行。
输出描述:
一行，其中大于零的元素之和。
示例1
输入
复制
3 3
2 3 4
-5 -9 -7
0 8 -4
输出
复制
17
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings=in.nextLine().split("\\s");
        String[] strs=new String[Integer.parseInt(strings[0])];
        for (int i = 0; i <strs.length ; i++) {
            strs[i]=in.nextLine();
        }
        int sum=0;
        for (int i = 0; i < strs.length; i++) {

            String[] strings1=strs[i].split("\\s");
            for (int i1 = 0; i1 < strings1.length; i1++) {
                int n=Integer.parseInt(strings1[i1]);
                if (n>0){
                    sum+=n;
                }
            }

        }
        System.out.println(sum);
    }
}
