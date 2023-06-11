package com.durga.predefine.functionalinterface.Function;

import java.util.function.Function;

//Function interface Static Method : identity()
// whatever input you have to provide same we are getting as output
public class FunctionDemo10
{
	public static void main(String[] args)
	{
		Function<String, String> f = Function.identity();
		System.out.println(f.apply("durga"));
	}
}