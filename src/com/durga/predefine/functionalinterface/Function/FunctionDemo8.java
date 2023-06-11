package com.durga.predefine.functionalinterface.Function;

import java.util.function.Function;

//Function chaining
//Demo program to Demonstrate the difference between andThen() and compose()
public class FunctionDemo8
{
	public static void main(String[] args)
	{
		Function<Integer, Integer> f1 = s -> s+s;
		
		Function<Integer, Integer> f2 = s -> s*s*s ;
		
		System.out.println(f1.apply(2));
		System.out.println(f2.apply(2));
		
		System.out.println(f1.andThen(f2).apply(2));
		
		System.out.println(f1.compose(f2).apply(2));
	}
}