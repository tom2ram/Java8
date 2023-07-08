package com.durga.streamapi;

import java.util.ArrayList;

//Processing the Stream using toArray() method
public class StreamAPIDemo8
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
		
		Integer [] arr = l.stream().toArray(Integer [] :: new);
		for (Integer x : arr)
		{
			System.out.println(x);
		}
	}
}
