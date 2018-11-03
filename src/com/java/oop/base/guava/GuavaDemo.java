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
		//利用jdk自带的collections工具设置结合只读。若直接改变list，则其实还是改变了
		List<String> readOnlyList = Collections.unmodifiableList(list);
		//readOnlyList.add("c");//此时会报异常
		//list.add("c");//直接从源头更新，绕过了限制
		//利用guava
		List<String> immutableList = ImmutableList.of("a","b","c");
	}

}
