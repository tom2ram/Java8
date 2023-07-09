package com.durga.datetimeapi;

import java.time.LocalDateTime;
import java.time.Month;

// I want  DOB or DOJ 1989, Jan, 19, 12:45 min
public class DateTimeAPIDemo5
{
	public static void main(String[] args)
	{
		//LocalDateTime.of(year, month, dayOfMonth, hour, minute)
		LocalDateTime dt = LocalDateTime.of(1989, Month.JANUARY, 19, 12, 45);
		System.out.println(dt);

		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yy = dt.getYear();

		System.out.println(dd + " .... " + mm + " .... " + yy);
		System.out.printf("%d-%d-%d", dd, mm, yy);

		int h = dt.getHour();
		int m = dt.getMinute();
		
		System.out.println("\nTime "+h + " .... " + m);
		System.out.printf("%d:%d", h, m);
		
		System.out.println("\nAfter 6 month " + dt.plusMonths(6));
		
		System.out.println("Before 6 month " + dt.minusMonths(6));
	}
}
