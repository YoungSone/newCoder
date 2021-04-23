package com.hbue.bccxzBasic.BC54;

import java.util.Arrays;
import java.util.Scanner;

/*
题目描述
KiKi想获得某年某月有多少天，请帮他编程实现。输入年份和月份，计算这一年这个月有多少天。
输入描述:
多组输入，一行有两个整数，分别表示年份和月份，用空格分隔。
输出描述:
针对每组输入，输出为一行，一个整数，表示这一年这个月有多少天。
示例1
输入
复制
2008 2
输出
复制
29

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] max={1,3,5,7,8,10,12};
        int[] mid={2};
        int[] min={4,6,9,11};
        int[] ints=new int[2];
        while (in.hasNext()){
            ints[0]=in.nextInt();
            ints[1]=in.nextInt();
            if(ints[0]%4==0){
                if (Arrays.binarySearch(max,ints[1])>=0){
                    System.out.println(31);
                }else if (Arrays.binarySearch(mid,ints[1])>=0){
                    System.out.println(29);
                }else {
                    System.out.println(30);
                }
            }else {
                if (Arrays.binarySearch(max,ints[1])>=0){
                    System.out.println(31);
                }else if (Arrays.binarySearch(mid,ints[1])>=0){
                    System.out.println(28);
                }else {
                    System.out.println(30);
                }
            }
        }
    }
}
