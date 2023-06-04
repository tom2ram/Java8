package com.durga.predefine.functionalinterface.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

/*Program for user Authentication by using predicate*/
public class PredicateDemo8
{
	public static void main(String[] args)
	{
		Predicate<User> userAthenticate = user -> user.userName.equals("durga") && user.password.equals("java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username : ");
		String username = sc.next();
		System.out.println("Enter password : ");
		String password = sc.next();
		sc.close();
		User user = new User(username, password);
		if(userAthenticate.test(user))
		{
			System.out.println("Valid user");
		}
		else
		{
			System.out.println("Invalid user, Pls login again");
		}
	}
}

class User
{
	String userName;
	String password;

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

}
