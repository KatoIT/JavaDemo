package chap01.introdue;

import java.util.Scanner;

public class p04_condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number corresponding to the day of the week (Sunday corresponds to the number 8): ");
		int var1 = sc.nextInt();
		sc.close();
		
		switch(var1) {
		case 2: System.out.println("Monday!");
				break;
		case 3: System.out.println("Tuesday!");
				break;
		case 4: System.out.println("Wednesday!");
				break;
		case 5: System.out.println("Thursday!");
				break;
		case 6: System.out.println("Friday!");
				break;
		case 7: System.out.println("Saturday!");
				break;
		case 8: System.out.println("Sunday!");
				break;
		default: System.out.println("Not a day of the week!");
				break;
		}
	}
		public static void main1(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter integer: ");
			int var1 = sc.nextInt();
			sc.close();
			if(var1 >= 0) {
				if(var1 % 2 == 0 ) System.out.println("The number entered is a even positive integer!");
				else System.out.println("The number entered is a odd positive integer!");
			}
			else {
				if(var1 % 2 == 0 ) System.out.println("The number entered is a even nagetive integer!");
				else System.out.println("The number entered is a odd nagetive integer!");				
			}
		}
}
