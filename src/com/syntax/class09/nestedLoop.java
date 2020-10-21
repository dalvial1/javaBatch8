package com.syntax.class09;

public class nestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<5; i++) { //OuterLoop
			System.out.println("Hello");
			
			for(int y=0; y<3; y++) { //InnerLoop
				System.out.println("Bye");
			}
	
		

		}
		System.out.print("------How can i print number from 10 to 99 using NestedLoop------");
		// for(int i=10; i<=99; i++){
		//   System.out.println(i);
		
		for (int i=1; i<=9; i++) {
			
			for (int j=0; j<=9; j++) {
				
				System.out.println(i+""+j);
			}
		}
		
	
		System.out.println("-------------how can I print clock-------------------");
		for (int h = 0; h <= 23; h++) {
			for (int m = 0; m < 60; m++) {
				if (h < 10) {
					if (m < 10) {
						System.out.println("0" + h + ":0" + m);
					} else {
						System.out.println("0" + h + ":" + m);
					}
				} else {
					if (m < 10) {
						System.out.println(h + ":0" + m);
					} else {
						System.out.println(h + ":" + m);
					}
				}
			}
		}
	}
}
			
			

