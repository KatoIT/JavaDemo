package Tuan_6;

import java.util.ArrayList;
import java.util.List;

public class Main_t6 {

	public static void main(String[] args) {

		straight_line dt01 = new straight_line(3, 4);
		straight_line dt02 = new straight_line(1, 0);
		straight_line dt03 = new straight_line(-2, 3);
		straight_line dt04 = new straight_line(10, 5);

		Circle_tt6 tr01 = new Circle_tt6(0, 0, 3);
		Circle_tt6 tr02 = new Circle_tt6(1, 4, 1);
		Circle_tt6 tr03 = new Circle_tt6(2, 5, 2);
		Circle_tt6 tr04 = new Circle_tt6(3, 6, 4);

		int d = 0;
		double sum = 0;
		
//		List<straight_line> listDt = new ArrayList<straight_line>();
//		List<Circle_tt6> listTr = new ArrayList<Circle_tt6>();
//		
//		listDt.add(dt01);
//		listDt.add(dt02);
//		listDt.add(dt03);
//		listDt.add(dt04);
//		
//		listTr.add(tr01);
//		listTr.add(tr02);
//		listTr.add(tr03);
//		listTr.add(tr04);
//		for (straight_line straight_line : listDt) {
//			if(straight_line.check(0, 0)) d++;
//		}
//		
//		for (straight_line straight_line : listDt) {
//			sum += straight_line.distance();
//		}
//		
//		for (Circle_tt6 circle_tt6 : listTr) {
//			if(circle_tt6.check(0, 0)) d++;
//		}
//		for (Circle_tt6 circle_tt6 : listTr) {
//			sum += circle_tt6.distance();
//		}
//		// Showinfo
//		for (straight_line straight_line : listDt) {
//			System.out.println(straight_line);
//		}
//		for (Circle_tt6 circle_tt6 : listTr) {
//			System.out.println(circle_tt6);
//		}
		
		
		List<Shape_t6> listShape = new ArrayList<Shape_t6>();

		listShape.add(dt01);
		listShape.add(dt02);
		listShape.add(dt03);
		listShape.add(dt04);
		listShape.add(tr01);
		listShape.add(tr02);
		listShape.add(tr03);
		listShape.add(tr04);


		for (Shape_t6 circle_tt6 : listShape) {
			sum += circle_tt6.distance();
		}

		for (Shape_t6 circle_tt6 : listShape) {
			if (circle_tt6.check(0, 0))
				d++;
		}
		
		// Showinfo
		for (Shape_t6 circle_tt6 : listShape) {
			System.out.println(circle_tt6);
		}

		System.out.println("So hinh chua diem A(0, 0): " + d);
		System.out.println("Tong khoang cach: " + sum);

	}

}
