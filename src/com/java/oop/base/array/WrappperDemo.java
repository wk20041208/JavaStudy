package com.java.oop.base.array;

public class WrappperDemo {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int result = Integer.parseInt("11",2);//�����������ְ�ָ������ת��Ϊ10������
		System.out.println(result);
		int a = new Integer(1000).intValue();
		System.out.println(a);
		Integer d1 = 1024;
		Integer d2 = 1024;
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		Integer d3 = 100;
		Integer d4 = 100;
		System.out.println(d3 == d4);//true ��ֵ��[-128,127]֮���������Ȼ��Ϊ�����������ʹ���
		System.out.println(d3.equals(d4));
	}

}
