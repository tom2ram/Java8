package com.durga.lambda;

public class MyLambdaExp5Thread
{
	public static void main(String[] args) throws InterruptedException
	{
		Runnable r = () -> {
			for(int i = 0; i < 10; i++)
			{
				System.out.println("child thread");
			}
		};

		Thread t = new Thread(r);
		t.start();
		for(int j = 0; j < 10; j++)
		{
			System.out.println("main thread");
		}
	}
}