package com.durga.lambda;

@FunctionalInterface
interface MyFunctionalInterface3
{
	public int getLength(String s);
}

public class MyLambdaExp3
{
	public static void main(String[] args)
	{
		MyFunctionalInterface3 i = s -> s.length();
		System.out.println(i.getLength("Khalid"));
	}
}