package com.hbue.bccxzBasic.BC7;

import java.io.PrintStream;

/*
题目描述
KiKi写了一个输出“Hello world!”的程序，BoBo老师告诉他printf函数有返回值，你能帮他写个程序输出printf(“Hello world!”)的返回值吗？
输入描述:
无
输出描述:
包括两行：
第一行为“Hello world!”
第二行为printf(“Hello world!”)调用后的返回值。
 */
public class Demo01 {
    public static void main(String[] args) {
        /*
            原题测试结果为c/c++中print的返回值为int,
            java中返回的是PrintStream对象,测试通过直接打印str.length()即可
         */
        String str="”Hello world!“";
        PrintStream p= System.out.printf(str+"\n");
       // System.out.println(str.length());
        System.out.print(p);
    }
}
