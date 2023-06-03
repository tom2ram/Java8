package com.durga.lambda.ananymuscls;

public class AnanymousInnerClsLoopholesLambdaExp3
{
	int x = 888; //instance Variable
	public void m2()
	{
		int y = 999;
		interf i = () -> {
			System.out.println(x);
			System.out.println(y);
			/*if we try to change the local variable value then we will get Compile time error as 
			Local variable y defined in an enclosing scope must be final or effectively final*/
			//y = 10;
		};
		i.m1();
	}
	
	public static void main(String[] args)
	{
		AnanymousInnerClsLoopholesLambdaExp3 t = new AnanymousInnerClsLoopholesLambdaExp3();
		t.m2();
	}
}
/*Inside Lambda Exp, we can access local variable and instance variable directly.
 * inside Lambda Exp, the local variable which are reference act as final variable. Whether we are declaring or not
 * It always final. In over case u is always final.
 * 
 */