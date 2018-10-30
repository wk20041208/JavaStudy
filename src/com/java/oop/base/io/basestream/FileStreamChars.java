package com.java.oop.base.io.basestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileStreamChars {
	public static void main(String[] args) {
		File file  = new File("E:/test/taohua.txt");
		Reader reader = null;
		try {
			reader = new FileReader(file);
			int len = 0;
			char[] buffer = new char[20];
			while(-1 != (len = reader.read(buffer))) {
				String ret = new String(buffer, 0, len);
				System.out.println(ret);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
