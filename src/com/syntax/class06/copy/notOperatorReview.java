package com.syntax.class06.copy;
import java.util.Scanner;
public class notOperatorReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean sale;
		double price;
		double discount;
		
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter the price");
		sale = input.nextBoolean();
		
		// ! before <-- is NO case. Ex. !sale means NO sale
		if (!sale) {
			System.out.println("Please enter price");
			price=input.nextDouble();
			if (price >= 10 && price <50) {
				discount = price * 0.1;
			}else if (price >= 50 && price <100) {
				discount = price * 0.2;
			}else if (price >=100 && price < 500) {
				discount = price * 0.4;
			}else if (price >= 500) {
				discount = price * 0.5;
			}else {
				discount=0;
			}
			double finalPrice= (price - discount);
		System.out.println("Your product is $" + price + "and you get $" + discount + " discount and you only pay" +finalPrice);
		
		}else {
			System.out.println("No shopping");
		}
		
		
		
		
	}

}
