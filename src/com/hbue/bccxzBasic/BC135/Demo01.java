package com.hbue.bccxzBasic.BC135;
/*
题目描述
KiKi知道了什么是质数（只能被1和他自身整除的数），他现在想知道所有三位整数中，有多少个质数。
输入描述:
无
输出描述:
一行，一个整数，表示所有三位整数中，有多少个质数。

 */
public class Demo01 {
    public static void main(String[] args) {
        int count=0;
        for (int i=100;i<1000;i++){
            boolean flag=false;
            for (int i1 = 2; i1 <i; i1++) {
                if (i%i1==0){
                    flag=true;
                }
            }
            if (!flag){
                count++;
            }
        }
        System.out.println(count);
    }
}
