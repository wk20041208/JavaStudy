package com.java.oop.base.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		String ret = ed.openFile();
		System.out.println(ret);

	}
	
	public String openFile() {
		try {
			FileInputStream fis = new FileInputStream("d:/wangkun8.txt");
			int s = fis.read();
			System.out.println("bbb");
			return "in try";
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("catching....");
			e.printStackTrace();
			return "in filenotfoundcatch...";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "in IOException catch...";
		}finally {
			System.out.println("finally....");
			return "finally result";
		}
	}

}

