package CHALKBOARD;

import java.util.Scanner;

public class zz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);

		System.out.println("Input a number: ");
		int num=in.nextInt();

		for (int i=0; i<10; i++){
		  System.out.println(num+ " x " + (i+1) + " = " +
		  (num*(i+1)));
		}

		 }
		}
