package com.durga.predefine.functionalinterface.Predicate;

import java.util.function.Predicate;

/*Program to remove null values and empty string by using predicate*/
public class PredicateDemo7
{
	public static void main(String[] args)
	{
		String[] name = { "durga", "khalid", "khanam", "", null, "", "madhuri" };
		Predicate<String> removeEmptyAndNull = s -> s != null && s.length() != 0;
		System.out.println("The list of Valid strings are :");
		check(removeEmptyAndNull, name);
	}

	public static void check(Predicate<String> p, String[] x)
	{
		for (String i : x)
		{
			if (p.test(i))
			{
				System.out.println(i);
			}
		}
	}
}
