package com.durga.lambda.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MyLambdaExp6ListSortComparator
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(35);
		System.out.println("Before Sorting : " + al);
		//Default Natural sorting order
		/*Collections.sort(al);
		System.out.println("After Sorting : " + al);*/
		
		//Customized sorting order using Lambda Exp
		//Comparator<Integer> comp = (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;
		Collections.sort(al, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		System.out.println("After customized Sorting : " + al);
		
	}
}
