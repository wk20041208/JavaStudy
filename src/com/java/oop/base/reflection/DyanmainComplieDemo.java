package com.java.oop.base.reflection;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class DyanmainComplieDemo {
	public static void main(String[] args) {
		JavaCompiler complier = ToolProvider.getSystemJavaCompiler();
		int ret = complier.run(null,null,null, "D:\\eclipse-workspace\\HelloWorld.java");
		System.out.println(ret == 0 ? "compile success" : "compile fail");
		
	}

}
