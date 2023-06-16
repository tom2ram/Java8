package com.durga.predefine.functionalinterface.biargs;

import java.util.function.BiPredicate;

//Write a program to check two numbers sum is even or not
public class BiPredicateDemo1
{
	public static void main(String[] args)
	{
		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;

		System.out.println(p.test(5, 7));
		System.out.println(p.test(4, 7));
	}
}
