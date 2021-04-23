package com.hbue.bccxzBasic.BC126;

import java.util.Scanner;

/*
题目描述
小乐乐的班主任想统计一下班级里一共有多少人需要被请家长，三个成绩（语文，数学，外语）平均分低于60的将被请家长，小乐乐想编程帮助班主任算一下有多少同学被叫家长。


输入描述:
共n+1行
第一行，输入一个数n，代表小乐乐的班级中有n个同学。
在接下来的n行中每行输入三个整数代表班级中一个同学的三科成绩（语文，数学，外语），用空格分隔。
输出描述:
一行，一个整数，代表班级中需要被请家长的人数。
示例1
输入
复制
3
80 100 90
40 70 65
20 84 93
输出
复制
1
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String[] str=new String[n];
        for (int i = 0; i < n; i++) {
            str[i]=in.nextLine();
        }
        int count=0;
        for (int i = 0; i < str.length; i++) {
            int sum=0;
            String[] str2=str[i].split("\\s");
            for (String string : str2) {
                sum+=Integer.parseInt(string);
            }
            if (sum/3.0<60){
                count++;
            }
        }
        System.out.println(count);

    }
}
