package com.durga.predefine.functionalinterface.biargs;

import java.util.function.BiFunction;

//To calculate Monthly Salary With Employee and TimeSheet By BiFunction
public class BiFunctionDemo3
{
	public static void main(String[] args)
	{
		Employee e = new Employee(101, "durga", 1500);
		TimeSheet t = new TimeSheet(101, 25);
		BiFunction<Employee, TimeSheet, Double> f = (emp,tm) -> e.dailyWage * t.days;
		
		System.out.println("Monthly Salary : "+ f.apply(e, t));
	}

}
class Employee{
	int eno;
	String ename;
	double dailyWage;
	
	public Employee(int eno, String ename, double dailyWage) {
		this.eno = eno;
		this.ename = ename;
		this.dailyWage = dailyWage;
	}
}

class TimeSheet{
	int eno;
	int days;
	public TimeSheet(int eno, int days) {
		this.eno = eno;
		this.days = days;
	}
}