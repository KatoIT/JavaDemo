package Tuan_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class In_OutputFile {

	public static void main(String[] args) { 
		File file_in = new File("D:\\\\Java_new\\\\Game\\\\data.txt");//D:\\DemoJava\\Example_1.txt
		File file_ou = new File("D:\\DemoJava\\Example_1_out.txt");
		int d = 0, sum = 0;
		
		System.out.println("Đọc file: " + file_in.getName()  + "\n( " + file_in.getPath() + ")");
		List<Integer> list = readData(file_in);
		System.out.println("OK!\n\nTính toán...");

//		In_OutputFile.checkFile(file);

		for (Integer integer : list) {
			sum += integer;
			if (integer > 0)
				d++;
		}
		System.out.println("Tổng giá trị là: " + sum + "\nSố các giá trị dương là: " + d);
		System.out.println("\nGhi file: "  + file_ou.getName() + "\n( " + file_ou.getPath() + ")");
		writeData(file_ou, sum, d);
	}

	// readData
	public static List<Integer> readData(File file) {
		FileReader fr = null;
		BufferedReader br = null;
		List<Integer> list = new ArrayList<Integer>();
		try {
			fr = new FileReader(file);

			br = new BufferedReader(fr);

//			System.out.println(file.getAbsolutePath()); 

			String data;

			while ((data = br.readLine()) != null) {

//				System.out.println(data);
				String[] datas = data.split(" ");// Tách giá trị data

				for (String d : datas) {
					int valua = Integer.parseInt(d.trim());// Chuyển data từ String sang Double
					list.add(valua);
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
		return list;
	}

	// writeFile
	public static void writeData(File file, int sum, int dem) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);

			bw = new BufferedWriter(fw);

			bw.write("Số các số dương là: " + dem);
			bw.write("\nTong cac gia tri la: " + sum);
			System.out.println("OK!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {

			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	// checkFile
	public static void checkFile(File file) {
		if (file.isFile()) {
			System.out.println("File: " + file.getAbsolutePath());
			System.out.println("File: " + file.length());
		} else {
			System.out.println("Foder: " + file.getAbsolutePath());
			File[] foder = file.listFiles();
			for (File file2 : foder) {
				In_OutputFile.checkFile(file2);
			}
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
