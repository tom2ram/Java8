package com.durga.predefine.functionalinterface.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

//Consumer chaining --> andThen() method
public class ConsumerDemo4
{
	public static void main(String[] args)
	{
		ArrayList<Movie1> al = new ArrayList<>();
		populate(al);
		
		Consumer<Movie1> c1 = m -> System.out.println("Movie " + m.name + " is ready to release");
		
		Consumer<Movie1> c2 = m -> System.out.println("Movie " + m.name + " is " + m.result);
		
		Consumer<Movie1> c3 = m -> System.out.println("Movie " + m.name + " information stored into DB");
		
		for (Movie1 movie1 : al)
		{
			c1.andThen(c2).andThen(c3).accept(movie1);
			System.out.println();
		}
	}

	private static void populate(ArrayList<Movie1> l)
	{
		l.add(new Movie1("Bahubali", "Hit"));
		l.add(new Movie1("Rayees", "Hit"));
		l.add(new Movie1("Sultan", "Flop"));
		l.add(new Movie1("Dangal", "HIT"));
		l.add(new Movie1("Bangbang", "Flop"));
	}
}
class Movie1{
	String name;
	String result;
	
	public Movie1(String name, String result) {
		this.name = name;
		this.result = result;
	}
}