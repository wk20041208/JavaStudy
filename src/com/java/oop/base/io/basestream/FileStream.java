package com.java.oop.base.io.basestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileStream {
	public static void main(String[] args) {
		File src = new File("E:/test/taohua.txt");
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			int len = 0;
			byte[] buffer = new byte[10];
			while(-1  != (len = is.read(buffer))) {
				String ret = new String(buffer,0,len);
				System.out.println(ret);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
