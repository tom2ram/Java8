package com.durga.predefine.functionalinterface.Function;

import java.util.Scanner;
import java.util.function.Function;

//Function chaining
//Demo Program for User Authentication by using Function chaining.
//username -> first 5 char should be Durga
//pass --> java

public class FunctionDemo9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username : ");
		String username = sc.next();
		System.out.println("Enter password : ");
		String password = sc.next();
		sc.close();
		Function<String, String> f1 = s -> s.substring(0, 5);
		
		Function<String, String> f2 = s -> s.toLowerCase();
		if(f1.andThen(f2).apply(username).equals("durga") && password.equals("java"))
		{
			System.out.println("Valid user");
		}
		else
		{
			System.out.println("invalid user");
		}
		
	}
}