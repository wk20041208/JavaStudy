package com.java.oop.base.array;

public class WrappperDemo {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int result = Integer.parseInt("11",2);//将给定的数字按指定进制转换为10进制数
		System.out.println(result);
		int a = new Integer(1000).intValue();
		System.out.println(a);
		Integer d1 = 1024;
		Integer d2 = 1024;
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		Integer d3 = 100;
		Integer d4 = 100;
		System.out.println(d3 == d4);//true 右值在[-128,127]之间的数字仍然作为基本数据类型处理
		System.out.println(d3.equals(d4));
	}

}
