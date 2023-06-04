package com.durga.predefine.functionalinterface.Predicate;

import java.util.function.Predicate;

public class PredicateDemo1
{
	public static void main(String[] args)
	{
		Predicate<Integer> p = I -> I>10;
		System.out.println(p.test(2));
		System.out.println(p.test(12));
		System.out.println(p.negate().test(12));
		System.out.println(p.negate().test(2));
		//System.out.println(p.test("Durga")); CE : incompatible type, String can not be convert to Integer
		
		String s = "khalid";
		Predicate<String> p1 = a -> a == s;
		System.out.println(p1.test("durga"));
		System.out.println(p1.test("khalid"));
	}
}
