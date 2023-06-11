package com.durga.predefine.functionalinterface.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


//Program to display Student Information by using Predicate,Function and Consumer. If marks >= 60 then display student info.
public class ConsumerDemo3
{
	public static void main(String[] args)
	{
		ArrayList<Student> al = new ArrayList<>();
		populate(al);
		
		Predicate<Student> p = s -> s.marks >=60;
		
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
		
		Consumer<Student> c = s -> {
			System.out.println("Student Name : " + s.Name);
			System.out.println("Student Marks : " + s.marks);
			System.out.println("grade : " + f.apply(s));
			System.out.println();
		};
		
		for (Student std : al)
		{
			if(p.test(std)) {
				c.accept(std);
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

class Student
{
	String Name;
	int marks;

	public Student(String name, int marks) {
		Name = name;
		this.marks = marks;
	}
}