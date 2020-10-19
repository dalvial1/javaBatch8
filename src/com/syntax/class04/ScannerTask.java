package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----------------TASK1---------------------------");
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is the amount for the loan");
		
		int loan= input.nextInt();
		
		if (loan<=200000) {
			System.out.println("I will lend the money");
		}else {
			System.out.println("I will not lend the money");
			
			}
		
		System.out.println("-----------------TASK2---------------------------");
		
		Scanner input2=new Scanner(System.in);
		System.out.println("How old are you?");
		
		int age= input.nextInt();
		
		if (age>=18) {
	System.out.println("Here is your license");
	}else {
		System.out.println("No license for you");
	}
	
	
	//HW TASK 3
	
	System.out.println("-----------------TASK3---------------------------");

		

	
	System.out.println("Input your cities name");
    String city;
	city = input.next();
	
	System.out.println("Input temperature");
	float f;
	f=input.nextFloat();
	
	double cel;
	cel=(f-32)/1.8;
	
	
	System.out.println("The temperature in "+city+" is"+cel);
	
	
	
	}
}

