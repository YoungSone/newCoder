package com.hbue.bccxzBasic.BC110;

import java.util.Scanner;

/*
题目描述
KiKi和BoBo玩 “井”字棋。也就是在九宫格中，只要任意行、列，或者任意对角线上面出现三个连续相同的棋子，就能获胜。请根据棋盘状态，判断当前输赢。

输入描述:
三行三列的字符元素，代表棋盘状态，字符元素用空格分开，代表当前棋盘，其中元素为K代表KiKi玩家的棋子，为O表示没有棋子，为B代表BoBo玩家的棋子。
输出描述:
如果KiKi获胜，输出“KiKi wins!”；
如果BoBo获胜，输出“BoBo wins!”；
如果没有获胜，输出“No winner!”。
示例1
输入
复制
K O B
O K B
B O K
输出
复制
KiKi wins!
 */
public class Demo01 {
    public static void main(String[] args) {
        int flag=0; //1KIKI 2BOBO 0没有获胜
        Scanner in=new Scanner(System.in);
        String[] str1=in.nextLine().split("\\s");
        String[] str2=in.nextLine().split("\\s");
        String[] str3=in.nextLine().split("\\s");
        String[][] strings={str1,str2,str3};
        if (flag==0){
            //判断行成立
            for (int i = 0; i < 3; i++) {
                if (strings[i][0].equals(strings[i][1])&&strings[i][0].equals(strings[i][2])){
                    if (strings[i][0].equals("K")){
                        flag=1;
                    }else if (strings[i][0].equals("B")){
                        flag=2;
                    }else {
                        flag=0;
                    }
                }
            }
        }
        if (flag==0){
            //判断列相等
            for (int i = 0; i < 3; i++) {
                if (strings[0][i].equals(strings[1][i])&&strings[0][i].equals(strings[2][i])){
                    if (strings[0][i].equals("K")){
                        flag=1;
                    }else if (strings[0][i].equals("B")){
                        flag=2;
                    }else {
                        flag=0;
                    }
                }
            }
        }
        if (flag==0){
            //判断对角线相等
            if((strings[0][0].equals(strings[1][1])&&strings[1][1].equals(strings[2][2]))||(strings[0][2].equals(strings[1][1])&&strings[1][1].equals(strings[2][0]))){
                if (strings[1][1].equals("K")){
                    flag=1;
                }else if (strings[1][1].equals("B")){
                    flag=2;
                }else {
                    flag=0;
                }
            }
        }



        switch (flag){
            case 0:
                System.out.println("No winner!");
                break;
            case 1:
                System.out.println("KiKi wins!");
                break;
            case 2:
                System.out.println("BoBo wins!");
                break;
            default:
                break;
        }
    }
}
