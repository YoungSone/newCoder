package com.hbue.bccxzBasic.BC125;

import java.util.Scanner;

/*
题目描述
小乐乐输入百分制成绩，他想将成绩转换成等级制。转换规则为：90-100为’A’，80-89为’B’，70-79为’C’，60-69为’D’，59以下为’E’。如果输入的成绩不在0-100之间，输出’F’。
输入描述:
一行，一个整数表示的成绩。
输出描述:
一行，转换后的等级。
示例1
输入
复制
78
输出
复制
C
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int score=in.nextInt();
        if (score<0){
            System.out.println("F");
        }else if (score<60){
            System.out.println("E");
        } else if (score<70) {
            System.out.println("D");
        }else if (score<80){
            System.out.println("C");
        }else if (score<90){
            System.out.println("B");
        }else if (score<=100){
            System.out.println("A");
        }else {
            System.out.println("F");
        }
    }
}
