package com.syntax.class07;

import java.util.Scanner;

public class RealDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input;
		int money;
		int waterPrice=5;

		input=new Scanner(System.in);
		System.out.println("Please pay for water!");
		
		do {
			money=input.nextInt(); //in do while, you money=input.nextInt(); under do{
			
			if(money>waterPrice) {
				System.out.println("This is too much, you need to enter less money");
				//money-=input.nextInt();
			} else {
				System.out.println("Water is expensive, please insert more money");
			//money=input.nextInt();
			}
		money=input.nextInt();
		}while (money!=waterPrice);
		System.out.println("Enjoy water");
		
		
		
	}

}
