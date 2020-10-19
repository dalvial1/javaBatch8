package com.syntax.reviewclass1;

import java.util.Scanner;

public class Recap {
	
	public static void main(String[] args) {

	Scanner random=new Scanner(System.in);
	System.out.println("Do you like chicken?");
	
	boolean chicken=random.nextBoolean();
			
	if(chicken) {
		System.out.println("I love chicken");
	}else  {
		System.out.println("Na foo I'm good");
		
		
	}
		
}
}