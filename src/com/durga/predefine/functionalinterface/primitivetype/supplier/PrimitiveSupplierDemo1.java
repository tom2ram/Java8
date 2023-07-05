package com.durga.predefine.functionalinterface.primitivetype.supplier;

import java.util.function.IntSupplier;

public class PrimitiveSupplierDemo1
{
	public static void main(String[] args)
	{
		/*1) IntSupplier{
			int getAsInt();
		}*/
		
		IntSupplier s = () -> (int) (Math.random()*10);
		String otp = "";
		for (int i=0; i<6; i++)
		{
			otp = otp + s.getAsInt();
		}
		
		System.out.println(otp);
		
		/*2) LongSupplier{
				 long getAsLong();
	      }*/
		
		/*3) DoubleSupplier{
		 		double getAsDouble();
 			}*/
		
		/*4) BooleanSupplier{
 				boolean getAsBoolean();
		}*/
	}
}
