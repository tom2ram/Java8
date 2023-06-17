package com.durga.predefine.functionalinterface.primitivetype.Predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

//Only 3 typr of Primitive type Predicate are in Java, IntPredicate, LongPredicate, DoublePredicate
public class PrimitivePredicateDemo1
{
	public static void main(String[] args)
	{
		int x[] = { 0, 5, 10, 15, 20, 25, 30 };

		IntPredicate p = i -> i % 2 == 0;
		System.out.println("Even numbers are");
		for (int j : x)
		{
			if(p.test(j))
				System.out.println(j);
		}
		
		long xl[] = { 0, 5, 10, 15, 20, 25, 30 };
		
		LongPredicate pl = i -> i % 2 != 0;
		System.out.println("\n"+"Odd numbers are");
		for (long j : xl)
		{
			if(pl.test(j))
				System.out.println(j);
		}
		
		double xd[] = { 0.0, 5.0, 10.0, 15.0, 20.0, 25.0, 30.0 };
		
		DoublePredicate pd = i -> i  == 10.0;
		System.out.println("\n"+"Number equal to 10");
		for (double j : xd)
		{
			if(pd.test(j))
				System.out.println(j);
		}
	}
}
