package com.durga.predefine.functionalinterface.primitivetype.function;

import java.util.function.IntFunction;

//Demo Programs about Primitve Type Functional Interfaces for Function
public class PrimitiveFunctionDemo1
{
	public static void main(String[] args)
	{
		IntFunction<Integer> f = i -> i*i;
		System.out.println(f.apply(4));
	}
}
