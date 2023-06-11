package com.durga.predefine.functionalinterface.Supplier;

import java.util.Date;
import java.util.function.Supplier;

//Program to get System Date by using Supplier
public class SupplierDemo1
{
	public static void main(String[] args)
	{
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}
}
