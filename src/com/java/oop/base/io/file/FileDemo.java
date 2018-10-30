package com.java.oop.base.io.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo {
	public static void main(String[] args) {
//		test1();
//		printFileList(new File("E:/test"));
//		printFiles("E:/test");
		filterFiles("E:/test");
//		test("E:/test");

	}
	
	public static void test1() {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
//		File src = new File("E:/java/io/2.jpg");
//		File src = new File("E:/java/io","2.jpg");
		File src = new File("2.jpg");
		System.out.println(src.getName());
		System.out.println(src.getParent());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
	}
	public static void printFileList(File path) {
		File src = path;
		if(src == null || !src.exists()) {
			return ;
		}
		System.out.println(src.getAbsolutePath());
		if(src.isDirectory()) {
			for(File  sub : src.listFiles()) {
				printFileList(sub);
			}
			
		}
	}
	
	public static void printFiles(String path) {
		File src = new File(path);
		if(src == null || !src.exists()) {
			return ;
		}
		//System.out.println(src.getAbsolutePath());
		if(src.isDirectory()) {
			for(File f:src.listFiles()) {
				printFiles(f.getAbsolutePath());
			}
		}
	}
	public static void filterFiles(String path) {
		File src = new File(path);
		if(src == null || !src.exists()) {
			return ;
		}
//		System.out.println(src.getAbsolutePath());
		if(src.isDirectory()) {
			File[] list = src.listFiles(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
//					System.out.println("dir is---------->" +dir);
					return name.endsWith(".c");
				}
			});
			for(File file:list) {
				System.out.println(file.getAbsolutePath());
			}
			for(File f:src.listFiles()) {
				filterFiles(f.getAbsolutePath());
			}
		}
	}
	
	public static void test(String path) {
		File src = new File(path);
		File[] files = src.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".c");
			}
		});
		for(File file: files) {
			System.out.println(file.getAbsolutePath());
		}
	}

}
