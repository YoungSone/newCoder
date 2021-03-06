package com.hbue.bccxzBasic.BC37;

import java.util.Scanner;

/*
题目描述
KiKi非常喜欢网购，在一家店铺他看中了一件衣服，他了解到，如果今天是“双11”（11月11日）则这件衣服打7折，“双12” （12月12日）则这件衣服打8折，如果有优惠券可以额外减50元（优惠券只能在双11或双12使用），求KiKi最终所花的钱数。
输入描述:
一行，四个数字，第一个数表示小明看中的衣服价格，第二和第三个整数分别表示当天的月份、当天的日期、第四个整数表示是否有优惠券（有优惠券用1表示，无优惠券用0表示）。
输出描述:
一行，小明实际花的钱数（保留两位小数）。（提示：不要指望商家倒找你钱）
示例1
输入
复制
1000.0 11 11 1
输出
复制
650.00
示例2
输入
复制
999.8 12 12 0
输出
复制
799.84
示例3
输入
复制
66.6 11 11 1
输出
复制
0.00

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double[] nums=new double[4];
        for (int i = 0; i < 4; i++) {
            nums[i]=in.nextDouble();
        }
        if (nums[1]==nums[2]){
            if (nums[1]==11){
                if (nums[3]==1){
                    nums[0]=nums[0]*0.7-50;
                }else {
                    nums[0]=nums[0]*0.7;
                }
            }else if (nums[1]==12){
                if (nums[3]==1){
                    nums[0]=nums[0]*0.8-50;
                }else {
                    nums[0]=nums[0]*0.8;
                }
            }
        }
        if (nums[0]>=0){
            System.out.printf("%.2f",nums[0]);
        }else {
            System.out.printf("%.2f",0.00);
        }
    }
}
