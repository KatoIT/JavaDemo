package chap01.introdue;

import java.util.Scanner;

public class soduku_game {
	public static boolean line(int a[][], int b, int c, int d) {
		boolean x = false;
		for (int i = 0; i < 9; i++) {
			if (d == a[b][i])
				x = true;
		}
		return x;
	}

	public static boolean column(int a[][], int b, int c, int d) {
		boolean x = false;
		for (int i = 0; i < 9; i++) {
			if (d == a[i][c])
				x = true;
		}
		return x;
	}

	public static boolean check(int a[][], int b1, int c1, int b2, int c2, int d) {
		boolean x = false;
		for (int i = b1; i < c1; i++) {
			for (int j = b2; j < c2; j++) {
				if (d == a[i][j])
					x = true;
			}
		}
		return x;
	}

	public static boolean square(int a[][], int b, int c, int d) {
		boolean x = false;
		if (b < 3) {
			if (c < 3)
				x = check(a, 0, 3, 0, 3, d);
			else if (c < 6)
				x = check(a, 0, 3, 3, 6, d);
			else
				x = check(a, 0, 3, 6, 9, d);
		} else {
			if (b < 6) {
				if (c < 3)
					x = check(a, 3, 6, 0, 3, d);
				else if (c < 6)
					x = check(a, 3, 6, 3, 6, d);
				else
					x = check(a, 3, 6, 6, 9, d);
			} else {
				if (c < 3)
					x = check(a, 6, 9, 0, 3, d);
				else if (c < 6)
					x = check(a, 6, 9, 3, 6, d);
				else
					x = check(a, 6, 9, 6, 9, d);
			}
		}
		return x;
	}

	public static boolean all(int a[][]) {
		boolean x = false;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (0 == a[i][j])
					x = true;
			}
		}
		return x;
	}

	public static void output(int a[][]) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
				System.out.print(" | " + a[i][j]);
			System.out.println("\n--------------------------------------");
		}
	}
	public static void main(String[] args) {
		boolean k = false;
		Scanner s = new Scanner(System.in);
		int a[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },

				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },

				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

		output(a);
		System.out.println("----------------------------");
		// -------------------------------------------------------
		int b[][] = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
				if (a[i][j] != 0)
					b[i][j] = 1;
				else
					b[i][j] = 0;
		}
//		output(b);
		// -------------------------------------------------------
		while (k == false) {
			System.out.println("Vi tri dien:\n Hang so:");
			int var1 = -1 + s.nextInt();
			System.out.println(" Cot so:");
			int var2 = -1 + s.nextInt();
			if (b[var1][var2] == 1)
				System.out.println("Vi tri nay khong duoc thay doi!");
			else {
				System.out.println("Enter number:");
				int var3 = s.nextInt();
				
				if (line(a, var1, var2, var3)) {
					System.out.println("So da ton tai trong hang!");
					k = false;
					continue;
				} else {
					if (column(a, var1, var2, var3)) {
						System.out.println("So da ton tai trong cot!");
						k = false;
						continue;
					} else {
						if (square(a, var1, var2, var3)) {
							System.out.println("So da ton tai trong o vuong nho!");
							k = false;
							continue;
						} else {
							a[var1][var2] = var3;
							output(a);
							System.out.println("----------------------------");
							if (all(a)) {
								k = false;
								continue;
							} else {
								k = true;
								System.out.println("Chuc mung ban da hoan thanh tro choi!!! <3 <3 <3 ");
								output(a);
								System.out.println("Chuc mung ban da hoan thanh tro choi!!! <3 <3 <3 ");

							}
						}
					}
				}
			}
		}
		s.close();
	}
}
