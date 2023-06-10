package com.durga.predefine.functionalinterface.Function;

import java.util.function.Function;

//Program to remove spaces present in the given String by using Function. And
// Program to find out number of space present in an String by using Function.
public class FunctionDemo2
{
	public static void main(String[] args)
	{
		String str = "Durga Software Solutions Hyderabad";
		Function<String, String> f = s -> s.replaceAll(" ", "");
		System.out.println(f.apply(str));
		
		Function<String, Integer> f1 = s1 -> s1.length();
		//System.out.println(f1.apply(str));
		//System.out.println(f1.apply(f.apply(str)));
		System.out.println(f1.apply(str) - f1.apply(f.apply(str)));
		
		//OR
		Function<String, Integer> f2 = s2 -> s2.length() - s2.replaceAll(" ", "").length();
		System.out.println(f2.apply(str));
		
	}
}
