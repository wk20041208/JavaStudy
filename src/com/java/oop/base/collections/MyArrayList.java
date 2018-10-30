package com.java.oop.base.collections;

public class MyArrayList {
	private Object[] elements;
	private int size;
	
	
	public MyArrayList() {
		this(10);
	}
	
	public MyArrayList(int initialCapacity) {
		elements = new Object[initialCapacity];
	}
	public void add(Object obj) {
		if(size >= elements.length) {
			Object[] newBase = new Object[size * 2 + 1]; 
			System.arraycopy(elements, 0, newBase, 0, elements.length);
			elements = newBase;
		}
		elements[size++] = obj;
	}
	
	public int size() {
		return this.size;
	}
	
	public Object get(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return elements[index];
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
}
