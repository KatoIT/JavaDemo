package ThongKe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TK_01 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		Double[] ds = new Double[n];
//
//		for (int i = 0; i < n; i++) {
//			ds[i] = sc.nextDouble();
//		}

		Double[] ds = TK_01.readData();

		Arrays.sort(ds);
//		System.out.println(Arrays.toString(ds));

		/*
		 * Thong ke all
		 */
//		double var = ds[0];
//		int dem1 = 1;
//		for (int i = 1; i < ds.length; i++) {
//			if (ds[i] == var) {
//				dem1++;
//			} else {
//				System.out.println(ds[i - 1] + "\t:\t" + dem1 + "\n-----------------------");
//				dem1 = 1;
//				var = ds[i];
//			}
//		}
//		System.out.println(ds[ds.length - 1] + "\t:\t" + dem1);

		/*
		 * Thong ke theo khoang (a1, a2)
		 */
		double a1 = 3.0;
		double a2 = 3.5;
		int n = 36;
		int dem2 = 1;
		for (int i = 1; i < ds.length; i++) {
			if (ds[i] < a2) {
				dem2++;
			} else {
				System.out.println("[" + a1 + ", " + a2 + ") " + "\t: " + dem2 + "\n-----------------------");
				dem2 = 1;
				a1 = a2;
				a2 += 0.5;
			}
		}
		System.out.println("[" + a1 + ", " + a2 + ") " + "\t: " + dem2 + "\n-----------------------");
		double Sum1 = 0;
		double Sum2 = 0;
		for (int i = 1; i < ds.length; i++) {
			Sum1 += ds[i];
			Sum2 += ds[i]*ds[i];
		}
		System.out.println((Sum1/n) + "\n" + Sum2);
	}

	public static Double[] readData() {
		File file = new File("D:\\DemoJava\\Example\\xstk_1.7.txt");
		FileReader fr = null;
		BufferedReader br = null;
		Double[] ds = null;
		try {
			fr = new FileReader(file);

			br = new BufferedReader(fr);

//			System.out.println(file.getAbsolutePath()); 

			String data;
			data = br.readLine();
			int n = Integer.parseInt(data.trim());
			ds = new Double[n];
			while ((data = br.readLine()) != null) {

//				System.out.println(data);
				String[] datas = data.split(" ");// Tách giá trị data

				for (int i = 0; i < datas.length; i++) {
					double valua = Double.parseDouble(datas[i].trim());// Chuyển data từ String sang Double
					ds[i] = valua;
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {

			try {

				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return ds;
	}

}
