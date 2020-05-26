package Tuan_8;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * Work_1: Viết chương trình chạy bằng đối số dòng lệnh buộc nhập các tham số
		 * cho chương trình là các ký số. Nếu nhập ký tự thì báo lỗi “Không nhập ký tự”.
		 */

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Nhap vao cac ky tu so:\na = ");
			double var1 = scanner.nextDouble();
			System.out.println("Nhap vao cac ky tu so:\nb = ");
			double var2 = scanner.nextDouble();
			System.out.println("Nhap vao cac ky tu so:\nc = ");
			double var3 = scanner.nextDouble();
			System.out.println("Nhap vao cac ky tu so:\nd = ");
			double var4 = scanner.nextDouble();
			System.out.println(var1 + "\t" + var2 + "\t" + var3 + "\t" + var4);
		} catch (Exception e) {
			System.out.println("Lỗi! Không nhập ký tự");
		} finally {
			System.out.println("\n---TheEnd---");
		}

		scanner.close();

	}

}
