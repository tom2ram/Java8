package com.durga.predefine.functionalinterface.primitivetype.consumer;

public class PrimitiveConsumerDemo3
{
	public static void main(String[] args)
	{
		//1st Argument as Object type and 2nd one is int primitive type then go for primitive version of Biconsumer ObjIntConsumer<T> 	
		/*ObjIntConsumer<T>{
			 void accept(T t, int value);
		}*/
		
		//1st Argument as Object type and 2nd one is long primitive type then go for primitive version of Biconsumer  ObjLongConsumer<T>
		 /*ObjLongConsumer<T>{
			void accept(T t, long value);
		}*/
		
		//1st Argument as Object type and 2nd one is double primitive type then go for primitive version of Biconsumer  ObjDoubleConsumer<T>
		 /*ObjDoubleConsumer<T>{
			void accept(T t, double value);
		}*/
	}
}
