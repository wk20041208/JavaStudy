package com.java.oop.base.io.basestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ArrayStream {
	public static void main(String[] args) throws IOException {
		//testByteArrayRead();
		testByteArrayWrite();
		
		
	}
	//字节数组操作流，一般是两台电脑之间
	public static void testByteArrayRead() throws IOException {
		String src = "02.12.91 - Changed to static variables to indicate need for reset and recalibrate. This makes some things easier (output_byte reset checking etc), and means less interrupt jumping in case of errors, so the code is hopefully easier to understand.";
		byte[] resource = src.getBytes();
		InputStream is = new ByteArrayInputStream(resource);
		byte[] buff = new byte[1024];
		int len = 0;
		while(-1  !=(len = is.read(buff))) {
			String ret = new String(buff, 0, len);
			System.out.println(ret);
		}
		//因为是内存，次方法可以调用，但是无效
		is.close();	
	}
	public static void testByteArrayWrite() throws IOException {
		String src = "02.12.91 - Changed to static variables to indicate need for reset and recalibrate. This makes some things easier (output_byte reset checking etc), and means less interrupt jumping in case of errors, so the code is hopefully easier to understand.";
		byte[] resource = src.getBytes();
		byte[] dest;
		//此处特别注意，未关联dest
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write(resource, 0,resource.length );
		dest = bos.toByteArray();
		System.out.println(new String(dest));
		bos.close();
		
	}

}
