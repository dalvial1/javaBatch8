package CHALKBOARD;
import java.util.Scanner;
public class scrap {
	

	public static void main(String[] args) {
	
		int number;
	
		Scanner input=new Scanner(System.in);

	System.out.println("What is your credit score?");
	number=input.nextInt();
	
	if(number<600) {
		System.out.print("Not eligible");
	}else if (number>600 && number<=700) {
	System.out.println("Maybe eligible");
	}else if (number>701 && number <=800) {
		System.out.println("Eligible");
	}else if (number>801);
	System.out.println("Definately eligable");

}
}





