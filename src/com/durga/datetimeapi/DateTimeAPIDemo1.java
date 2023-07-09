package com.durga.datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;
// current system date and time.
public class DateTimeAPIDemo1
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
}
