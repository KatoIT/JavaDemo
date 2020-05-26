package CSDL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SeachX {
	private static String x = "AB";
	private static int n = 6;

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Admin\\Desktop\\Kỳ IV\\CSDL\\PTHFX.txt");
		List<PTHF> F = SeachX.readData(file);
		System.out.println(F);
		SeachX.Phtx(F);
		for (int i = 0; i < n; i++) {
			
		}
	}

	// TIM X+
	public static String Phtx(List<PTHF> F) {
		String dx = x;
		int dem = 0;
		int n = F.size();
		for (int s = 0; s < n; s++) {
			for (int s1 = 0; s1 < F.size(); s1++) {
				String var = F.get(s1).getVt();
//			System.out.println(F.get(s1).getVt());
				dem = 0;
				// ------------------------
				for (int i = 0; i < dx.length(); i++) {
					for (int j = 0; j < var.length(); j++) {
						if (dx.charAt(i) == var.charAt(j)) {
							dem++;
						}
					}
				}
				// ------------------------
				if (dem >= var.length()) {
					int dem2 = 0;
					String var2 = F.get(s1).getVs();
					// ------------------------
					for (int i = 0; i < dx.length(); i++) {
						for (int j = 0; j < var2.length(); j++) {
							if (dx.charAt(i) == var2.charAt(j)) {
								dem2++;
							}
						}
					}
					// ------------------------
					if (dem2 < var2.length()) {
						dx += F.get(s1).getVs();
//					n--;

					}
					dem2 = 0;
				}
			}
		}
		for (int i = 0; i < dx.length(); i++) {

		}

		TreeSet<Character> set = new TreeSet<>();
		for (char c : dx.toCharArray()) {
			set.add(c);
		}

		dx = set.toString();
		System.out.println(dx);
		return dx;
	}

	// readData
	public static List<PTHF> readData(File file) {
		FileReader fr = null;
		BufferedReader br = null;
		List<PTHF> list = new ArrayList<PTHF>();
		try {
			fr = new FileReader(file);

			br = new BufferedReader(fr);

//				System.out.println(file.getAbsolutePath()); 

			String data;

			while ((data = br.readLine()) != null) {

//					System.out.println(data);
				String[] datas = data.split(", ");// Tách giá trị data

				for (String d : datas) {
					String[] data2 = d.split(" - ");
					list.add(new PTHF(data2[0].trim(), data2[1].trim()));

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
