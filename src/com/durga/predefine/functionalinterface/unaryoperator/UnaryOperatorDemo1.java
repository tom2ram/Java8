package com.durga.predefine.functionalinterface.unaryoperator;

import java.util.function.UnaryOperator;

//UnaryOperator and its Primitive Versions --> It is specialised version of Function is called UnaryOperator. 
//	If both Input and Return type is same then we will go for UnaryOperator.
//UnaryOperator is child interface of Function interface.

public class UnaryOperatorDemo1
{
	public static void main(String[] args)
	{
		UnaryOperator<Integer> o = i -> i*i;
		System.out.println(o.apply(4));
	}
}
