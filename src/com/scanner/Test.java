package com.scanner;

import java.util.Scanner;

public class Test {
	public static void getMultiplication(int number) { // 2
		for (int i = 1; i <= 10; i++) {
			int mul = number * i; // 2*1=2, 2*2=4, 2*3=6
			System.out.println(mul);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step-1- Meaningful message
				System.out.println("Enter the number>>"); //as 2
				//Step-2- Create object of Scanner class
				Scanner scanner=new Scanner(System.in);
				//Step-3- use nextInt() method
				int a=scanner.nextInt(); //a contain 2
				getMultiplication(a);

	}

}
