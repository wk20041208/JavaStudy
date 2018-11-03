package com.java.oop.base.io.basestream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ConvertDemo {
	public static void main(String[] args) throws IOException {
		String str = "中国";
		byte[] data = str.getBytes();//默认编码集
		byte[] data2 = str.getBytes("gbk");
		String ret1 = new String(data,"utf-8");
		String ret2 = new String(data2,"utf-8");
		String ret3 = new String(data2,"gbk");
		System.out.println(ret1);
		System.out.println(ret2);
		System.out.println(ret3);
		testConvertStream("E:/test/th.txt");
		
	}
	public static void testConvertStream(String srcPath) throws IOException {
		File file = new File(srcPath);
//		InputStream is = new BufferedInputStream(new FileInputStream(file));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"));
//		int len = 0;
//		byte[] buff = new byte[1024];
//		while(-1 !=(len = is.read(buff))) {
//			String str = new String(buff, 0,len);
//			System.out.println(str);
//		}
		String ret = null;
		while(null != (ret = br.readLine())) {
			System.out.println(ret);
		}
		
	}

}
