package com.java.oop.base.generic;

import java.util.ArrayList;
import java.util.List;

//java���޷�������
public class GenericAndArray {
	public static void main(String[] args) {
		//List<String>[] ls = new ArrayList<>[10];����
		List<?>[]  ls = new ArrayList<?>[10];//���������������޷����Ԫ��
//		List<String>[] lsa = new List<String>[10]; // Not really allowed.    
//		Object o = lsa;    
//		Object[] oa = (Object[]) o;    
//		List<Integer> li = new ArrayList<Integer>();    
//		li.add(new Integer(3));    
//		oa[1] = li; // Unsound, but passes run time store check    
//		String s = lsa[1].get(0); // Run-time error: ClassCastException.
		List<?>[] lsa = new List<?>[10]; // OK, array of unbounded wildcard type.    
		Object o = lsa;    
		Object[] oa = (Object[]) o;    
		List<Integer> li = new ArrayList<Integer>();    
		li.add(new Integer(3));    
		oa[1] = li; // Correct.    
		Integer i = (Integer) lsa[1].get(0); // OK 
		System.out.print(lsa[0]);
	}

}
