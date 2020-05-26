package Tuan_8;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * \nWork_2: Viết chương trình nhập vào 1 mảng số int, nhập 1 vị trí i, xuất
		 * phần tử thứ i nếu i hợp lệ. Ngược lại xuất thông báo “Ngoài tầm phủ sóng”.
		 */

		int[] var1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("i = {0, 1, 2,..., n}\nNhap vao i:  ");
			int i = sc.nextInt();
			System.out.println("Var1[" + i + "] =  " + var1[i]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ngoài tầm phủ sóng");
		}
		catch (Exception e) {
			System.out.println("Lỗi rồi!!!");
		}
		finally {
			System.out.println("\n---TheEnd---");
		}
		sc.close();
	}

}
