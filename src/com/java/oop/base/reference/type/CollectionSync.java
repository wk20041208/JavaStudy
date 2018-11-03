package com.java.oop.base.reference.type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSync {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("c");
		list.add("python");
		List<String> newList = Collections.synchronizedList(list);
	}

}
