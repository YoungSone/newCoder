package com.hbue.bccxzBasic.BC124;

import java.util.Scanner;

/*
题目描述
小乐乐的班级进行了一次期中考试，考试一共有3门科目：数学，语文，英语，小乐乐的班主任决定给没有通过考核的同学家长开一次家长会，考核的标准是三科平均分不低于60分，所以现在想请你帮忙算一算小乐乐会不会被叫家长。
输入描述:
一行，输入三个整数（表示小乐乐的数学、语文、英语的成绩），用空格分隔。
输出描述:
一行，如果小乐乐会被请家长则输出“YES”，否则输出“NO”。
示例1
输入
复制
80 60 50
输出
复制
NO
示例2
输入
复制
70 55 40
输出
复制
YES
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String[] strings=in.nextLine().split("\\s");
            int sum=0;
            for (String string : strings) {
                sum+=Integer.parseInt(string);
            }
            double avg=sum/3.0;
            if (avg>=60){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
