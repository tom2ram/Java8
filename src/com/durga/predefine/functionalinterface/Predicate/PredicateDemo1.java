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
	}
}
