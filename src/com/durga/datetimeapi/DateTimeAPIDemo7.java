package com.durga.datetimeapi;

import java.time.Year;
import java.util.Scanner;

// To read data and tell about leap years
//Date and Time API Introduction Year
public class DateTimeAPIDemo7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int n = sc.nextInt();
		sc.close();
		Year y = Year.of(n);
		if(y.isLeap())
		{
			System.out.printf("%d is leap year", n);
		}
		else
		{
			System.out.printf("%d is not a leap year", n);
		}
	}
}
