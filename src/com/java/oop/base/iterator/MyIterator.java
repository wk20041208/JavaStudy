package com.java.oop.base.iterator;

public class MyIterator {
	int cursor = 0;
	String[] list = {"c","java","python","c++"};
	public String next() {
		return list[cursor++] ;
	}
	
	public boolean hasNext() {
		return cursor < list.length;
		
	}
	
	public void remove() {
		
	}
	public static void main(String[] args) {
		MyIterator myList = new MyIterator();
		while(myList.hasNext()) {
			System.out.println(myList.next());
		}	
	}
	

}
