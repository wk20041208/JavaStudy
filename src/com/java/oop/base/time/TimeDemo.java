package com.java.oop.base.time;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeDemo {
	public static void main(String[] args) {
		DateFormat format = new SimpleDateFormat("yyyyƒÍMM‘¬dd»’");
		Date date = new Date(System.currentTimeMillis());
		String time = format.format(date);
		System.out.println(time);
		String myTime = "2008-06-07";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dt = df.parse(myTime);
			System.out.println(dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date1 = new Date(3600 * 1000);
		System.out.println(date1.toString());
		System.out.println(date1.toGMTString());
	}

}
