package com.syntax.class5;
import java.util.Scanner;
public class Review {
	public static void main(String[] args) {
	Scanner scanner;
	scanner=new Scanner(System.in);
	
	//Capturing a sentence with Scanner
	String sentence=scanner.nextLine();
	
	System.out.println("You entered sentence: "+sentence);
	
	//Capturing number
	int number=scanner.nextInt();
	System.out.println("You entered number "+number);
	
	//Capturing 1 word
	String word=scanner.next();
	System.out.println("You entered word: "+word);

	//Capturing 1 character
	char singleCharacter=scanner.next().charAt(0);
	System.out.println("You entered character "+singleCharacter);
			
	}
}

