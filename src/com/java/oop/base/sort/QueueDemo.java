package com.java.oop.base.sort;

import java.util.ArrayDeque;
import java.util.Queue;

//模拟银行业务排队
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<>();
		queue.add("java");
		queue.offer("python");
		System.out.println(queue.peek());
		System.out.println(queue.poll());
	}
	

}
