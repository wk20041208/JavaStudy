package com.java.oop.base.io.basestream;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	public static void main(String[] args) throws IOException {
//		testDataStreamWrite();
		testDataStreamRead();
	
		
	}
	public static void testDataStreamWrite() throws IOException{
		int age = 20;
		long num = 1000L;
		double d = 5.256;
		String  msg = "Hello";
		File file = new File("E:/test/raw_type");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(age);
		dos.writeDouble(d);
		dos.writeLong(num);
		dos.writeUTF(msg);
		dos.flush();
		dos.close();
		
	}
	public static void testDataStreamRead() throws IOException {
		File file = new File("E:/test/raw_type");
		DataInputStream dis = new DataInputStream(new FileInputStream(file));
		int ret1 = dis.readInt();
		System.out.println(ret1);
		double d = dis.readDouble();
		System.out.println(d);
		long num = dis.readLong();
		System.out.println(num);
		String msg = dis.readUTF();
		System.out.println(msg);
	}
}
