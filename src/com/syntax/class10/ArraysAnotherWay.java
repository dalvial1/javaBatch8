package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[]names= {"Mike", "Burju", "Jack", "Danilo", "Bryan"};

	//String []name;
	//name= {"Sabeen"}; We can not do it in 2 steps this way
	
	System.out.println(names[2]);
	
	//how do i know how many elements I have in the array?
	int size=names.length;
	System.out.println("Size of names array= "+ size);
	
	
	}

}
