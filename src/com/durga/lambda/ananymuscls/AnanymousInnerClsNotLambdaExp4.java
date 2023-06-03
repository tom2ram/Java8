package com.durga.lambda.ananymuscls;

/*Anonymous Inner class may be chance of replaced with Lambda Expression. if and Only if Interface have only 
one abstract Method(Functional Interface) Then Anonymous inner cls is replaced with Lambda Exp.
If Anonymous inner class create for Concrete class or Abstract Class or Interface which have more than one abstract method, 
in that case Anonymous inner class can not be replaced with Lambda Expression. See below examples
*/
interface test4
{
	//Interface with an abstract method.
	public void m1();
}
public class AnanymousInnerClsNotLambdaExp4
{
	public static void main(String[] args)
	{
		test4 t = new test4() {
			public void m1(){}
		};
	}
}
/*Anonymous inner class that implement test3 interface which have only one abstract methods.
 * So we can replace Anonymous inner class with Lambda Exp.*/