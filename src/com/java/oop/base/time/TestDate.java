package com.java.oop.base.time;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		TestDate nowDate = new TestDate();
		nowDate.getCurrentDate();
		nowDate.getSystemCurrentTime();
		
	}
	public void getSystemCurrentTime() {
		System.out.println("------获取系统当前时间------");
		System.out.println("系统当前时间=" + System.currentTimeMillis());
	}
	
	public void getCurrentDate() {
		System.out.println("---当前系统时间是------");
		Date date = new Date();
		System.out.println("当前系统日期:" + date.toString());
		System.out.println("当前经历的毫秒数" + date.getTime());
		
	}

}
