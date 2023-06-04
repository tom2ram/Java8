package com.durga.predefine.functionalinterface.Predicate;

import java.util.function.Predicate;

public class PredicateDemo2
{
	public static void main(String[] args)
	{
		Predicate<String> p1 = a -> a.length() > 5;
		System.out.println(p1.test("khalid"));
		System.out.println(p1.test("abcdef"));
		System.out.println(p1.test("abc"));
	}
}
