package com.syntax.class10;

public class AllValuesFromArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars= {"Maserati","Lamborgini","Lexus","Mercedes","Infiniti"};
		
		for(int a=0;a<cars.length;a++) {
			System.out.print(cars[a]+" ");
		}
		System.out.println();
		
		System.out.println("------getting values from array using enhanced for loop-------");
		
		/*
		 * for (: name of the array
		 * 
		 */
		for (String car:cars) {
			System.out.println(car+" ");
		}
	System.out.println();
		System.out.println("------getting values from array using enhanced for loop-------");
	
		int[] numbers= {10, 10, 90, 600, 89};
		
		for(int num:numbers) {
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println("------getting values from array using enhanced for loop-------");
	}

}
