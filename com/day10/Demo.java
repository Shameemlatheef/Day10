package com.day10;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount)
	{
	if(amount>1000) {
		Tajhotel d=new Tajhotel();
		return d;
	}
	else if(amount<1000 && amount>200) {
		Roadsidehotel r=new Roadsidehotel();
		return r;
	}
	else {
		return null;
	}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter amount");
		int amount=s.nextInt();
		Demo d=new Demo();
		Hotel h=d.provideFood(amount);
		if(h instanceof Tajhotel) {
			Tajhotel t=(Tajhotel)h;
			t.chickenbiriyani();
			t.welcomeDrink();
			t.masaladosa();
		}
		else if(h instanceof Roadsidehotel) {
			Roadsidehotel j=(Roadsidehotel)h;
			j.chickenbiriyani();
			j.masaladosa();
			
		}
		else {
			System.out.println("enter valid amount");
		}
		
		
		
	}
}
