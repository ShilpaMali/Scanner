package com.scanner;

import java.util.Scanner;

public class Addition {

	int getAddition(int a, int b) { // a contain 10, b contain 20
		int add = a + b; // 10 + 20, add contain 30
		return add;
		// returning 30 value to getAddition() method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition addition = new Addition();
		// Step-1- Meaningful message
		System.out.println("Enter the first number>>"); // 10
		// Step-2- Create object of Scanner class
		Scanner scanner = new Scanner(System.in);
		// Step-3- use nextInt() method
		int firstNumber = scanner.nextInt(); // 10
		// Step-1- Meaningful message
		System.out.println("Enter the second number>>"); // 20
		// Step-2- use nextInt() method
		int secondNumber = scanner.nextInt(); // 20
		int result = addition.getAddition(firstNumber, secondNumber); // method calling
		// result contain 30
		System.out.println("Addition is>>" + result);

	}

}
