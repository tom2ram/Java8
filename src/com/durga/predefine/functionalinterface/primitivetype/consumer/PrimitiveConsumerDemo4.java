package com.durga.predefine.functionalinterface.primitivetype.consumer;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

public class PrimitiveConsumerDemo4
{
	public static void main(String[] args)
	{
		ArrayList<Employee> l = new ArrayList<>();
		populate(l);
		ObjDoubleConsumer<Employee> c = (e,d) -> e.salary = e.salary + d;
		
		for (Employee emp : l)
		{
			c.accept(emp, 500.0);
		}
		
		for (Employee e : l)
		{
			System.out.println("Employee Name " + e.name);
			System.out.println("Employee salary " + e.salary);
			System.out.println();
		}
	}

	private static void populate(ArrayList<Employee> l)
	{
		l.add(new Employee("khalid", 1000.0));
		l.add(new Employee("sunny", 2000.0));
		l.add(new Employee("bunny", 3000.0));
		l.add(new Employee("durga", 4000.0));
	}
}

class Employee{
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}