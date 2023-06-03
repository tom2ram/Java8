package com.durga.lambda;

@FunctionalInterface
interface MyFunctionalInterface1
{
	public void m1();
}

public class MyLambdaExp1
{
	public static void main(String[] args)
	{
		MyFunctionalInterface1 i = () -> System.out.println("hello Lamda");
		i.m1();
	}
}