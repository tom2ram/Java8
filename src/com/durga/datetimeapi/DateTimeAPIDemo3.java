package com.durga.datetimeapi;

import java.time.LocalTime;
// fine out hours, mins and seconds based on current system time
public class DateTimeAPIDemo3
{
	public static void main(String[] args)
	{
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int ns = time.getNano();
		
		System.out.println(h + " .... " + m +" .... " + s +" .... " + ns);
		System.out.printf("%d:%d:%d:%d", h,m,s,ns);
	}
}
