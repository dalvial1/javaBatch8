package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner paola=new Scanner(System.in);
		System.out.println("Please enter boolean value for rain");
		
		boolean rain=paola.nextBoolean(); //waiting to hit enter when done
		
		if(rain) {
			System.out.println("Please take an umbrella");
		}else {
			System.out.println("It is nice weather lets go for a walk");
			
		}
		
	
	
		
	}

}
