package com.durga.predefine.functionalinterface.primitivetype.function;

import java.util.function.ToIntFunction;

//Demo Programs about Primitve Type Functional Interfaces for Function
public class PrimitiveFunctionDemo2
{
	public static void main(String[] args)
	{
		ToIntFunction<String> f = s -> s.length();
		System.out.println(f.applyAsInt("Khalid"));
	}
}
