package com.abs;

import java.util.Scanner;

public class Allstudents {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
	String name=s.next();
		System.out.println("enter address");
		String address=s.next();
		System.out.println("Enter physics");
		int p=s.nextInt();
		System.out.println("enter maths");
		int m=s.nextInt();
		
		System.out.println("enter chemistry");
		int c=s.nextInt();
		
		
		Scanner j=new Scanner(System.in);
		System.out.println("enter history name");
		String nam=j.next();
		System.out.println("enter address");
		String add=j.next();
		System.out.println("enter marks of history");
		
		int h=j.nextInt();
		System.out.println("enter marks of civic");
		int ci=j.nextInt();
		
		HistoryStudent w=new HistoryStudent(h, ci);
		System.out.println("History name "+nam);
		System.out.println("address"+add);
		System.out.println("percantage of history"+w.getpercentage());
		System.out.println("==============================");
		
		SceinceStudent ss=new SceinceStudent(p, m,c);
		System.out.println("science name "+name);
		System.out.println("science address"+address);
		System.out.println("percentage of"+ss.getpercentage());
		System.out.println("============================");
	
		
		
		
				
				
				
	
		
		
		
		
		
	}
}
