package com.hbue.bccxzBasic.BC34;

import java.util.Scanner;

/*
题目描述
输入一个十六进制数a，和一个八进制数b，输出a+b的十进制结果（范围-231~231-1）。
输入描述:
一行，一个十六进制数a，和一个八进制数b，中间间隔一个空格。
输出描述:
一行，a+b的十进制结果。
示例1
输入
复制
0x12 05
输出
复制
23
备注:
十六进制Hexadecimal一般以0x开头，例如0xFF。八进制Octal，一般以0开头，例如07。
 */
public class Demo01 {
    /*
        包装类的进制转换
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] nums=new String[2];
        for (int i = 0; i < 2; i++) {
            nums[i]=in.next();
        }
        Integer Hexadecimal=Integer.parseInt(nums[0].substring(2),16) ;
        Integer Octal=Integer.parseInt(nums[1].substring(1),8);
        Integer sum=Hexadecimal+Octal;
        System.out.println(sum);


    }
}
