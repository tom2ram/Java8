package com.durga.lambda;

@FunctionalInterface
interface MyFunctionalInterface2
{
	public void m1(int a , int b);
}

public class MyLambdaExp2
{
	public static void main(String[] args)
	{
		MyFunctionalInterface2 i = (a , b) -> System.out.println(a+b);
		i.m1(10, 5);
		i.m1(100, 200);
	}
}