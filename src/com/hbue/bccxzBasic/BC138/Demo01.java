package com.hbue.bccxzBasic.BC138;

import java.util.Scanner;

/*
题目描述
KiKi学习了结构体和指针，他了解了结构体类型可以定义包含多个不同类型成员，而指针本质是内存地址，是引用数据的另外一种方式。现在他想将多个输入的数据通过结构体和指针的方式连接在一起，形成一个单向链表，即：每个结点是结构体类型，包括整型数据成员（data）和结构体指针类型成员（next），每个结点的指针部分指向下一个输入的结点。具体建立过程如下：先输入n个整数，按照数据输入的顺序建立一个带头结点的单链表，再输入一个数据m,将单链表中的值为m的结点全部删除。输出删除后的单链表信息。

输入描述:
包括三行：
第一行输入数据个数n (3≤n≤100);
第二行依次输入n个整数，用空格分隔;

第三行输入欲删除数据m。

输出描述:
包括两行：
第一行输出完成删除后的单链表长度；

第二行依次输出完成删除后的单链表数据。


示例1
输入
复制
5
1 2 2 3 4
2
输出
复制
3
1 3 4
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String[] strings=in.nextLine().split("\\s");
        int k=Integer.parseInt(in.nextLine());
        int[] a=new int[strings.length];
        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(strings[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]==k){
                a[i]=0;
            }
        }
        int count=0;
        for (int i : a) {
            if (i==0){
                count++;
            }
        }
        System.out.println(a.length-count);
        for (int i : a) {
            if (i>0){
                System.out.print(i+" ");
            }
        }

    }
}
