package com.java.oop.base.time;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		TestDate nowDate = new TestDate();
		nowDate.getCurrentDate();
		nowDate.getSystemCurrentTime();
		
	}
	public void getSystemCurrentTime() {
		System.out.println("------��ȡϵͳ��ǰʱ��------");
		System.out.println("ϵͳ��ǰʱ��=" + System.currentTimeMillis());
	}
	
	public void getCurrentDate() {
		System.out.println("---��ǰϵͳʱ����------");
		Date date = new Date();
		System.out.println("��ǰϵͳ����:" + date.toString());
		System.out.println("��ǰ�����ĺ�����" + date.getTime());
		
	}

}
