package com.durga.predefine.functionalinterface.Supplier;

import java.util.function.Supplier;

// Program to get Random 6 digit OTP by using Supplier
public class SupplierDemo3
{
	public static void main(String[] args)
	{
		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++)
			{
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
