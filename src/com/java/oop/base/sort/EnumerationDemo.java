package com.java.oop.base.sort;

import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;

//Enumeration 有一个直接子类StringTokenizer
public class EnumerationDemo {
	public static void main(String[] args) {
		Vector<String>  v = new Vector<>();
		v.add("C");
		v.add("C++");
		v.add("Java");
		v.add("Python");
		v.add("Go");
		Enumeration<String> ele = v.elements();
		while(ele.hasMoreElements()) {
			System.out.print(ele.nextElement() + "  ");
		}
		System.out.println("");
		testStringTokenizer();
	}
	
	public static void testStringTokenizer() {
		String str = "oracle;mysql;sqlserver;redis";
		StringTokenizer st = new StringTokenizer(str,";");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "  " );
		}
		System.out.println();
		
	}

}




