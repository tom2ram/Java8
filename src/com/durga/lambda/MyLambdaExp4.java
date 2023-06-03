package com.durga.lambda;

@FunctionalInterface
interface MyFunctionalInterface4
{
	public int squareIt(int s);
}

public class MyLambdaExp4
{
	public static void main(String[] args)
	{
		MyFunctionalInterface4 i = x -> x*x;
		System.out.println(i.squareIt(4));
		System.out.println(i.squareIt(7));
	}
}