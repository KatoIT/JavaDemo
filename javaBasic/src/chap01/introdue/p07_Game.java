package chap01.introdue;

import java.util.Scanner;

public class p07_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lucky number range from 00 to 49: ");
		int min = 0, max = 49;
		int range = max - min + 1;
		int number;
		boolean k = false;
		int luckyNumber = (int) (Math.random() * range) + min;
//		System.out.println(luckyNumber);
		do {
			System.out.println("Enter your choice: ");
			number = sc.nextInt();
			if (number == luckyNumber) {
				k = true;
				System.out.println("Congratulations on finding the lucky number!" + "\nYour score is: " + range);
			} else {
				range--;
				if (number > luckyNumber)
					System.out.println("Entered number > LuckyNumber! ");
				else
					System.out.println("Entered number < LuckyNumber!");
			}
		} while (k == false);
		sc.close();
	}
}
