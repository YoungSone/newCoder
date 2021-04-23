package com.hbue.bccxzBasic.BC127;

import java.util.Arrays;
import java.util.Scanner;

/*
题目描述
小乐乐的老师BoBo想知道班级中谁的数学成绩最高，请编程帮他实现。
输入描述:
共n+1行
第一行输入一个数n，代表小乐乐的班级中n个同学。
第二行输入n个数，用空格相隔，代表班级中每个人的数学成绩。
输出描述:
一个整数，代表班级中最高的数学成绩。
示例1
输入
复制
3
99 89 39
输出
复制
99
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String[] str1=in.nextLine().split("\\s");
        int[] scores=new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            scores[i]=Integer.parseInt(str1[i]);
        }
        Arrays.sort(scores);
        System.out.println(scores[n-1]);
    }
}
