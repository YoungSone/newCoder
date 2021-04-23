package com.hbue.bccxzBasic.BC118;

import java.util.*;

/*
题目描述
老师给了小乐乐一个正整数序列，要求小乐乐把这个序列去重后按从小到大排序。但是老师给出的序列太长了，小乐乐没办法耐心的去重并排序，请你帮助他。

输入描述:
第一行包含一个正整数n，表示老师给出的序列有n个数。接下来有n行，每行一个正整数k，为序列中每一个元素的值。(1 ≤ n ≤ 10^5，1 ≤ k ≤ n)

输出描述:
输出一行，为去重排序后的序列，每个数后面有一个空格。
示例1
输入
复制
4
2
2
1
1
输出
复制
1 2
示例2
输入
复制
5
5
4
3
2
1
输出
复制
1 2 3 4 5
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        int[] a=new int[n+1];
        for (int i = 0; i < n; i++) {
            int m=Integer.parseInt(in.nextLine());
            a[m]=m;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=0){
                System.out.print(a[i]+" ");
            }
        }

    }
}
