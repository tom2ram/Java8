package com.durga.doublecolonoperator;

interface interf2
{
	public Sample get(); // Return type is Sample
}

public class ConstructorReferenceDemo1
{
	public static void main(String[] args)
	{
		// with Lambda
		/*
		 * interf2 i = () -> { Sample s = new Sample();
		 * return s; 
		 * }; 
		 * Sample s1 = i.get();
		 */

		// with Constructor Reference
		interf2 cr = Sample::new;
		Sample s2 = cr.get();
	}
}

class Sample
{
	Sample() {
		System.out.println("Sample Construction Execution and Object Creation");
	}
}
