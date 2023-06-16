package com.durga.predefine.functionalinterface.biargs;

import java.util.function.BiFunction;
//Write a program to multiply two numbers.
public class BiFunctionDemo1
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> bf = (a,b) -> a*b;
		
		System.out.println(bf.apply(4, 2));
		System.out.println(bf.apply(5, 8));
	}
}
