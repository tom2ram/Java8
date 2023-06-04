package com.durga.predefine.functionalinterface.Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;
// To check collection is empty or not
public class PredicateDemo3
{
	public static void main(String[] args)
	{
		ArrayList<Integer> t = new ArrayList<>();
		t.add(10);
		Predicate<Collection> p = a -> a.isEmpty();
		System.out.println(p.test(t));
		ArrayList<Integer> t1 = new ArrayList<>();
		System.out.println(p.test(t1));
		
		LinkedList<String> ll = new LinkedList<>();
		System.out.println(p.test(ll));
		ll.add("khalid");
		System.out.println(p.test(ll));
	}
}
