package com.durga.predefine.functionalinterface.Supplier;

import java.util.function.Supplier;

// Program to get Random Name by using Supplier
public class SupplierDemo2
{
	public static void main(String[] args)
	{
		Supplier<String> s = () -> {
			String [] s1 = {"Sunny","Bunny","chinny","Pinny","Durga"};
			int x = (int) (Math.random() * 5);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
