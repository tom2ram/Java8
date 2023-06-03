package com.durga.lambda.collection;

import java.util.TreeSet;

public class MyLambdaExp7TreeSetSortComparator
{
	public static void main(String[] args)
	{
		TreeSet<Integer> al = new TreeSet<Integer>();
		al.add(5);
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(35);
		System.out.println("Default Natural Sorting : " + al);
		
		TreeSet<Integer> ts = new TreeSet<Integer>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		ts.add(5);
		ts.add(10);
		ts.add(50);
		ts.add(20);
		ts.add(35);
		System.out.println("Customized sorting order using Lambda Exp : " + ts);
	}
}
