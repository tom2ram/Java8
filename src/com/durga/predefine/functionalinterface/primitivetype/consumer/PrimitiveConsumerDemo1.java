package com.durga.predefine.functionalinterface.primitivetype.consumer;

import java.util.function.IntConsumer;

public class PrimitiveConsumerDemo1
{
	public static void main(String[] args)
	{
		IntConsumer c = i -> System.out.println("The Square of "+i+ " is " + i*i);
		
		c.accept(4);
		
		//Similarly we have LongConsumer and DoubleConsumer.
	}
}
