package com.durga.lambda.ananymuscls;

/*This keyword always refer to current Object.
 * Anonymous inner class this is an other way and in Lambda Expression it is either way.
 * This Makes significate difference between Anonymous inner class and Lambda Exp.
 * Let me explain with the Small Example
*/
public class AnanymousInnerClsThisKeywordLambdaExp2
{
	int x = 888; //instance Variable
	public void m2()
	{
		interf i = () -> {
			int x = 999;//inside Lambda Exp it is not possible to  declare any instance variable it is always act as local variable only.
			System.out.println(this.x);
		};
		i.m1();
	}
	
	public static void main(String[] args)
	{
		AnanymousInnerClsThisKeywordLambdaExp2 t = new AnanymousInnerClsThisKeywordLambdaExp2();
		t.m2();
	}
}
/*Inside Lambda Exp, This always refers the outer class instance only.*/