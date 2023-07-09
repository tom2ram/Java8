package com.durga.defaultmethod;

interface DefaultMethodInsideInterface1
{
	/*in Java version 1.8 onwards, we can declare concrete method inside interface.
	 * It is by default consider as default method
	 * we can declare default method with default keyword*/
	
	default void m1()
	{
		System.out.println("Default Method");
	}
}
public class DefaultMethodInsideInterface1Demo implements DefaultMethodInsideInterface1
{
	public static void main(String[] args)
	{
		DefaultMethodInsideInterface1Demo demo = new DefaultMethodInsideInterface1Demo();
		demo.m1();
	}
}