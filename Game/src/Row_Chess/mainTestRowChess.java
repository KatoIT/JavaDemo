package Row_Chess;

import java.util.Scanner;

public class mainTestRowChess {

	public static void main(String[] args) {
		int[][] rowChess = new int[7][7];
		boolean game = true;
		int scortA = 9;
		int scortB = 9;
		int scortC = 9;

		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 6; j++) {
				rowChess[i][j] = 0;
			}
		}

		showGame(rowChess);

		Scanner scanner = new Scanner(System.in);

		while (game) {

			if (scortC >= 0) {
				scortC--;
				System.out.println("X1: ");
				int x1 = scanner.nextInt() - 1;
				System.out.println("Y1: ");
				int y1 = scanner.nextInt() - 1;
				rowChess[x1][y1] = 1;

				System.out.println("Y1: ");
				int x2 = scanner.nextInt() - 1;
				System.out.println("Y2: ");
				int y2 = scanner.nextInt() - 1;
				rowChess[x2][y2] = 2;

			} else {
				System.out.println("X1a: ");
				int x1a = scanner.nextInt() - 1;
				System.out.println("Y1a: ");
				int y1a = scanner.nextInt() - 1;
				System.out.println("X1b: ");
				int x1b = scanner.nextInt() - 1;
				System.out.println("Y1b: ");
				int y1b = scanner.nextInt() - 1;
				rowChess[x1b][y1b] = 1;
				rowChess[x1a][y1a] = 0;

				System.out.println("X2a: ");
				int x2a = scanner.nextInt() - 1;
				System.out.println("Y2a: ");
				int y2a = scanner.nextInt() - 1;

				System.out.println("X2b: ");
				int x2b = scanner.nextInt() - 1;
				System.out.println("Y2b: ");
				int y2b = scanner.nextInt() - 1;
				rowChess[x2b][y2b] = 2;
				rowChess[x2a][y2a] = 0;

			}

			game = false;

		}
		showGame(rowChess);
		scanner.close();
	}

	// ShowGame----------------------------------------------------------------------
	public static void showGame(int a[][]) {
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 6; j++) {
				int i1 = i - 3;
				int j1 = j - 3;
				if (i1 - j1 == 0 || i1 + j1 == 0 || i1 == 0 || j1 == 0) {
					if (i1 == 0 && j1 == 0)
						System.out.print("     ");
					else
						System.out.print("  " + a[i][j] + "  ");
				} else {
					System.out.print("     ");
				}
			}
			System.out.println("\n");
		}
	}

	// checkRow------------------------------------------------------------------------
	public static boolean checkRow(int a[][], int row, int k) {
		int d = 0;
		for (int i = 0; i < 7; i++) {
			if (a[row][i] == k)
				d++;
		}
		if (d == 3)
			return true;
		return false;
	}

	// checkColumn------------------------------------------------------------------------
	public static boolean checkColumn(int a[][], int col, int k) {
		int d = 0;
		int d1 = 0;
		if (col == 3) {
			for (int i = 0; i < 7; i++) {
				if (a[i][col] == k && i < 3)
					d++;
				if (a[i][col] == k && i > 3)
					d1++;
			}
		} else {
			for (int i = 0; i < 7; i++) {
				if (a[i][col] == k)
					d++;
			}
		}

		if (d == 3 || d1 == 3)
			return true;
		return false;
	}
}
