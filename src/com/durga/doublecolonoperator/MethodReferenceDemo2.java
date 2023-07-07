package com.durga.doublecolonoperator;

interface Interf1{
	public void m1();
}

public class MethodReferenceDemo2
{
	public static void main(String[] args)
	{
		Interf1 i = MethodReferenceDemo2 :: m2;
		i.m1();
	}
	
	public static void m2()
	{
		System.out.println("Implementation of Mehod Reference");
	}
}
