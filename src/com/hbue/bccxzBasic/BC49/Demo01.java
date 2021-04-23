package com.hbue.bccxzBasic.BC49;

import java.util.Scanner;

/*
题目描述
KiKi想知道从键盘输入的两个数的大小关系，请编程实现。
输入描述:
题目有多组输入数据，每一行输入两个整数（范围（1 ~231-1），用空格分隔。
输出描述:
针对每行输入，输出两个整数及其大小关系，数字和关系运算符之间没有空格，详见输入输出样例。
示例1
输入
复制
1 1
输出
复制
1=1
示例2
输入
复制
1 0
输出
复制
1>0
示例3
输入
复制
0 1
输出
复制
0<1
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int a=in.nextInt();
            int b=in.nextInt();
            if (a>b){
                System.out.println(a+">"+b);
            }else if (a<b){
                System.out.println(a+"<"+b);
            }else {
                System.out.println(a+"="+b);
            }
        }
    }
}
