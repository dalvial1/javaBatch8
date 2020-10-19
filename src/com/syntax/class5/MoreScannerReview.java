package com.syntax.class5;

import java.util.Scanner;

public class MoreScannerReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Create Java program thatll ask if user has a credit card or not.
 * If user doesnt,offer one
 * If they do, ask for balance
 * If balance is larger than 1000, tell them to pay off
 * asap, OTHERWISE tell them to spend more
 */
		
		System.out.println("-----------TASK 1-------------");
	    Scanner scan;
	    double balance;
	    String answer;
	    scan=new Scanner(System.in);
		System.out.println("Please enter if you have a credit card (true/false)");
		
		answer = scan.next();
		
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on your card?");
			balance=scan.nextDouble();
			if(balance>1000) {
				System.out.println("Please pay off your card balance");
				
			} else {
				System.out.println("You can spend more $$");
			}
		}else {
			System.out.println("Would you like to get a credit card?");
		}
		
	System.out.println("-----------TASK 2-------------");
	/*Write a program to ask user to enter numbers of worked years 
	 *and annual salary. If user worked for more or equals to 5 years 
	 *than user is eligible for the bonus, otherwise he is not. 
	 *Once user is eligible and salary is larger than 50000 than 
	 *bonus = 5000, otherwise bonus=3000.
	 */
	
	double workedYears;
	int annualSalary;
	
	System.out.println("Please enter number of worked years");
	workedYears=scan.nextDouble();
	
	
	
	
	
	
	}

}
