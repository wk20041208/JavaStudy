package com.java.oop.base.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionNewIntance {
	public static void main(String[] args) {
		try {
			Class<User> cls = (Class<User>)Class.forName("com.java.oop.base.reflection.User");
			Constructor<User> c = cls.getDeclaredConstructor(String.class,int.class);
			User u = c.newInstance("java",25);
			Method m = cls.getDeclaredMethod("setAge",int.class);
			m.invoke(u,20);
			System.out.println(u.getAge());
			System.out.println(u);
			//直接操作私有属性
			Field f = cls.getDeclaredField("name");
			f.setAccessible(true);
			f.set(u, "linux");
			System.out.println(u.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
