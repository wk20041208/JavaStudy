package com.java.oop.base.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RelectionBase {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		String className = "com.java.oop.base.reflection.User";
		Class<?> cls = null;
		try {
			cls = Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class cls2 = User.class;
		Class cls3 = new User().getClass();
		System.out.println(cls.hashCode());
		System.out.println(cls2.hashCode());
		System.out.println(cls3.hashCode());
		int[] arr1 = new int[10];
		int [] arr2 = new int[15];
		double[] arr3 = new double[20];
		int[][] arr4 = new int[20][];
		System.out.println(arr1.getClass() == arr2.getClass());
		System.out.println(arr1.getClass().hashCode() == arr4.getClass().hashCode());
		System.out.println(arr3.getClass().hashCode() == arr1.getClass().hashCode());
		//只能获取申明为public的字段
		Field[] fds = cls.getFields();
		//可以获得所有的属性
		Field[] f = cls.getDeclaredFields();
		for(Field fd:f) {
			System.out.println(fd);
		}
		try {
			cls.getDeclaredMethod("setName",String.class);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method[] methods = cls.getDeclaredMethods();
		for(Method m:methods) {
			System.out.println(m);
		}
		Constructor[] cs = cls.getConstructors();
		for(Constructor c :cs) {
			System.out.println(c);
		}
		Constructor c = cls.getDeclaredConstructor(String.class,int.class);
	}

}
