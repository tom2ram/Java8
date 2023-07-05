package com.durga.predefine.functionalinterface.binaryoperator.primitive;

import java.util.function.IntBinaryOperator;

public class PrimitiveBinaryOperatorDemo1
{
	public static void main(String[] args)
	{
		IntBinaryOperator b = (i1,i2) -> i1+i2;
		System.out.println(b.applyAsInt(10, 20));
		
		/*public interface LongBinaryOperator {
		    long applyAsLong(long left, long right);
		}*/
		
		/*public interface DoubleBinaryOperator {
	    	double applyAsDouble(double left, double right);
		}*/
	}
}
