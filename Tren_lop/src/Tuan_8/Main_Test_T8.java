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


public class Main_Test_T8 {

	public static void main(String[] args) {
		File file_in = new File(Constants.FILE_IN);
		File file_out = new File(Constants.FILE_OUT);
		
		List<Operator> list = Main_Test_T8.readData(file_in);
		System.out.println(list);
		
		double sumDistance = 0;
		double maxDistance = 0;
		for (Operator op : list) {
			sumDistance += op.distance(); 
//			System.out.println("kc: " + op.distance());
		}
		System.out.println("Tong kc: " + sumDistance);
		for (Operator op : list) {
			maxDistance = Math.max(maxDistance, op.distance());
		}
		System.out.println("Circle_Line_center_0:   "
				+ " x^2 + y^2 = " + maxDistance + "^2");
		// Them hinh
//		list.add(new Straight_Line(3.4, 4.5));
		
		Main_Test_T8.writeDataCircle(file_out, list);
	}

	// readData
	public static List<Operator> readData(File file) {
		FileReader fr = null;
		BufferedReader br = null;
		List<Operator> listShape = new ArrayList<Operator>();
		try {
			fr = new FileReader(file);

			br = new BufferedReader(fr);

//				System.out.println(file.getAbsolutePath()); 

			String data;
			int dem = 1;

			while ((data = br.readLine()) != null) {
//					System.out.println(data);
				String[] datas = data.split(", ");
				double[] var = new double[datas.length];

				for (int i = 0; i < datas.length; i++) {
					var[i] = Double.parseDouble(datas[i]);
				}
				if (datas.length == 2) {
					listShape.add(new Straight_Line(var[0], var[1]));
				} else if(datas.length == 3){
					listShape.add(new Circle_Line(var[0], var[1], var[2]));
				} else {
					System.out.println("Error: data input not "
							+ "validate!( Row: " + dem +  ")");
				}
				dem++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found!");

		} catch (IOException e) {
			System.out.println("Error: Could not open file!");

		} catch (Exception e) {
			System.out.println("Error: ?");
		}finally {

			try {

				br.close();
				fr.close();
			} catch (IOException e) {
				System.out.println("Error: Could not close file!");
			}

		}
		return listShape;
	}

	// writeFile
	public static void writeDataCircle(File file, List<Operator> list) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);

			bw = new BufferedWriter(fw);
			for (Operator op : list) {
				bw.write(op.writeFile());
				bw.newLine();
			}
			
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
}
