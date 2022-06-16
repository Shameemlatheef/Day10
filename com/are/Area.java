package com.are;

import java.util.Scanner;

public class Area extends Shape {
	@Override
	public  int rectangleArea(int length,int breadth) {
		return length*breadth;
	}
	@Override
	public int squareArea(int side) {
		return side*side;
	}
	@Override
	public   int circleArea(int radius) {
		return ((int)3.14*radius*radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter length");
int length=s.nextInt();
System.out.println("enter breadth");
int breadth=s.nextInt();
System.out.println("enter side ");
int side=s.nextInt();
System.out.println("enter radius");
int radius=s.nextInt();

Area A=new Area();
int rectan=A.rectangleArea(length, breadth);
int circ=A.circleArea(radius);
int squ=A.squareArea(side);

System.out.println("area od rectangle  "+rectan);
System.out.println("area of breadth "+side);
System.out.println("area of radius "+squ);



	}
	

}
