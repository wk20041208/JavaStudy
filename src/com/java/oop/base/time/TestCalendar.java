package com.java.oop.base.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class TestCalendar {
	public static void main(String[] args) {
		TestCalendar tc = new TestCalendar();
		tc.testCalendar();
		
	}
	
	public void testCalendar() {
        //创建Calendar的方式 
        Calendar now1 = Calendar.getInstance(); 
        Calendar now2 = new GregorianCalendar(); 
        Calendar now3 = new GregorianCalendar(2007, 10, 30); 
        Calendar now4 = new GregorianCalendar(2007, 10, 30, 15, 55);      //陷阱:Calendar的月份是0~11 
        Calendar now5 = new GregorianCalendar(2007, 10, 30, 15, 55, 44); 
        Calendar now6 = new GregorianCalendar(Locale.CHINA); 
        Calendar now7 = new GregorianCalendar(TimeZone.getTimeZone("GMT-8:00"));
        now2.setTime(new Date());
        System.out.println(now2);
        now2.setTimeInMillis(new Date().getTime()); 
        System.out.println(now2); 
	}

}
