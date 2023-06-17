package com.durga.predefine.functionalinterface.biargs;

import java.util.function.BiConsumer;
// Accept two string and print concatenation
public class BiConsumerDemo1
{
	public static void main(String[] args)
	{
		BiConsumer<String, String> c = (s1,s2) -> {System.out.println(s1.concat(s2));
													System.out.println(s1+s2);
		};
		
		c.accept("Kha", "Nam");
	}
}