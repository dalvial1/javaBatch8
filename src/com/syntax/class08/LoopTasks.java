package com.syntax.class08;

public class LoopTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			for(int a=1; a<=100; a++) {
				System.out.print(a+" ");
				
			}
			for(int b=100; b>=1; b--) {
				System.out.println(b);
				
			}
			for(int c=20; c>=0; c=c-2) {
				System.out.println(c);
		}
			for(int d=21; d<=50;d=d+2) {
				System.out.println(d);
			}
	
			System.out.println("----EXAMPLE 2----");
	//calculate sum for even and odd numbers
			
			int sum=0;
			System.out.println("Sum of even numbers");
			for (int i=1; i<=50; i++) {
				if(i%2==0) {
					sum+=i;
				}
			}
			
			System.out.println(sum);
			
			int sumOdd=0;
			System.out.println("sum of odd numbers");
			for (int i=1; i<=50; i++) {
				if(i%2==1) {
					sumOdd+=i;
				}
			}
			
			System.out.println(sumOdd);
			
	}

}
