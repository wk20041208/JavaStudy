package com.java.oop.base.reference.type;

import java.util.WeakHashMap;

//键为弱引用类型，垃圾回收时被立即回收


public class WeakHashMapDemo {
	public static void main(String[] args) {
		WeakHashMap<String, String> wm = new WeakHashMap<>();
		//常量池对象，gc不会回收
		wm.put("first","C");
		wm.put("second","linux");
		//gc运行后被回收
		wm.put(new String("third"),"python");
		wm.put(new String("fouth"),"c++");
		System.gc();
		System.runFinalization();
		System.out.println(wm.size());//2
	}

}
