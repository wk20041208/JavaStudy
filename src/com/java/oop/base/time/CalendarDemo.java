package com.java.oop.base.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		//calendar.set(2008,Calendar.JUNE,7,0, 0,0);
		calendar.set(Calendar.YEAR,2008);
		calendar.set(Calendar.MONTH,5);
		calendar.set(Calendar.DAY_OF_MONTH, 7);
		int weekno = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println(weekno);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(Calendar.DECEMBER);
		System.out.println(Calendar.MONTH);
		
	}

}
