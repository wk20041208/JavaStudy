package com.java.oop.base.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class VisualCalendar {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个日期:(2018-02-06)");
		String timeStamp = scanner.nextLine();
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
		//String timeStamp = "2018-10-16";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(timeStamp);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DATE,1);
		//System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		//System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		for(int i = 0;i < calendar.get(Calendar.DAY_OF_WEEK) - 1;i++) {
			System.out.print('\t');
		}
		int maxDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		//System.out.println(maxDays);
		for(int i = 1;i <= maxDays;i++) {
			int day = calendar.get(Calendar.DAY_OF_WEEK);
			System.out.print(i + "\t");
			if(day == Calendar.SATURDAY) {
				System.out.print("\n");
			}
			calendar.add(Calendar.DATE,1);
		}
	}

}
