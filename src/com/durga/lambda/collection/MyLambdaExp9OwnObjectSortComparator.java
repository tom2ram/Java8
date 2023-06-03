package com.durga.lambda.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MyLambdaExp9OwnObjectSortComparator
{
	public static void main(String[] args)
	{

		/*Employee e1 = new Employee(50, "Khalid");
		Employee e2 = new Employee(10, "Habib");
		Employee e3 = new Employee(6, "Febuary");
		Employee e4 = new Employee(11, "Khanam");
		Employee e5 = new Employee(16, "Match");
		Employee e6 = new Employee(8, "July");*/
		//System.out.println(e1);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(50, "Khalid"));
		list.add(new Employee(10, "Habib"));
		list.add(new Employee(6, "Febuary"));
		list.add(new Employee(11, "Khanam"));
		list.add(new Employee(16, "Match"));
		list.add(new Employee(8, "July"));
		System.out.println("Before Sorting : "+list);
		Collections.sort(list, (emp1, emp2) -> (emp1.empID > emp2.empID) ? 1 : (emp1.empID < emp2.empID) ? -1 : 0);
		System.out.println("AFter Accending order sorting based on empID : "+list);
		
		Collections.sort(list, (emp1, emp2) -> (emp1.empID > emp2.empID) ? -1 : (emp1.empID < emp2.empID) ? 1 : 0);
		System.out.println("After Decending order sorting based on empID : "+list);
		
		Collections.sort(list, (emp1, emp2) -> (emp1.empName.compareTo( emp2.empName)));
		System.out.println("After Alphabatical order sorting based on empName : "+list);
		
		Collections.sort(list, (emp1, emp2) -> (emp2.empName.compareTo( emp1.empName)));
		System.out.println("After Reverse Alphabatical order sorting based on empName : "+list);
	}
}

class Employee
{
	int empID;
	String empName;

	public Employee(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}

	public String toString()
	{
		return empID + ":" + empName;
	}
}
