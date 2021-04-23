package com.hbue.bccxzBasic.BC140;

import java.util.Scanner;

/*
题目描述
KiKi理解了继承可以让代码重用，他现在定义一个基类shape，私有数据为坐标点x,y,  由它派生Rectangle类和Circle类，它们都有成员函数GetArea()求面积。派生类Rectangle类有数据：矩形的长和宽；派生类Circle类有数据：圆的半径。Rectangle类又派生正方形Square类，定义各类并测试。输入三组数据，分别是矩形的长和宽、圆的半径、正方形的边长，输出三组数据，分别是矩形、圆、正方形的面积。圆周率按3.14计算。
输入描述:
输入三行，
第一行为矩形的长和宽，
第二行为圆的半径，
第三行为正方形的边长。
输出描述:
三行，分别是矩形、圆、正方形的面积。
示例1
输入
复制
7 8
10
5
输出
复制
56
314
25
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int length=in.nextInt();
        int width=in.nextInt();
        int r=in.nextInt();
        int side=in.nextInt();
        Rectangle rectangle=new Rectangle(length,width);
        Circle circle=new Circle(r);
        Square square=new Square(side);
        System.out.println(rectangle.getArea(width,length));
        double circleArea=circle.getArea(r);
        if ((circleArea * 100) % 100 > 0) {
            System.out.println((double) Math.round(circleArea * 100) / 100);
        }
        else {
            System.out.println((int) circleArea);
        }
        System.out.println(square.getArea(side));


    }

}

class shape{
    private int x;
    private int y;

    public shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends shape{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        super(length, width);
        this.length=length;
        this.width=width;
    }

    public int getArea(int length,int width){
        return length*width;
    }
}

class Circle extends shape{
    private double pi=3.14;
    private int r;
    public Circle(int r) {
        super(r,r);
        this.r=r;
    }
    public double getArea(int r){
        return pi*r*r;
    }
}

class Square extends Rectangle{
    private int length;
    public Square(int length) {
        super(length, length);
        this.length=length;
    }
    public int getArea(int length){
        return length*length;
    }
}

