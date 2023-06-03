package com.durga.lambda.ananymuscls;

//Anonymous Inner class may be chance of replaced with Lambda Expression.
public class AnanymousInnerClsDemo
{
	public static void main(String[] args)
	{
		/*Anonymous inner class that implement Runnable interface.*/
		Runnable r = new Runnable() {
			public void run()
			{
				for(int i = 0; i < 10; i++)
				{
					System.out.println("child thread");
				}				
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
