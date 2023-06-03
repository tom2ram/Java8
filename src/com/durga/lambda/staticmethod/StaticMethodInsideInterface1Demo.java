package com.durga.lambda.staticmethod;

/*form 1.8 onwards, just to define general utility method, no where related to object state.
 * such type of general utility method inside interface. we can declare inside interface using static keywords.
 * we can call this method by interface name.
*/
interface StaticMethodInsideInterface1
{
	public static void m1()
	{
		System.out.println("Static Method Inside Interface");
	}
}

public class StaticMethodInsideInterface1Demo implements StaticMethodInsideInterface1
{
	public static void main(String[] args)
	{
		StaticMethodInsideInterface1Demo d = new StaticMethodInsideInterface1Demo();
		/*static method by default no available to implementation class.we can not call implemented class object or 
		 * implemented class name to static method.
		 * only way to call static method, we can call it only interface name.
		d.m1();
		StaticMethodInsideInterface1Demo.m1();*/
		StaticMethodInsideInterface1.m1();
		
	}
}
