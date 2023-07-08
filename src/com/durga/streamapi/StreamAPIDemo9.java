package com.durga.streamapi;

import java.util.stream.Stream;

//Processing the Stream using of() method
public class StreamAPIDemo9
{
	public static void main(String[] args)
	{
		//Stream apply for group of values.
		Stream<Integer> i = Stream.of(9,99,999,9999,99999);
		i.forEach(System.out :: println);
		
		// Stream apply for Array.
		Double [] d = {10.1,10.2,10.3,10.4};
		Stream<Double> d1 = Stream.of(d);
		d1.forEach(System.out :: println);
	}
}
