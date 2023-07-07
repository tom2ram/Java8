package com.durga.doublecolonoperator;

//MyLambdaExp5Thread is already implemented using lambda expression and same we are doing using Method Reference 
public class MethodReferenceDemo3
{
	public static void main(String[] args)
	{
		MethodReferenceDemo3 mrd = new MethodReferenceDemo3();
		Runnable r = mrd::m1;
		Thread t = new Thread(r);
		t.start();

		for (int j = 0; j < 10; j++)
		{
			System.out.println("main thread");
		}
	}

	// Non static (instance) Method
	public void m1()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("chilid thread");
		}
	}
}