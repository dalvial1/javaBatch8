package com.syntax.class10;

public class ArrayClassAssignemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TASK 1 Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
			
	char [] grade= {'A','B','C','D','F','G','H'};
	char sendValue=grade[1];
	
	String[] names= {"Mike","Burju","Jack","Danilo","Bryan","Danny"};
	String secondVal=names[1];	
	
	//get all value grades from grade array
	for(int i=0; i<grade.length;i++) {
		
		char valueFromArray=grade[i];
		System.out.println(valueFromArray);
	}
	
	}

}
