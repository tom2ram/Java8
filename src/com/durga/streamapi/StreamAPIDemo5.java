package com.durga.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Processing the Stream using sorted method
public class StreamAPIDemo5
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

		// Default Natural Sorting Order
		List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);// [0, 5, 10, 15, 20, 25]

		// Customized Sorting Order
		List<Integer> l2 = l.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(l2); // [25, 20, 15, 10, 5, 0]

		// another way to write compareTo method is use minus.
		List<Integer> l3 = l.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l3); // [25, 20, 15, 10, 5, 0]
	}
}
