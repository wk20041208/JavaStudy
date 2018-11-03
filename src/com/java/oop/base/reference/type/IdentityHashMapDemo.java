package com.java.oop.base.reference.type;

import java.util.IdentityHashMap;

//键只以地址去重，而不是比较hashcode和equals,键时常量池中的字符串
public class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap<String, String> ihm = new IdentityHashMap<>();
		ihm.put("hello","java");
		ihm.put("hello","python");
		System.out.println(ihm.size());//"hello"属于常量池，地址一致，认为是同一个
		System.out.println(ihm.get("hello"));//python
		ihm.put(new String("hello"),"c");
		System.out.println(ihm.size());//2
		System.out.println(ihm.get("hello"));
		
	}

}
