package com.java.oop.base.guava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

public class GuavaDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		//����jdk�Դ���collections�������ý��ֻ������ֱ�Ӹı�list������ʵ���Ǹı���
		List<String> readOnlyList = Collections.unmodifiableList(list);
		//readOnlyList.add("c");//��ʱ�ᱨ�쳣
		//list.add("c");//ֱ�Ӵ�Դͷ���£��ƹ�������
		//����guava
		List<String> immutableList = ImmutableList.of("a","b","c");
	}

}
