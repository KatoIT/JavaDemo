package chap01.introdue;

import java.util.Scanner;

public class p01_basic {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		int var1 = scanner.nextInt();
		System.out.println(var1);
		scanner.close();
	}
}
