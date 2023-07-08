package com.durga.streamapi;

import java.util.ArrayList;

//Processing the Stream using min() and max() method
public class StreamAPIDemo6
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		System.out.println(l); // [0, 10, 20, 5, 15, 25]
		
		Integer min = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		
		Integer max = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);
	}
}
