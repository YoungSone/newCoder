package com.hbue.bccxzBasic.BC129;

import java.util.Arrays;
import java.util.Scanner;

/*
题目描述
小乐乐学会了自定义函数，BoBo老师给他出了个问题，根据以下公式计算m的值。

其中 max3函数为计算三个数的最大值，如： max3(1, 2, 3) 返回结果为3。
输入描述:
一行，输入三个整数，用空格隔开，分别表示a, b, c。
输出描述:
一行，一个浮点数，小数点保留2位，为计算后m的值。
示例1
输入
复制
1 2 3
输出
复制
0.30
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings=in.nextLine().split("\\s");
        int[] a=new int[strings.length];
        for (int i = 0; i < a.length; i++) {
            a[i]=Integer.parseInt(strings[i]);
        }
        double n=max3(a[0]+a[1],a[1],a[2]);
        double m=max3(a[0],a[1]+a[2],a[2])+max3(a[0],a[1],a[1]+a[2]);
        System.out.printf("%.2f",n/m);
    }

    public static int max3(int a,int b,int c){
        int[] nums={a,b,c};
        Arrays.sort(nums);
        return nums[2];
    }
}
