package com.durga.staticmethod;

/* Static method overriding case:
 * Overriding is not applicable to static interface method as the static method is not available to the child class 
 * or implementation class.
 * we can keep same name as static method inside the child class but it is not overriding.
*/
interface StaticMethodInsideInterface4
{
	public static void main(String[] args)
	{
		System.out.println("main method inside interface");
	}
}

public class StaticMethodInsideInterface4Demo implements StaticMethodInsideInterface4
{
	//it is correct but it is not override. we have declare our own method with private modifier
	private static void m1()
	{
		System.out.println("Static Method Inside Demo class");
	}
	
	public static void main(String[] args)
	{
		m1();
	}
}
