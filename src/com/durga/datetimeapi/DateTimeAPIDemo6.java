package com.durga.datetimeapi;

//Date and Time API Introduction Period
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateTimeAPIDemo6
{
	public static void main(String[] args)
	{
		//LocalDateTime.of(year, month, dayOfMonth, hour, minute)
		LocalDate birthday = LocalDate.of(1995, Month.MAY, 26);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("your age in %d years %d months and %d days", p.getYears(), p.getMonths(), p.getDays());
		
		LocalDate deathDay = LocalDate.of(1995+60, 06, 26);
		Period p1 = Period.between(deathDay, today);
		int d = p1.getYears()*365+p1.getMonths()*30+p1.getDays();
		
		System.out.printf("\nYou will be on earth only %d days, hurry up to do most important things ", d);
	}
}
