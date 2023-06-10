package com.durga.predefine.functionalinterface.Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

//Program to perform Salary Increment for Employees by using Predicate and Function. if salary <6000 then increment of 477 
public class FunctionDemo6
{
	public static void main(String[] args)
	{
		ArrayList<Employee> l = new ArrayList<>();
		populate(l);
		
		System.out.println("Before Increment");
		System.out.println(l);
		
		Predicate<Employee> p = e -> e.salary < 6000;
		
		Function<Employee, Employee> f = s -> {
			s.salary = s.salary + 477;
			return s;
		};
		
		ArrayList<Employee> l2 = new ArrayList<>();
		System.out.println("After Increment");
		for (Employee employee : l)
		{
			if(p.test(employee))
			{
				f.apply(employee);
				l2.add(employee);
			}
		}
		
		System.out.println(l);
		System.out.println("Employees who's salary incremented");
		System.out.println(l2);
	}

	private static void populate(ArrayList<Employee> al)
	{
		al.add(new Employee("sunny", 12000));
		al.add(new Employee("bunny", 6500));
		al.add(new Employee("chinny", 5500));
		al.add(new Employee("vinny", 4500));
		al.add(new Employee("pinny", 2500));
	}
}