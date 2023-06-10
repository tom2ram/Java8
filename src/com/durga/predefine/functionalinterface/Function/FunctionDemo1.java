package com.durga.predefine.functionalinterface.Function;

import java.util.function.Function;

//Find length of the String using Function interface. and 
//Find square of an Integer using Function interface.
public class FunctionDemo1
{
	public static void main(String[] args)
	{
		Function<String, Integer> f = s ->  s.length();
		System.out.println(f.apply("khalid"));
		System.out.println(f.apply("shanaya"));
		
		Function<Integer, Integer> f1 = i -> i*i;
		System.out.println(f1.apply(5));
		System.out.println(f1.apply(9));
	}
}
