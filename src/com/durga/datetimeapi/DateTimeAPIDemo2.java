package com.durga.datetimeapi;

import java.time.LocalDate;
// fine out day, month and year based on current system date
public class DateTimeAPIDemo2
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println(dd + " .... " + mm +" .... " + yyyy);
		System.out.printf("%d-%d-%d", dd,mm,yyyy);
	}
}
