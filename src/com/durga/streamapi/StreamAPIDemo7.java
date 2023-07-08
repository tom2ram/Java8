package com.durga.streamapi;

import java.util.ArrayList;

//Processing the Stream using forEach() method
public class StreamAPIDemo7
{
	public static void main(String[] args)
	{
		ArrayList<String> l = new ArrayList<>();
		l.add("a");
		l.add("bb");
		l.add("ccc");
	
		l.stream().forEach(s -> System.out.println(s));
		
		//replace lambda expression by using method reference
		l.stream().forEach(System.out::println);
	}
}
