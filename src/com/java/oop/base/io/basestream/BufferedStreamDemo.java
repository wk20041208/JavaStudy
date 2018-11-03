package com.java.oop.base.io.basestream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class BufferedStreamDemo {
	public static void main(String[] args) {
		String srcPath = "E:/test/Makefile";
//		testBufferedByte(srcPath);
		testBufferChars(srcPath);
		
		
		
	}
	public static  void testBufferedByte(String srcPath) {
		File file = new File(srcPath);
		try {
			InputStream is =new BufferedInputStream(new FileInputStream(file));
			byte[] buffer = new byte[1024];
			int len = 0;
			while(-1 != (len = is.read(buffer))) {
				String ret = new String(buffer,0,len,"gbk");
				System.out.println(ret);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void testBufferChars(String srcPath) {
		File file = new File(srcPath);
		try {
			BufferedReader br =new BufferedReader(new FileReader(file));
			String buffer = null;
			while(null != (buffer = br.readLine())) {
				System.out.println(buffer);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
