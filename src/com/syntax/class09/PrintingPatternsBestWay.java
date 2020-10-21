package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int r=1; r<=4; r++) {
	for (int c=1; c<=6; c++) {
		System.out.print("*");
	}
	System.out.println();
}
System.out.println("-----------BIG SQUARE--------");            //R MEANS ROWS
                                                                //C MEANS COLUMNS
for (int i=1; i<=6; i++) {
	for (int a =1; a<=12; a++) {
		System.out.print("*");
	}
System.out.println();
}
System.out.println("-----Square of Numbers----");
for(int r=1; r<=4; r++) {
	for(int c=1; c<=5; c++) {
		System.out.print(c);
	}
System.out.println();
}
	}

}
