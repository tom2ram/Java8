package com.durga.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Processing the Stream using filter and map method
//Given a String ArrayList, for filter - find out name whose length is greater than 9.
//for map we want all element in upper case.
public class StreamAPIDemo3
{
	public static void main(String[] args)
	{
		ArrayList<String> l = new ArrayList<String>();
		l.add("pawan");
		l.add("raviteja");
		l.add("cheeranjeevi");
		l.add("venkatesh");
		l.add("nagaarjun");

		System.out.println(l); //[pawan, ravi teja, cheeranjeevi, venkatesh nath, naga arjun]
		
		List<String> l1 = l.stream().filter(s -> s.length() >= 9).collect(Collectors.toList());
		System.out.println(l1);//[cheeranjeevi, venkatesh, nagaarjun]
		
		List<String> l2 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);//[PAWAN, RAVITEJA, CHEERANJEEVI, VENKATESH, NAGAARJUN]

	}
}
