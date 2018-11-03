package com.java.oop.base.reference.type;

import java.util.IdentityHashMap;

//��ֻ�Ե�ַȥ�أ������ǱȽ�hashcode��equals,��ʱ�������е��ַ���
public class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap<String, String> ihm = new IdentityHashMap<>();
		ihm.put("hello","java");
		ihm.put("hello","python");
		System.out.println(ihm.size());//"hello"���ڳ����أ���ַһ�£���Ϊ��ͬһ��
		System.out.println(ihm.get("hello"));//python
		ihm.put(new String("hello"),"c");
		System.out.println(ihm.size());//2
		System.out.println(ihm.get("hello"));
		
	}

}
