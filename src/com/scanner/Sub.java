package com.scanner;

import java.util.Scanner;

public class Sub {
	void getSub(int a, int b) {
		int Sub=a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub s=new Sub();
		System.out.println("Enter the First Number:");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int d=sc.nextInt();
		int result=c-d;
		System.out.println(result);

	}

}
