package com.syntax.class5;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that will read three inputs of scores 
		 * (quiz, mid term, and final scores) and determine the grade 
		 * based on the following rules: 
         * if the average score >=90 → grade=A
         *if the average score >= 70 and <90 → grade=B
         *if the average score>=50 and <70 → grade=C
         *if the average score<50 → grade=F
         */
	
System.out.println("----------TASK1---------");
Scanner input;
int quiz, mid, finalScore, avg;
char grade;

input= new Scanner(System.in);

System.out.println("Please enter your quiz score");
quiz=input.nextInt();

System.out.println("Please enter your mid term score");
mid=input.nextInt();

System.out.println("Please enter your final score");
finalScore=input.nextInt();

avg=(quiz + mid + finalScore)/3;
System.out.println("avg");

if(avg>=90) {
System.out.println("Grade=A"); 
	}else if(avg>=70 && avg<90) {
		System.out.println("Grade=B");
	}else if (avg>=50 && avg<70) {
		System.out.println("Grade=C");{
		}
		}else if(avg>=50 && avg<70) {
			System.out.println("Grade=D");
			}else {
				System.out.println("Grade=F");
			}
		
		}



	}


