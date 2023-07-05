package com.durga.predefine.functionalinterface.unaryoperator.primitive;

import java.util.function.IntUnaryOperator;

public class PrimitiveUnaryOperatorDemo1
{
	public static void main(String[] args)
	{
		IntUnaryOperator o = i -> i*i;
		System.out.println(o.applyAsInt(3));
		
		/*public interface LongUnaryOperator {
			long applyAsLong(long operand);
		}*/
		
		/*public interface DoubleUnaryOperator {
			 double applyAsDouble(double operand);
		}*/
		
	}
}
