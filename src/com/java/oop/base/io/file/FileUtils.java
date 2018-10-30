package com.java.oop.base.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {
	public static void main(String[] args) {
		try {
			copyFile("E:/test/taohua.txt","E:/test/th.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String src = "E:/linux-0.12";
		String dest = "E:/test";
		File srcFiles = new File(src);
		File destFiles = new File(dest);

		
		copyDirs(srcFiles,destFiles);
		
		
	}
	
	public static void copyFile(String srcPath,String destPath) throws IOException {
		copyFile(new File(srcPath), new File(destPath));
		
	}
	
	public static void copyFile(File srcFile,File destFile) throws IOException {
		InputStream is = new FileInputStream(srcFile);
		OutputStream os = new FileOutputStream(destFile);
		int len = 0;
		byte[] buffer = new byte[1024];
		while(-1 != (len = is.read(buffer))) {
			os.write(buffer, 0, len);
		}
		os.flush();
		is.close();
		os.close();
		
	}
	
	public static void copyDirs(File srcDirs,File destDirs) {
		if(srcDirs.isDirectory()) {
			destDirs = new File(destDirs,srcDirs.getName());
		}
		copyDetails(srcDirs, destDirs);

	}
	
	public static void copyDirs(String srcPath,String destPath) {
		File src = new File(srcPath);
		File dest = new File(destPath);
		copyDirs(src,dest);
	}
	
	public static void copyDetails(File srcDirs,File destDirs) {
		if(srcDirs.isFile()) {
			try {
				copyFile(srcDirs, destDirs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(srcDirs.isDirectory()) {
			destDirs.mkdirs();
			for(File sub:srcDirs.listFiles()) {
				copyDirs(sub, new File(destDirs,sub.getName()));
			}
		}
	}

}
