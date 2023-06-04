package com.durga.predefine.functionalinterface.Predicate;

import java.util.function.Predicate;

/*Predicate join
p1 : Given number is greater than 10 or not
p2 : Given number is even or not*/
public class PredicateDemo5
{
	public static void main(String[] args)
	{
		int[] x = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println("The number greater than 10 are :");
		check(p1, x);
		System.out.println("Even numbers are :");
		check(p2, x);
		System.out.println("The number not greater than 10 are :");
		check(p1.negate(), x);
		System.out.println("The number greater than 10 AND even are :");
		check(p1.and(p2), x);
		System.out.println("The number greater than 10 OR even are :");
		check(p1.or(p2), x);

	}

	public static void check(Predicate<Integer> p, int[] x)
	{
		for (int i : x)
		{
			if (p.test(i))
			{
				System.out.println(i);
			}
		}
	}
}
