package com.java.oop.base.io.basestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//testObjectStreamWrite();
		testObjectStreamRead();
	}
	public static void testObjectStreamRead() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("E:/test/object_type");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Employee emp = (Employee)ois.readObject();
		System.out.println(emp.getSalary());
	}
	public static void testObjectStreamWrite() throws FileNotFoundException, IOException {
		Employee emp = new Employee("linus",130000.0);
		File file = new File("E:/test/object_type");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(emp);
		oos.close();
	}

}
