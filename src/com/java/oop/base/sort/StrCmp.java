package com.java.oop.base.sort;

import java.util.Comparator;

public class StrCmp  implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int len1 = o1.length();
		int len2 = o2.length();
		return len1 - len2;
	}
	

}
