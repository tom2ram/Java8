package com.durga.predefine.functionalinterface.Supplier;

import java.util.function.Supplier;

//Program to get Random Password by using Supplier.
/*Rules
1. Length is 8 char
2. 2,4,6,8 only digit is allowed
3. 1,3,5,7 only Upper case alphabet char and symbol @ # $ is allowed
*/

public class SupplierDemo4
{
	public static void main(String[] args)
	{
		
		Supplier<String> s = () -> {
			String password = "";
			Supplier<Integer> d = () -> (int) (Math.random() * 10);
			String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> c = () -> symbol.charAt((int) (Math.random() * 29));
			for (int i = 0; i < 9; i++)
			{
				if(i%2 ==0)
				{
					password = password + d.get();
				}
				else
				{
					password = password + c.get();
				}
			}
			return password;
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
