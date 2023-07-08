package com.durga.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//ArrayList -> [0, 10, 20, 5, 15, 25]  -> Can you please list out all the even number into a list. Here we have use filter method
public class StreamAPIDemo1
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
		System.out.println(l);// [0, 10, 20, 5, 15, 25]

		// without stream until 1.7 version.
		/*
		 * List<Integer> l1 = new ArrayList<>();
		 * 
		 * for (Integer i : l) { if (i % 2 == 0) { l1.add(i); } }
		 * System.out.println(l1);
		 */ // [0, 10, 20]

		// with stream from 1.8 version onwards.
		List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);// [0, 10, 20]
	}
}
