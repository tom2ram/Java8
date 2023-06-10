package com.durga.predefine.functionalinterface.Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

//Program to find Student Grade by using Function. and check students marks is greater than 60 or not.
public class FunctionDemo4
{
	public static void main(String[] args)
	{
		ArrayList<Student> l = new ArrayList<>();
		populate(l);
		Predicate<Student> p = s -> s.marks >= 60;
		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80)
				return "A[dictantion]";
			else if (marks >= 60)
				return "B[first]";
			else if (marks >= 45)
				return "C[second]";
			else if (marks >= 35)
				return "D[third]";
			else
				return "E[FAILED]";
		};
		for (Student std : l)
		{
			if (p.test(std))
			{
				System.out.println("name : " + std.name);
				System.out.println("marks : " + std.marks);
				System.out.println("grade : " + f.apply(std));
				System.out.println();
			}
		}
	}

	private static void populate(ArrayList<Student> al)
	{
		al.add(new Student("sunny", 100));
		al.add(new Student("bunny", 65));
		al.add(new Student("chinny", 55));
		al.add(new Student("vinny", 45));
		al.add(new Student("pinny", 25));
	}
}