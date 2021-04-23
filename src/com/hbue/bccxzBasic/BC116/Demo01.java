package com.hbue.bccxzBasic.BC116;

import java.util.Scanner;

/*
题目描述
小乐乐喜欢数字，尤其喜欢0和1。他现在得到了一个数，想把每位的数变成0或1。如果某一位是奇数，就把它变成1，如果是偶数，那么就把它变成0。请你回答他最后得到的数是多少。

输入描述:
输入包含一个整数n (0 ≤ n ≤ 109)

输出描述:
输出一个整数，即小乐乐修改后得到的数字。
示例1
输入
复制
222222
输出
复制
0
示例2
输入
复制
123
输出
复制
101
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Integer.valueOf(str.charAt(i))%2==0){
                str=str.replace(str.charAt(i),'0');
            }else {
                str=str.replace(str.charAt(i),'1');
            }
        }
        System.out.println(Integer.valueOf(str));
    }
}
