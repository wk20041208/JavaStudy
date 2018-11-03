package com.java.oop.base.reference.type;

import java.util.WeakHashMap;

//��Ϊ���������ͣ���������ʱ����������


public class WeakHashMapDemo {
	public static void main(String[] args) {
		WeakHashMap<String, String> wm = new WeakHashMap<>();
		//�����ض���gc�������
		wm.put("first","C");
		wm.put("second","linux");
		//gc���к󱻻���
		wm.put(new String("third"),"python");
		wm.put(new String("fouth"),"c++");
		System.gc();
		System.runFinalization();
		System.out.println(wm.size());//2
	}

}
