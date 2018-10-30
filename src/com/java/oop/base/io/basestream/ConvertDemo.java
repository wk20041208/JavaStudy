package com.java.oop.base.io.basestream;

import java.io.UnsupportedEncodingException;

public class ConvertDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "中国";
		byte[] data = str.getBytes();//默认使用utf-8编码
		byte[] data2 = str.getBytes("gbk");
		String ret1 = new String(data,"utf-8");
		String ret2 = new String(data2,"utf-8");
		String ret3 = new String(data2,"gbk");
		System.out.println(ret1);
		System.out.println(ret2);
		System.out.println(ret3);
		
	}

}
