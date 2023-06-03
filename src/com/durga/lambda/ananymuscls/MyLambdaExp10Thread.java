package com.durga.lambda.ananymuscls;

public class MyLambdaExp10Thread
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++)
			{
				System.out.println("child thread");
			}
		});
		t.start();
		for (int j = 0; j < 10; j++)
		{
			System.out.println("main thread");
		}
	}
}