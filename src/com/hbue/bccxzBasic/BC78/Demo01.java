package com.hbue.bccxzBasic.BC78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
题目描述
用筛选法求n以内的素数。筛选法求解过程为：将2~n之间的正整数放在数组内存储，将数组中2之后的所有能被2整除的数清0，再将3之后的所有能被3整除的数清0 ，以此类推，直到n为止。数组中不为0 的数即为素数。
输入描述:
多组输入，每行输入一个正整数（不大于100）。
输出描述:
针对每行输入的整数n，输出两行，第一行，输出n之内（包括n）的素数，用空格分隔，

第二行，输出数组中2之后0 的个数。每行输出后换行。
示例1
输入
复制
20
输出
复制
2 3 5 7 11 13 17 19
11
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            ArrayList<Integer> num=new ArrayList();
            for (int i =2; i <=n; i++) {
                num.add(i);
            }

            for (int i = 2; i <=n; i++) {
                for (int i1 = i-1; i1 < num.size(); i1++) {
                    if (num.get(i1)%i==0){
                        num.set(i1,0);
                    }
                }
            }
            int count=0;
            for (int i = 0; i < num.size(); i++) {
                if (num.get(i)!=0){
                    System.out.print(num.get(i)+" ");
                }else {
                    count++;
                }
            }
            System.out.println();
            System.out.println(count);

        }

    }
}
