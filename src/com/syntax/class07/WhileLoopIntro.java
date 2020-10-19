package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int time=15;

if(time>12) {
	System.out.println("good day"); //code executes 1 time
}
	
	System.out.println("-------WHILE LOOP------");

	//  while(time>12) {
	//  System.out.print("good day"); //INFINATE LOOP
	
	
	while (time>12) {
		System.out.println("good day");
		time--;
	}
	
	
	}

}
