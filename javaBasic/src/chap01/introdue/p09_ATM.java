package chap01.introdue;

import java.util.Scanner;

public class p09_ATM {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int FIVE_HUNDRED_THOUSAND = 500;
		final int TWO_HUNDRED_THOUSAND = 200;
		final int ONE_HUNDRED_THOUSAND = 100;
		final int FIFTY_THOUSAND = 50;
		final int TWEENTY_THOUSAND = 20;
		final int TEN_THOUSAND = 10;

		int fiveHundred = 0;
		int twoHundred = 0;
		int oneHundred = 0;
		int fifty = 0;
		int tweenty = 0;
		int ten = 0;

		int total = 0;
		System.out.println("Enter the amount your want to withdraw:\n(Smallest odd number is 10000 VND)");
		int theAmount = s.nextInt();

		fiveHundred = theAmount / FIVE_HUNDRED_THOUSAND; // 500

		if (theAmount % FIVE_HUNDRED_THOUSAND != 0) {
			theAmount = theAmount - (fiveHundred * FIVE_HUNDRED_THOUSAND);
			twoHundred = theAmount / TWO_HUNDRED_THOUSAND; // 200

			if (theAmount % TWO_HUNDRED_THOUSAND != 0) {
				theAmount = theAmount - (twoHundred * TWO_HUNDRED_THOUSAND);
				oneHundred = theAmount / ONE_HUNDRED_THOUSAND; // 100

				if (theAmount % ONE_HUNDRED_THOUSAND != 0) {
					theAmount = theAmount - (oneHundred * ONE_HUNDRED_THOUSAND);
					fifty = theAmount / FIFTY_THOUSAND; // 50

					if (theAmount % FIFTY_THOUSAND != 0) {
						theAmount = theAmount - (fifty * FIFTY_THOUSAND);
						tweenty = theAmount / TWEENTY_THOUSAND; // 20

						if (theAmount % TWEENTY_THOUSAND != 0) {
							theAmount = theAmount - (tweenty * TWEENTY_THOUSAND);
							ten = theAmount / TEN_THOUSAND; // 10
						}
					}
				}
			}
		}
		total = fiveHundred + twoHundred + oneHundred + fifty + tweenty + ten;
		System.out.println("The including : " + total);
		if (fiveHundred != 0)
			System.out.println("Face valua of 500.000 VND : " + fiveHundred + " coin");
		if (twoHundred != 0)
			System.out.println("Face valua of 200.000 VND : " + twoHundred + " coin");
		if (oneHundred != 0)
			System.out.println("Face valua of 100.000 VND : " + oneHundred + " coin");
		if (fifty != 0)
			System.out.println("Face valua of  50.000 VND : " + fifty + " coin");
		if (tweenty != 0)
			System.out.println("Face valua of  20.000 VND : " + tweenty + " coin");
		if (ten != 0)
			System.out.println("Face valua of  10.000 VND : " + ten + " coin");
		s.close();
	}
}
