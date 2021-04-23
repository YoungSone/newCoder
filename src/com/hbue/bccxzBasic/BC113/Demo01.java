package com.hbue.bccxzBasic.BC113;

import java.util.Scanner;

/*
题目描述
小乐乐比较懒惰，他现在想睡觉，然后再去学习。他知道现在的时刻，以及自己要睡的时长，想设定一个闹钟叫他起床学习，但是他太笨了，不知道应该把闹钟设定在哪个时刻，请你帮助他。(只考虑时和分，不考虑日期)

输入描述:
输入现在的时刻以及要睡的时长k（单位：minute），中间用空格分开。

输入格式：hour:minute k(如hour或minute的值为1，输入为1，而不是01)

(0 ≤ hour ≤ 23，0 ≤ minute ≤ 59，1 ≤ k ≤ 109)

输出描述:
对于每组输入，输出闹钟应该设定的时刻，输出格式为标准时刻表示法（即时和分都是由两位表示，位数不够用前导0补齐）。
示例1
输入
复制
0:0 100
输出
复制
01:40
示例2
输入
复制
1:0 200
输出
复制
04:20
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings=in.nextLine().split("\\s");
        String[] str1=strings[0].split(":");
        int time=Integer.parseInt(strings[1])+Integer.parseInt(str1[0])*60+Integer.parseInt(str1[1]);
        int h=0;
        int m=0;
        if (time/1440>0){
            h=time%1440/60;
            m=time%1440%60;
        }else {
            h=time/60;
            m=time%60;
        }
        System.out.printf("%02d:%02d",h,m);
    }
}
