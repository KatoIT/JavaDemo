package DataStruct;

import java.util.*;
import java.util.Collections;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<Integer> node = new ArrayList<Integer>();
		/*
		 *  -Them vao lan luot cac gia tri a -> node.add(a);
		 *  -Truy cap phan tu thu i -> node.get(i);
		 *  -Thay doi gia tri thu i bang a -> node.set(i , a);
		 *  -Xoa phan tu thu i -> node.remove(i);
		 *  -Xoa toan bo node(ArrayList) -> node.clear(); 
		 *  -Truy cap kich thuoc cua node(ArrayList) -> node.size();
		 * 
		 *  -Collections.sort(node); = Sap xep lai cac node
		 */
		// Them gtri vao node
		node.add(23);
		node.add(15);
		node.add(43);
		node.add(20);
		node.add(8);
		node.add(3);
		node.add(11);
		node.add(33);
		node.add(2,33); //----------------
		// Thay doi gtri
		node.set(0, 9);
		System.out.println(node);
		// Truy suat gtri
		System.out.println(node.get(3));
		//Xoa 1 node
		node.remove(2);
		// Truy xuat Size
		for (int i = 0; i < node.size(); i++) {
			System.out.println(node.get(i));
		}
		// Sap xep
		Collections.sort(node);
		System.out.println(node);
		//-xoa toan bo
		node.clear();
		System.out.println(node.size());

	}

}
