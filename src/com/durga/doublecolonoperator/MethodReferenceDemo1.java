package com.durga.doublecolonoperator;

interface Interf{
	public void m1();
}

public class MethodReferenceDemo1
{
	public static void main(String[] args)
	{
		Interf i = () -> {
			System.out.println("Lambda implementation line1");
			System.out.println("Lambda implementation line2");
		};
		
		i.m1();
		
	// without lambda expression we can define m1 method by using method reference. we can see it in next class DoubleColonOperatorDemo2
	}
}
