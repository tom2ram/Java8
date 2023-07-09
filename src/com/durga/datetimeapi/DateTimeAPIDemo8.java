package com.durga.datetimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//Date and Time API Introduction ZoneId,ZonedDateTime
public class DateTimeAPIDemo8
{
	public static void main(String[] args)
	{
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println(dt);
	}
}
