package com.hbue.bccxzBasic.BC106;

import java.util.Scanner;

/*
题目描述
KiKi想知道一个n阶方矩是否为上三角矩阵，请帮他编程判定。上三角矩阵即主对角线以下的元素都为0的矩阵，主对角线为从矩阵的左上角至右下角的连线。

输入描述:
第一行包含一个整数n，表示一个方阵包含n行n列，用空格分隔。 (1≤n≤10)

从2到n+1行，每行输入n个整数（范围-231~231-1），用空格分隔，共输入n*n个数。

输出描述:
一行，如果输入方阵是上三角矩阵输出"YES"并换行，否则输出"NO"并换行。

示例1
输入
复制
3
1 2 3
0 4 5
0 0 6
输出
复制
YES
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String[] strings=new String[n];
        for (int i = 0; i < n; i++) {
            strings[i]=in.nextLine();
        }
        boolean flag=false;
        //从第一行开始读取数组
        for (int i = 0; i < n; i++) {
                //获取该行字符串数组
                String[] str=strings[i].split("\\s");
              //  System.out.println(strings[i].toString());
                //对数组进行for循环，判断该数组前i个是否为0,设置标记 记录数组中0的个数和前i个数中0的个数
                int k=0;
                int l=0;
                for (int i2 = 0; i2 < str.length; i2++) {
                    if(i2<=i){
                        if (str[i2].equals("0")){
                            l++;
                            k++;
                        }
                    }else {
                        if (str[i2].equals("0")){
                            k++;
                        }
                    }
                }
                if (k==l&&l==i){
                    flag=true;
                }else {
                    flag=false;
                }

        }
        if (flag){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
