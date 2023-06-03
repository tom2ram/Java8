package com.durga.lambda.defaultmethod;

interface OldInterface
{
	/*Until Java 1.7 version we can take only abstract method.
	 * every method inside interface is public and abstract weather we are declaring or not.
	 * some times interface is 100% abstract class.
	 * we can not write concrete method inside interface*/
	public void m1();
	
	/*every variable present inside interface is public static final.*/
	public static final int x =10;
}
