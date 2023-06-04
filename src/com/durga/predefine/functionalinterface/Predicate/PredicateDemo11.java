package com.durga.predefine.functionalinterface.Predicate;

import java.util.function.Predicate;

/*isEqual method of Predicate*/
public class PredicateDemo11
{
	public static void main(String[] args)
	{
		Predicate<String> p = Predicate.isEqual("khalid");
		System.out.println(p.test("khalid"));
		System.out.println(p.test("durga"));
	}

}