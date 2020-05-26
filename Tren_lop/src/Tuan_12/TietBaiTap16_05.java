package Tuan_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TietBaiTap16_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
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


}
