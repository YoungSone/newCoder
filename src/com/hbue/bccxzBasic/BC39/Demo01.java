package com.hbue.bccxzBasic.BC39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
题目描述
期中考试开始了，大家都想取得好成绩，争夺前五名。从键盘输入n个学生成绩（不超过40个），输出每组排在前五高的成绩。

输入描述:
两行，第一行输入一个整数，表示n个学生（>=5），第二行输入n个学生成绩（整数表示，范围0~100），用空格分隔。
输出描述:
一行，输出成绩最高的前五个，用空格分隔。
示例1
输入
复制
6
99 45 78 67 72 88
输出
复制
99 88 78 72 67
 */
public class Demo01 {
    /*
        泛型只能使用引用类型
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        Integer[] scores=new Integer[num];
        for (int i = 0; i < num; i++) {
            scores[i]=in.nextInt();
        }
        Arrays.sort(scores,(o1, o2) -> {return o2-o1;});
        for (int i = 0; i < 5; i++) {
            System.out.print(scores[i]+" ");
        }
    }
}
