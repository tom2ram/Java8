package com.durga.predefine.functionalinterface.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

//Program to display Movie Information by using Consumer
public class ConsumerDemo2
{
	public static void main(String[] args)
	{
		ArrayList<Movie> l = new ArrayList<>();
		populate(l);
		Consumer<Movie> c = m -> {
			System.out.println("Movie Name : " + m.movieName);
			System.out.println("Movie Hero : " + m.movieHero);
			System.out.println("Movie Heroin : " + m.movieHeroin);
			System.out.println("");
		};
		
		for (Movie movie : l)
		{
			c.accept(movie);
		}
	}

	private static void populate(ArrayList<Movie> l)
	{
		l.add(new Movie("Bahubali", "Prabhas", "Anushka"));
		l.add(new Movie("Rayees", "SRK", "Sunny"));
		l.add(new Movie("Sultan", "Salman", "Aishwarya"));
		l.add(new Movie("Dangal", "Amir", "Ritu"));
		l.add(new Movie("Bangbang", "Hrithik", "Katrina"));
		
	}
}

class Movie
{
	String movieName;
	String movieHero;
	String movieHeroin;

	public Movie(String movieName, String movieHero, String movieHeroin) {
		this.movieName = movieName;
		this.movieHero = movieHero;
		this.movieHeroin = movieHeroin;
	}
}