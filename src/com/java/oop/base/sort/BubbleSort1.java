package com.java.oop.base.sort;

public class BubbleSort1 {
//	static int[] source = {7,50,30,15,150,9,1,4};
	static int[] source = {7,50,30,15,150,9,1,4,200,210,250,360};
	public static void main(String[] args) {
		sort1(source);

	}
	
	
	public static void sort1(int[] arr) {
		boolean sorted = true;
		for(int i = 0;i < arr.length - 1;i++) {
			System.out.println("第" + i + "趟之后，数组的状态为:");
			for(int j = 1;j <arr.length  -  i;j++ ) {
				int tmp = 0;
				if(arr[j - 1] > arr[j] ) {
					tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
					sorted = false;
				}
	
			}
			if(sorted) {
				break;
			}
			visit(source);
		}
	}
	
	public static void visit(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "---");
		}
		System.out.println("\n");
	}

}
