package chap01.introdue;

import java.util.Scanner;

public class inputCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = new String[100];
		int i = 0;
		boolean out = true;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Input: ");
			a[i] = scanner.next();
			System.out.println(a[i]);
			out = (!a[i].equals("end"));
			i++;
			System.out.println(out);
		} while (out);
		scanner.close();
	}

}
