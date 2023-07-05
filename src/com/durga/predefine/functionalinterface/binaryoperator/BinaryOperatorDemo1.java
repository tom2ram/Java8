package com.durga.predefine.functionalinterface.binaryoperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

//BinaryOperator and its Primitive Versions --> It is specialised version of BiFunction is called BinaryOperator. 
//If both Input and one Return type is same then we will go for BinaryOperator.
//BinaryOperator is child interface of BiFunction interface.

public class BinaryOperatorDemo1
{
	public static void main(String[] args)
	{
		BiFunction<String, String, String> f = (s1,s2) -> s1+s2;
		System.out.println(f.apply("khalid", "habib"));
		
		
		BinaryOperator<String> b = (s1,s2) -> s1+s2;
		System.out.println(b.apply("kha", "nam"));
	}
}
