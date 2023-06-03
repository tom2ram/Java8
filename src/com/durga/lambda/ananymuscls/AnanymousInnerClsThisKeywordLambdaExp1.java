package com.durga.lambda.ananymuscls;

/*This keyword always refer to current Object.
 * Anonymous inner class this is an other way and in Lambda Expression it is either way.
 * This Makes significate difference between Anonymous inner class and Lambda Exp.
 * Let me explain with the Small Example
*/
interface interf
{
	//Interface with an abstract method.
	public void m1();
}
public class AnanymousInnerClsThisKeywordLambdaExp1
{
	int x = 888; //instance Variable
	public void m2()
	{
		interf i = new interf() {
			int x = 999;//instance Variable
			public void m1(){
				System.out.println(this.x);
			}
		};
		i.m1();
	}
	
	public static void main(String[] args)
	{
		AnanymousInnerClsThisKeywordLambdaExp1 t = new AnanymousInnerClsThisKeywordLambdaExp1();
		t.m2();
	}
}
/*This always refers the current anonymous inner class instance only*/