package com.durga.streamapi;

import java.util.ArrayList;
//Processing the Stream using count method
//Given a String ArrayList, for filter - find the count whose length is greater than 9.
public class StreamAPIDemo4
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
		
		long count = l.stream().filter(s -> s.length() >= 9).count();
		System.out.println("The number of Strings whose length is >= 9 : " +count);//The number of Strings whose length is >= 9 : 3
	}
}
