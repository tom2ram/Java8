package com.durga.predefine.functionalinterface.Predicate;

import java.util.function.Predicate;

/*Predicate join
p1 : Given number is greater than 10 or not
p2 : Given number is even or not*/
public class PredicateDemo4
{
	public static void main(String[] args)
	{
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i%2==0;
		//If you want both the condition is satisfy then go for and method similar to circuit AND gate
		System.out.println(p1.and(p2).test(16));
		System.out.println(p1.and(p2).test(8));
		System.out.println(p1.and(p2).test(13));
		
		//If you want any the condition is satisfy then go for or method similar to circuit OR gate
		System.out.println(p1.or(p2).test(13)); 
		
		//If you want negate the condition then go for negate method similar to circuit NOT gate
		System.out.println(p1.negate().test(13));
		System.out.println(p2.negate().test(13));
		
	}
}
