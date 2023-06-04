package com.durga.predefine.functionalinterface.Predicate;

import java.util.function.Predicate;

/*Program to display name starts with 'k' by using predicate*/
public class PredicateDemo6
{
	public static void main(String[] args)
	{
		String[] name = { "durga", "khalid", "khanam", "kajal", "sunny", "kareena", "madhuri" };
		Predicate<String> startWithK = s -> s.charAt(0) == 'k';
		Predicate<String> notStartWithK = s -> s.startsWith("k");
		System.out.println("display name starts with 'k' are :");
		check(startWithK, name);
		System.out.println("display name starts with other than 'k' are :");
		check(notStartWithK.negate(), name);
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
