package Hangman;

import java.util.Scanner;

public class GameHm {


		public static void main(String[] args) {
			HM kato = new HM();
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap tu khoa: ");
			String a = (String) sc.nextLine();
//			System.out.println(a.length());

			char b[] = new char[a.length()];
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == ' ')
					b[i] = ' ';
				else
					b[i] = '_';
			}

			kato.out(b);
			
			boolean play = true, check = false;
			int scort = 9;

			while (play) {
				System.out.println("\n\t\t\t *: " + scort);
				System.out.println("Enter one character: ");
				char x = sc.next().charAt(0);
				for (int i = 0; i < b.length; i++) {
					if (x == a.charAt(i)) {
						check = true;
						b[i] = x;
					}
				}
				
				if (check == false) scort--;
				
				check = false;
				if (scort < 1) {
					System.out.println("You Lose!\nAnswer: " + a);
					break;
				}

				if (kato.checkAll(b, a)) {
					System.out.println("You Win!");
					break;
				}
				kato.out(b);
			}
			
			sc.close();
		}
	}


