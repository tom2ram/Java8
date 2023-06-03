package com.durga.lambda.staticmethod;

/* Static method overriding case:
 * Overriding is not applicable to static interface method as the static method is not available to the child class 
 * or implementation class.
 * we can keep same name as static method inside the child class but it is not overriding.
*/
interface StaticMethodInsideInterface3
{
	public static void m1()
	{
		System.out.println("Static Method Inside Interface");
	}
}

public class StaticMethodInsideInterface3Demo implements StaticMethodInsideInterface3
{
	//it is correct but it is not override. we have declare our own method which is non static
	public void m1()
	{
		System.out.println("Static Method Inside Demo class");
	}
	
	public static void main(String[] args)
	{
		
	}
}
