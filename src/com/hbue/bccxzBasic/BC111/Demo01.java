package com.hbue.bccxzBasic.BC111;

import java.util.Scanner;

/*
题目描述
小乐乐在课上学习了二进制八进制与十六进制后，对进制转换产生了浓厚的兴趣。因为他的幸运数字是6，所以他想知道一个数表示为六进制后的结果。请你帮助他解决这个问题。

输入描述:
输入一个正整数n  (1 ≤ n ≤ 109)

输出描述:
输出一行，为正整数n表示为六进制的结果
示例1
输入
复制
6
输出
复制
10
示例2
输入
复制
120
输出
复制
320
 */
public class Demo01 {
    public static void main(String[] args) {
        // Integer.toString(int n,int radix) 以 radix进制转换 n
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
//        Stack<Integer> stack=new Stack<>();
//        while (n!=0){
//            stack.push(n%6);
//            n=n/6;
//        }
//        while (!stack.empty()){
//            int i=stack.pop();
//            System.out.print(i);
//        }
        System.out.println(Integer.toString(n,6));
    }
}
