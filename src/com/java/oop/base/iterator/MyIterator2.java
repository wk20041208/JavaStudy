package com.java.oop.base.iterator;

import java.util.Iterator;

public class MyIterator2 {

	String[] list = {"c","java","python","c++"};

	
	private  class MyItr implements Iterator<String>{
		int cursor = 0;
		public String next() {
			return list[cursor++] ;
		}
		
		public boolean hasNext() {
			return cursor < list.length;
			
		}
		
		public void remove() {
			
		}
		
	}
	
	public Iterator<String> iterator() {
		return new MyItr();
	}
	public static void main(String[] args) {
		MyIterator2 list = new MyIterator2();
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	

}
