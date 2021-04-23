package com.hbue.bccxzBasic.BC120;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
题目描述
小乐乐从老师口中听到了二段数这个名词，想更深入的了解二段数。

二段数是这样的正整数：恰好包含两种不同的十进制数字s和t，s不是0，并且s的所有出现均排列在所有的t的前面。例如，44444411是二段数（s是4，t是1），41、10000000和5555556也是。但4444114和44444都不是二段数。

这时老师问小乐乐：给你一个任意的正整数n，你能求出比n大并且是n的倍数的最小二段数吗？请你帮助小乐乐解答这个问题。

输入描述:
多组输入，每组输入包含一个正整数n (1 ≤ n ≤ 99999)

题目保证测试数据总数不超过500组，当输入n=0时程序结束。
输出描述:
对于每组测试用例，输出正整数n，后面紧跟“: ”，输出答案并换行，即比n大且是n的倍数的最小二段数。
示例1
输入
复制
1
2019
0
输出
复制
1: 10
2019: 9999999993
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (in.hasNext()){
            int n=Integer.parseInt(in.nextLine());
            if (n==0){
                break;
            }else {
                arrayList.add(n);
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            long n=arrayList.get(i);
            long m=n+1;
            while (m>=n){
                if (m%n!=0||m<10){
                    m++;
                }else if (isAscAndtwoNum(m)){
                    break;
                }else {
                    m++;
                }

            }
            System.out.print(n+":"+m);
            System.out.print("\n");
        }
    }
/*
//超时
 public static boolean isAscAndtwoNum(long num){
        boolean flag=false;
        byte[] bytes=String.valueOf(num).getBytes();
        HashSet<Byte> set=new HashSet<>();
        for (int i = 0; i < bytes.length-1; i++) {
           // System.out.println(bytes[i]);
            if (bytes[i]>=bytes[i+1]){
                flag=true;
            }else {
                flag=false;
                break;
            }
        }
       // System.out.println(set.size());
        // 判断bytes是否只含两种字符
        for (int i = 0; i < bytes.length; i++) {
            set.add(bytes[i]);
        }
        if (set.size()!=2){
            flag=false;
        }
        return flag;
    }
 */
   /* public static boolean isAscAndtwoNum(long num){
        boolean flag=false;
        byte[] bytes=String.valueOf(num).getBytes();
        LinkedHashSet<Byte> set=new LinkedHashSet<>();

       // System.out.println(set.size());
        // 判断bytes是否只含两种字符
        for (int i = 0; i < bytes.length; i++) {
            set.add(bytes[i]);
        }

        if (set.size()!=2){
            flag=false;
        }else {
            for (int i = 0; i < bytes.length-1; i++) {
                // System.out.println(bytes[i]);
                if (bytes[i]>=bytes[i+1]){
                    flag=true;
                }else {
                    flag=false;
                    break;
                }
            }
        }


        return flag;
    }*/

    public static boolean isAscAndtwoNum(long num){
        boolean flag=false;
        byte[] bytes=String.valueOf(num).getBytes();
        byte[] bytes1=new byte[10];
        LinkedHashSet<Byte> set=new LinkedHashSet<>();

        // System.out.println(set.size());
        // 判断bytes是否只含两种字符
        for (int i = 0; i < bytes.length; i++) {
            set.add(bytes[i]);
        }

        if (set.size()!=2){
            flag=false;
        }else {
            for (int i = 0; i < bytes.length-1; i++) {
                // System.out.println(bytes[i]);
                if (bytes[i]>=bytes[i+1]){
                    flag=true;
                }else {
                    flag=false;
                    break;
                }
            }
        }


        return flag;
    }
}
