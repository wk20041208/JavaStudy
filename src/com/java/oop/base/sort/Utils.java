package com.java.oop.base.sort;

import java.util.Comparator;

public class Utils {
//	public static void sort(Object[] arr) {
//		boolean sorted = true;
//		for(int i = 0;i < arr.length - 1;i++) {
//			System.out.println("第" + i + "趟之后，数组的状态为:");
//			for(int j = 1;j <arr.length  -  i;j++ ) {
//				if(((Comparable)arr[j]).compareTo(arr[j + 1]) < 0) {
//					
//					Object tmp  = arr[i];
//					arr[j] = arr[j+1];
//					arr[j + 1] = tmp;
//					
//					sorted = false;
//				}
//	
//			}
//			if(sorted) {
//				break;
//			}
//			visit(arr);
//		}
//	}
	
	public static  void sort(Object[] arr,Comparator com) {
		boolean sorted = true;
		for(int i = 0;i < arr.length - 1;i++) {
			System.out.println("第" + i + "趟之后，数组的状态为:");
			for(int j = 1;j <arr.length - i;j++ ) {
				if(com.compare(arr[j],arr[j-1]) < 0) {
					
					Object tmp  = arr[j];
					arr[j] = arr[j-1];
					arr[j - 1] = tmp;
					
					sorted = false;
				}
	
			}
			if(sorted) {
				break;
			}
			visit(arr);
		}
	}
	public static <T extends Comparable<T>> void sort(T[] arr) {
		boolean sorted = true;
		for(int i = 0;i < arr.length - 1;i++) {
			System.out.println("第" + i + "趟之后，数组的状态为:");
			for(int j = 1;j <arr.length - i;j++ ) {
				if(((Comparable)arr[j]).compareTo(arr[j - 1]) < 0) {
					
					T tmp  = arr[j];
					arr[j] = arr[j-1];
					arr[j - 1] = tmp;
					
					sorted = false;
				}
	
			}
			if(sorted) {
				break;
			}
			visit(arr);
		}
	}
	
	public static void visit(Object[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "---");
		}
		System.out.println("\n");
	}
	
}


