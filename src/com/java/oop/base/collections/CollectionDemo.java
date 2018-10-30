package com.java.oop.base.collections;

import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args) {
		MyArrayList mal = new MyArrayList();
		mal.add("hello");
		mal.add(1);
		mal.add(new String("Java"));
		System.out.println(mal.size());
		System.out.println(mal.get(0));
		new ArrayList();
	}

}
