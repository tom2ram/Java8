package com.durga.lambda.defaultmethod;

interface DefaultMethodInsideInterface2
{
	/*in Java version 1.8 onwards, we can declare concrete method inside interface.
	 * It is by default consider as default method
	 * we can declare default method with default keyword*/
	
	default void m1()
	{
		System.out.println("Default Method");
	}
}
public class DefaultMethodInsideInterface2Demo implements DefaultMethodInsideInterface2
{
	//we can override default method in our class
	public void m1()
	{
		System.out.println("override Default Method inside test class");
	}
	
	public static void main(String[] args)
	{
		DefaultMethodInsideInterface2Demo t = new DefaultMethodInsideInterface2Demo();
		t.m1();
	}
}