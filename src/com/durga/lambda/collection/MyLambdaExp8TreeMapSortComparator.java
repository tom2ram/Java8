package com.durga.lambda.collection;

import java.util.TreeMap;

public class MyLambdaExp8TreeMapSortComparator
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(50, "Khalid");
		map.put(10, "Habib");
		map.put(6, "Febuary");
		map.put(11, "Khanam");
		map.put(16, "Match");
		map.put(8, "July");

		System.out.println("Default Natural Sorting : " + map);

		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		map1.put(50, "Khalid");
		map1.put(10, "Habib");
		map1.put(6, "Febuary");
		map1.put(11, "Khanam");
		map1.put(16, "Match");
		map1.put(8, "July");
		
		System.out.println("Customized sorting order using Lambda Exp : " + map1);
	}
}
