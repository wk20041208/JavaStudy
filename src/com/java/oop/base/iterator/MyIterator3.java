package com.java.oop.base.iterator;

import java.util.Iterator;

public class MyIterator3 implements Iterable<String> {

	String[] list = {"c","java","python","c++"};
//	int cursor = 0;
	
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			int cursor = 0;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return cursor < list.length;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return list[cursor++] ;
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				Iterator.super.remove();
			}
			
		};
	}
	public static void main(String[] args) {
		MyIterator3 list = new MyIterator3();
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "  ");
		}
		System.out.println("\n");
		for(String s : list) {
			System.out.print(s + "  ");
		}
		System.out.println("\n");
	}
	

}
