package com.durga.predefine.functionalinterface.Function;

import java.util.function.Function;

//Function chaining
//FOr Function chaining there are two default method .
//1) f1.andThen(f2) => f1 will be applied followed by f2.
//2) f1.compose(f2) => f2 will be applied followed by f1.
public class FunctionDemo7
{
	public static void main(String[] args)
	{
		Function<String, String> f1 = s -> s.toUpperCase();
		
		Function<String, String> f2 = s -> s.substring(0, 8) ;
		
		System.out.println(f1.apply("khalidhabib"));
		System.out.println(f2.apply("khalidhabib"));
		
		System.out.println(f1.andThen(f2).apply("khalidhabib"));
		
		System.out.println(f1.compose(f2).apply("khalidhabib"));
	}
}