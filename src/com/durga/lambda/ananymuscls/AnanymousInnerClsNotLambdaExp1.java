package com.durga.lambda.ananymuscls;

/*Anonymous Inner class may be chance of replaced with Lambda Expression. if and Only if Interface have only 
one abstract Method(Functional Interface) Then Anonymous inner cls is replaced with Lambda Exp.
If Anonymous inner class create for Concrete class or Abstract Class or Interface which have more than one abstract method, 
in that case Anonymous inner class can not be replaced with Lambda Expression. See below examples
*/

class test1
{
	//Concrete class.
}
public class AnanymousInnerClsNotLambdaExp1
{
	public static void main(String[] args)
	{
		test1 t = new test1() {
			
		};
	}
}
/*Anonymous inner class that extend Concrete class. So we can't replace Anonymous inner class with Lambda Exp.*/