package DataStruct;

import java.util.*;
public class Link_List {

	public static void main(String[] args) {
		LinkedList<Integer> node = new LinkedList<Integer>();
		node.addFirst(10);
		node.add(6);
		node.add(7);
		node.add(4);
		node.add(3);
		node.add(2);
		node.add(9);
		node.add(0);
		node.add(1);
		node.addLast(5);
		System.out.println(node);
		node.set(3, 11);
		System.out.println(node);
		node.add(5, 12);
		System.out.println(node.get(5));
		node.remove();
		System.out.println(node);
		int a = node.pop();
		System.out.println(a);
		node.push(5);
		System.out.println(node);
		Collections.sort(node);
		System.out.println(node);
		for(Integer i : node) {
			System.out.println(i);
		}
		if(node.contains(6)) System.out.println("ok");
		else System.out.println("not ok");
	}

}
