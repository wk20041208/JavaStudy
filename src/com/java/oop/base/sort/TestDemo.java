package com.java.oop.base.sort;

import java.util.Arrays;

public class TestDemo {
	public static void main(String[] args) {
		String[] arr = {"java","hello","c++","python","linux"};
		Utils.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("=============ʹ��Comparator��������=============");
		Utils.sort(arr, new StrCmp());
	}

}
