package com.syntax.class07;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Ask user to pay for a water
		 * Water is $5
		 * Once user enters money, we need to tell if he needs more money 
		 * or less
		 * Once user gives us exactly 5 then ----> enjoy your water
		 */
		
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		System.out.println("How much you got on this water?!");
		money=input.nextInt();
		
		while(money!=waterPrice) {
			if(money>waterPrice) {
				System.out.println("This is too much, you need to enter less money");
				//money-=input.nextInt();
			}else {
				System.out.println("Water is expensive, please insert more money");
			//money=input.nextInt();
			}
		money=input.nextInt();
		}
		System.out.println("Enjoy water");
		
		
	}

}
