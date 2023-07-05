package com.durga.predefine.functionalinterface.primitivetype.function;

import java.util.function.IntToDoubleFunction;

//Demo Programs about Primitve Type Functional Interfaces for Function
public class PrimitiveFunctionDemo3
{
	public static void main(String[] args)
	{
		IntToDoubleFunction f = i -> Math.sqrt(i);
		System.out.println(f.applyAsDouble(40));
		System.out.println(f.applyAsDouble(10));
	}
}
