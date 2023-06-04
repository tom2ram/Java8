package com.durga.predefine.functionalinterface.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*Employee Management Application by using Predicate*/
public class PredicateDemo10
{
	public static void main(String[] args)
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("durga", "ceo", "hyderabad", 30000));
		list.add(new Employee("khalid", "ceo", "hyderabad", 11500));
		list.add(new Employee("atif", "ase", "hyderabad", 3000));
		list.add(new Employee("asif", "team lead", "bangalore", 15000));
		list.add(new Employee("danish", "sse", "mau", 8000));
		list.add(new Employee("shahid", "se", "pune", 6500));
		//System.out.println(list);
		Predicate<Employee> p1 = e -> e.designation.equals("ceo");
		System.out.println("CEO information : ");
		display(p1,list);
		Predicate<Employee> p2 = emp -> emp.city.equals("hyderabad");
		System.out.println("Hyderabad Employee information : ");
		display(p2, list);
		System.out.println("All Employee information whose salary is less than 15000 : ");
		Predicate<Employee> p3 = emp -> emp.salary < 15000;
		display(p3, list);
		System.out.println("All CEO from Hyderabad information to give pink slip : ");
		display(p1.and(p2), list);
		
		System.out.println("All Employee who is CEO or having salary < 15000 : ");
		display(p1.or(p3), list);
		
		System.out.println("All Employee who are not CEO : ");
		display(p1.negate(), list);
	}

	private static void display(Predicate<Employee> p1, ArrayList<Employee> list)
	{
		for (Employee emp : list)
		{
			if(p1.test(emp))
			{
				System.out.println(emp);
			}
		}
		System.out.println("*********************************");
	}
}

class Employee
{
	String name;
	String designation;
	String city;
	double salary;

	public Employee(String name, String designation, String city, double salary) {
		this.name = name;
		this.designation = designation;
		this.city = city;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		String s = String.format("(%s, %s,%s,%.2f)",name,designation,city,salary);
		return s;
	}

}