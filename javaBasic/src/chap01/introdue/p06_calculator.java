package chap01.introdue;

import java.util.Scanner;

public class p06_calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number first: ");
		double var1 = sc.nextDouble();
		System.out.println("Number second: ");
		double var2 = sc.nextDouble();
		System.out.println("Calculation: ");
		char var3 = sc.next().charAt(0);
		sc.close();
		
		int k=0;
		if(var3 == '+') k=1;
		else if(var3 == '-') k=2;
		else if(var3 == '*' || var3 == 'x') k=3;
		else if(var3 == '/' || var3 == ':') k=4;
		else if(var3 == '%') k=5;
		double result=0;
		switch(k)
		{
		case 1: 	result = var1 + var2;
					System.out.println(var1 + " " + var3 + " " + var2 + " = " + result);
//					System.out.println("Result: " + result);
					break;
		case 2: 	result = var1 - var2;
					System.out.println(var1 + " " + var3 + " " + var2 + " = " + result);
//					System.out.println("Result: " + result);
					break;
		case 3: 	result = var1 * var2;
					System.out.println(var1 + " " + var3 + " " + var2 + " = " + result);
//					System.out.println("Result: " + result);
					break;
		case 4: 	result = var1 / var2;
					System.out.println(var1 + " " + var3 + " " + var2 + " = " + result);
//					System.out.println("Result: " + result);
					break;
		case 5: 	result = var1 % var2;
					System.out.println(var1 + " " + var3 + " " + var2 + " = " + result);
//					System.out.println("Result: " + result);
					break;
		default: 	System.out.println("Calculation ilegal! ");
					break;
		}
		
	}
	
}
