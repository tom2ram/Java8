package com.durga.defaultmethod;

//default method with multiple inheritance
interface DefaultMethodInsideInterface3
{
	default void m1()
	{
		System.out.println("Default Method from interface 3");
	}
}
interface DefaultMethodInsideInterface4
{
	default void m1()
	{
		System.out.println("Default Method from interface 4");
	}
}
/* if two interface default method inherit with the same signature. immediately compiler will give us ambiguity 
 * problem.Duplicate default methods named m1 with the parameters () and () are inherited from the types 
 * DefaultMethodInsideInterface4 and DefaultMethodInsideInterface3.
 * to resolve the ambiguity problem, override the default method.
 * if you don't want override and wanted to call parent method implementation. suppose your requirement interface4 
 * implementation, then use DefaultMethodInsideInterface4.super.m1() inside the override method;
*/
public class DefaultMethodInsideInterface3Demo implements DefaultMethodInsideInterface3, DefaultMethodInsideInterface4
{	
	public static void main(String[] args)
	{
		DefaultMethodInsideInterface3Demo t = new DefaultMethodInsideInterface3Demo();
		t.m1();
	}
	
	public void m1()
	{
		//System.out.println("override Default Method inside test class");
		DefaultMethodInsideInterface4.super.m1();
		//or
		DefaultMethodInsideInterface3.super.m1();
		
	}
}