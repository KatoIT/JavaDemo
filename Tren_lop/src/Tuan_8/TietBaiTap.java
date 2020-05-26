package Tuan_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TietBaiTap {

	private static int[][] matrixs;

	public static void main(String[] args) {
		// Step 1 - File
		File file_in = new File("D:\\DemoJava\\Example_2.txt");
		File file_out = new File("D:\\DemoJava\\Example_2_out.txt");

		matrixs = null;
		
		int min = 0;
		int max = 0;
		int dem = 0;
		

		// readData
		matrixs = TietBaiTap.readData(file_in, matrixs);

		// Show matrix:
		for (int[] is : matrixs) {
			for (int j : is) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		TietBaiTap.Cau2(matrixs, dem, max, min);

		// writeData
		TietBaiTap.writeData(file_out, max, dem, min);

	}
	public static void Cau2(int[][] matrix, int dem, int max, int min) {
		// Seach MAX:
		int sum = 0;
				max = matrix[0][0];
				for (int[] is : matrixs) {
					for (int j : is) {
						if (j > max)
							max = j;
						if (j > 0)
							dem++;
					}
				}
				System.out.println("gia tri Max: " + max + "\nSo phan tu > 0: " + dem);
				

				// sum row and colum => minSum

				int[] ass = matrixs[0];
				for (int j : ass) {
					min += j;
				}

				for (int[] is : matrixs) {
					for (int j : is) {
						sum += j;
					}
					if (min > sum)
						min = sum;
					sum = 0;
				}
				for (int j = 0; j < ass.length; j++) {
					for (int[] k : matrixs) {
						sum += k[j];
					}
					if (min > sum)
						min = sum;
					sum = 0;
				}
				System.out.println("Min = " + min);
	}

	public static int[][] readData(File file_in, int[][] matrix) {
		FileReader fr = null;
		BufferedReader br = null;
		int row = 0;
		int col = 0;
		try {
			// Step 2: Make a file reader
			fr = new FileReader(file_in);

			// Step 3: Make a buffer to read data
			br = new BufferedReader(fr);

			// Step 4: Read data from buffer to variable
			String data;
			// First line: row - column
			data = br.readLine();
			String[] datas = data.split(" ");
			if (datas.length != 2) {
				System.out.println("Error: format data incorrect!");
				return matrix;
			}

			try {
				row = Integer.parseInt(datas[0].trim());
				col = Integer.parseInt(datas[1].trim());
				matrix = new int[row][col];
			} catch (NumberFormatException e) {
				System.out.println("Error: number format incorrect!");
				return matrix;
			}
			if (row <= 0 || col <= 0) {
				System.out.println("Error: row or column is not validate!");
				return matrix;
			}

			int i = 0;
			while ((data = br.readLine()) != null) {
				datas = data.split(" ");
				if (datas.length != col) {
					System.out.println("Error: format data incorrect!");
					return matrix;
				}
				try {
					for (int j = 0; j < datas.length; j++) {
						int int_value = Integer.parseInt(datas[j].trim());
						matrix[i][j] = int_value;
					}
				} catch (NumberFormatException e) {
					System.out.println("Error: number format incorrect!");
					return matrix;
				}
				i++;
			}
			if (i != row) {
				System.out.println("Error: format data incorrect!");
				return matrix;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Step 6: Close all connections
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return matrix;
	}

	public static void writeData(File file, int max, int dem, int min) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);

			bw = new BufferedWriter(fw);

			bw.write("Số các số dương là: " + dem);
			bw.newLine();
			bw.write("Gia tri Max la: " + max);
			bw.newLine();
			bw.write("Tong min la: " + min);
			System.out.println("saveOk!");

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

}

