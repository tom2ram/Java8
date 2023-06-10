package com.durga.predefine.functionalinterface.Function;

import java.util.ArrayList;
import java.util.function.Function;

//Program to find Student Grade by using Function.
public class FunctionDemo3
{
	public static void main(String[] args)
	{
		ArrayList<Student> l = new ArrayList<>();
		populate(l);
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
		for (Student student : l)
		{
			System.out.println("name : " + student.name);
			System.out.println("marks : " + student.marks);
			System.out.println("grade : " + f.apply(student));
			System.out.println();
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

class Student
{
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

}