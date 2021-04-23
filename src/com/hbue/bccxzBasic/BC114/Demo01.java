package com.hbue.bccxzBasic.BC114;

import java.util.Scanner;

/*
题目描述
小乐乐学校教学楼的电梯前排了很多人，他的前面有n个人在等电梯。电梯每次可以乘坐12人，每次上下需要的时间为4分钟（上需要2分钟，下需要2分钟）。请帮助小乐乐计算还需要多少分钟才能乘电梯到达楼上。（假设最初电梯在1层）

输入描述:
输入包含一个整数n (0 ≤ n ≤ 109)

输出描述:
输出一个整数，即小乐乐到达楼上需要的时间。
示例1
输入
复制
1
输出
复制
2
示例2
输入
复制
12
输出
复制
6
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if ((n+1)<=12){
            System.out.println(2);
        }else {
            if ((n+1)%12==0){
                System.out.println((n+1)/12*4);
            }else {
                System.out.println((n+1)/12*4+2);
            }
        }
    }
}
