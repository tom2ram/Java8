package com.durga.predefine.functionalinterface.biargs;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

// Demo Program to Increment Employee Salary by using BiFunction & BiConsumer
public class BiConsumerDemo2
{
	public static void main(String[] args)
	{
		ArrayList<Employee1> l = new ArrayList<Employee1>();
		BiFunction<String, Double, Employee1> f = (n,s) -> new Employee1(n, s);
		l.add(f.apply("durga", 1000.0));
		l.add(f.apply("sunny", 1200.0));
		l.add(f.apply("bunny", 1400.0));
		l.add(f.apply("chinny", 1300.0));
		l.add(f.apply("vinny", 900.0));
		
		BiConsumer<Employee1, Double> c = (e, increment) -> e.Salary = e.Salary+increment;
		for (Employee1 emp : l)
		{
			c.accept(emp, 450.0);
		}
		
		for (Employee1 emp : l)
		{
			System.out.println(emp.name);
			System.out.println(emp.Salary + "\n");
		}
	}
}

class Employee1
{
	String name;
	double Salary;
	
	public Employee1(String name, double salary) {
		this.name = name;
		Salary = salary;
	}
}