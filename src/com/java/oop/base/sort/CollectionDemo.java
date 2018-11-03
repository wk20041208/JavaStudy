package com.java.oop.base.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(120);
		list.add(50);
		list.add(20);
		list.add(30);
		list.add(70);
		list.add(14);
		list.add(15);
		list.add(25);
		list.add(35);
		System.out.println(list.toString());
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}

}
