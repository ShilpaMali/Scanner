package com.scanner;

import java.util.Scanner;

/*
 * Assignment No.3
 * 
 * 1. Design the separate method as String getStudentName
 * (String name) which return student name and print it.
 */

public class Student {
	String getStudentName(String name) { // name contain ajay
		return name;
		// ajay value is return to getStudentName() method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student(); // stud is object
		System.out.println("Enter the student name>>");

		Scanner scanner = new Scanner(System.in); //sachin

		String input = scanner.next(); //input contain sachin
		
		String s = stud.getStudentName(input); // method calling
		// s contain ajay
		System.out.println("Student Name is>>" + s);

	}

}
