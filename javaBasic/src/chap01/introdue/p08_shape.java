package chap01.introdue;

public class p08_shape {
	public int abs(int x) {
		return x > 0 ? x : x * (-1);
	}

	public static void main(String[] args) {
		int n = 5;
		boolean h = true;
		// Su dung mang 2 chieu
		/*
		 * char a[][] = new char[5][5]; for (int i = 0; i < n; i++) { for (int j = 0; j
		 * < n; j++) { if (i <= j) { a[i][j] = '*'; } else a[i][j] = ' '; } } for (int i
		 * = 0; i < n; i++) { for (int j = 0; j < n; j++) System.out.print(" " +
		 * a[i][j]); System.out.println(" "); }
		 * System.out.println("----------------------------");
		 * 
		 * // Su dung vong lap for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++)
		 * { if (i >= j) System.out.print("* "); else System.out.print("  "); }
		 * System.out.println(" "); }
		 * System.out.println("----------------------------");
		 */
		// Tam giac vuong sao*
		for (int k = 0; k < 4; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (k == 0)
						h = (i < n - j);
					else if (k == 1)
						h = (i <= j);
					else if (k == 2)
						h = (i > n - j - 2);
					else if (k == 3)
						h = (i >= j);
					if (h)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println(" ");
			}
			System.out.println("----------------------------");
		}

		// Tam giac vuong bang so
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j)
					System.out.print((j + 1) + " ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}

		// o vuong sao*
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < n - 1 && j > 0 && j < n - 1 && i > 0) {
					System.out.print("  ");
				} else
					System.out.print("* ");
			}
			System.out.println(" ");
		}
		// Tam giac sao can
		for (int i = 0; i < n * 2 - 1; i++) {
			for (int j = 0; j < n * 2 - 1; j++) {
				if (i >= j && i > n * 2 - j - 3) {
					System.out.print("* ");
				}

				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
		// Tam giac can bang so
		for (int i = 0; i < n; i++) {
			for (int j = 1 - n; j < n; j++) {
				if (j <= i && j >= -i) {
					System.out.print((Math.abs(j) + 1) + " ");
				} else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}
}
