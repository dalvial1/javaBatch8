package com.syntax.class5;

public class IfWithNoBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isSaturday=false;
		
		if(isSaturday) {
			System.out.println("Today is Java class");//if no braces, 1 line will be created as code for if block
			System.out.println("And tomorrow I will have a Java class");//this code does not belong to the If statement, because no braces
		}
	     System.out.println("I am a code outside of if statement");
	}

	}


