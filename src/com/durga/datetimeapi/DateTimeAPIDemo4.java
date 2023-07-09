package com.durga.datetimeapi;

import java.time.LocalDateTime;

// current system date and time.
public class DateTimeAPIDemo4
{
	public static void main(String[] args)
	{
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yy = dt.getYear();

		System.out.println(dd + " .... " + mm + " .... " + yy);
		System.out.printf("%d-%d-%d", dd, mm, yy);

		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int ns = dt.getNano();
		
		System.out.println("\nTime "+h + " .... " + m + " .... " + s + " .... " + ns);
		System.out.printf("%d:%d:%d:%d", h, m, s, ns);
	}
}
