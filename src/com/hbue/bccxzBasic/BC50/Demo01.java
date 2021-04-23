package com.hbue.bccxzBasic.BC50;

import java.util.Scanner;

/*
题目描述
KiKi最近学习了信号与系统课程，这门课里有一个非常有趣的函数，单位阶跃函数，其中一种定义方式为：



现在试求单位冲激函数在时域t上的值。

输入描述:
题目有多组输入数据，每一行输入一个t(-1000<t<1000)表示函数的时域t。
输出描述:
输出函数的值并换行。
示例1
输入
复制
11
0
-11
输出
复制
1
0.5
0

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int a=in.nextInt();
            if (a>0){
                System.out.println(1);
            }else if (a==0){
                System.out.println(1/2.0);
            }else {
                System.out.println(0);
            }
        }
    }
}
