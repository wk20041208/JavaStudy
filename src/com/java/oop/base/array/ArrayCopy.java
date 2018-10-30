package com.java.oop.base.array;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arrSrc = {1,2,3,4};
		int[] arrDest = new int[4];
		System.arraycopy(arrSrc, 0, arrDest, 0, arrSrc.length);
		System.out.println(Arrays.toString(arrDest));
	}

}
