package Tuan_5;

import java.util.ArrayList;
import java.util.List;

public class Main_test {

	public static void main(String[] args) {

		String val = "0.2";
		val = val.substring(1, val.length());
		System.out.println(val);
//		val = "-" + val;
//		val = val.substring(1, val.length() - 1);
//		System.out.println(val);
//		val = "0" + val;
		Double vava = Double.parseDouble(val);
		
		System.out.println(vava);
		
		
		
//		point2d p01_2d = new point2d(0, 4);
//		point2d p02_2d = new point2d(8, 0);
//		point3d p01_3d = new point3d(5, 0, 0);
//		Circle  p01_ci = new Circle(0, 0, 3);
//		Circle  p02_ci = new Circle(13, 13, 12);
// 		
//		List<Calculations> listShape = new ArrayList<Calculations>();
//		
//		listShape.add(p01_2d);
//		listShape.add(p02_2d);
//		listShape.add(p01_3d);
//		listShape.add(p01_ci);
//		listShape.add(p02_ci);
//
//		// tong khoang cach
//		double sum = 0.0;
//		for (Calculations point2d : listShape) {
//			sum += point2d.distance();
//		}
//		System.out.println("tong kc: " + sum);
//
//
//		// showinfor
//		for (Calculations point2d : listShape) {
//			System.out.println(point2d);
//		}
	}

}
