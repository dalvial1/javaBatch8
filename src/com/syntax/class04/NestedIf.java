package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*variable for allergy -yes or no
 * 
 * 
 * if allergy is yes ---> We will check if pet allergy 
 *                                      if peanut allergy
 *                                      if pollen allergy
 * if no allergy you are luckky!!
 *
 *
 */
		boolean allergy=true;
		boolean petAllergy=false;
		
		if (allergy) {
		System.out.println("Lets do a further check");
		
		if(petAllergy) {
			System.out.println("Please no dogs or cats in the house");
		}
		else { 
			System.out.println("That is good you dont have a pet allergy");
		}
			
		}else {
			System.out.println("You are lucky");
			
		}
			
		
		
		
	}

	{
		
	boolean isFriday=true;
	int date=13; 
	boolean monday=true;
	
	if (isFriday) {
		if(date==13) {
			System.out.println("I am not studying, I am working");
		}else {
			System.out.println("I will watch a PK movie with Amir Khan");
			
		}}else {
			if(monday) {
				System.out.println("I am not studying, I am working");
			}else {
				System.out.println("I have class at Syntax");
			}
		}
			
		}
}
