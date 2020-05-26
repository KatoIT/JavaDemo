package chap01.introdue;

import java.util.Scanner;

public class p03_operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter real number: ");
		double var1 = sc.nextDouble();
		System.out.println("Enter two integer: ");
		int var2 = sc.nextInt();
		int var3 = sc.nextInt();
		sc.close();
		System.out.println("Number entered: "+ var1 + "\t" + var2 + "\t" + var3);
		double numbermax = Math.max(var1, var2);
		double maxnumber = Math.max(var3, numbermax);

		int numbermin = Math.min(var3, var2);
		double minnumber = Math.min(var1, numbermin);
		
		System.out.println("The biggest number: " + maxnumber);
		System.out.println("The smallest number: " + minnumber);
		
		int range = Math.abs((var2 - var3));
		int randomNumber = 0;
		randomNumber =((int)(Math.random() * range) + numbermin);
		
		System.out.println("Random number: " + randomNumber);
		
		double var4 = Math.ceil(var1);
		double var5 = Math.floor(var1);
		double var6 = Math.round(var1);
		
		System.out.println("Rounded up: " + var4);
		System.out.println("Rounded down: " + var5);
		System.out.println("Nearest rounding: " + var6);
		
	}
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int var1 = sc.nextInt();
		System.out.println("var1 = " + var1);	
		
		System.out.println("Enter a real number: ");
		double var2 = sc.nextDouble();
		System.out.println("var2 = " + var2);
		
		System.out.println("Enter a character: ");
		char var3 = sc.next().charAt(0);
		System.out.println("var3 = " + var3);
		
		System.out.println("Enter a word: ");
		String var4 = sc.next();
		System.out.println("var4 = " + var4);
		
		System.out.println("Enter a line: ");
		sc.nextLine();//Xoa dau enter
		String var5 = sc.nextLine();
		System.out.println("var5 = " + var5);
		sc.close();
//		var1 = 7;
//		var2 = 4.234567;
//		
//		var3 = var1 +(int)var2;
//		var4 = (double)var1 +var2;

//		var1++;
//		var2--;
//		var3 += 1;
//		var4 /= 2;
		
//		System.out.println("var1 = " + var1);
//		System.out.println("var2 = " + var2);
//		System.out.println("var3 = " + var3);
//		System.out.println("var4 = " + var4);
		
		
	}
}
