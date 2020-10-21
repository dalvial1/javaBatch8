package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//I want to say Good Morning 5 times
		
		for (int i=1; i<=5;i++) {
		System.out.println("Good Morning");
		}	
	
		System.out.println("-------EXAMPLE 2-----");
		//I want to print mumber 1 to 100
		
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------EXAMPLE 3-----");
		//I want to print number 10 to 0
		
		for(int i=10; i>=0; i-- ) {
			System.out.println(i+" ");      //(i+" "); is the SAME as (i);
		}
		
		System.out.println("----EXAMPLE 4---");
		
		for(int i=10; i<=500; i++) {
			System.out.println(i);
		}
		System.out.println("----EXAMPLE 5---");
		
		for(int i=200; i>=1; i--) {
			System.out.println(i);
		}

	}
		
	}
