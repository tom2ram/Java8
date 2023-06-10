package com.durga.predefine.functionalinterface.Function;

import java.util.ArrayList;
import java.util.function.Function;

//Program to find Total Monthly Salary of All Employees by using Function.
public class FunctionDemo5
{
	public static void main(String[] args)
	{
		ArrayList<Employee> l = new ArrayList<>();
		populate(l);
		
		Function<ArrayList<Employee>, Double> f = s -> {
			double total = 0;
			for (Employee emp : l)
			{
				total = total + emp.salary;
			}
			return total;
		};
		
		System.out.println("The total salary : " + f.apply(l));
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

class Employee{
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return name + " : " + salary;
	}
}