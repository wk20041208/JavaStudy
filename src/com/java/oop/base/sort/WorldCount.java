package com.java.oop.base.sort;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WorldCount {
	String str = "Linux is a good operator system,and a stable system";
	String[] words = str.split(" ");
	Map<String,Letter> letters = new HashMap<>();
	public static void main(String[] args) {
		WorldCount wc = new WorldCount();
		//wc.test1();
		System.out.println("================================");
		wc.test2();

		
	}
	
	public void  test1() {
		for(String tmp:words) {
			if(!letters.containsKey(tmp)) {
				letters.put(tmp, new Letter());
			}
			Letter col = letters.get(tmp);
			col.setCount(col.getCount() + 1);
		}
		
		Set<String> set = letters.keySet();
		for(String key :set) {
			Letter col = letters.get(key);
			System.out.println(key + "-->" +col.getCount());
		}
		
	}
	
	public void test2() {
		Letter col = null;
		for(String tmp:words) {
			if(null ==(col = letters.get(tmp))){
				col = new Letter();
				col.setCount(1);
				letters.put(tmp,col);
			}else {
				col.setCount(col.getCount() + 1);
			}
			
		}
		Set<String> set = letters.keySet();
		for(String key :set) {
			Letter col1 = letters.get(key);
			System.out.println(key + "-->" +col1.getCount());
		}
	}

}
