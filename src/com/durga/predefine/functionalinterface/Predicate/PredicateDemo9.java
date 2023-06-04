package com.durga.predefine.functionalinterface.Predicate;

import java.util.function.Predicate;

/*Program to check whether software engineer is allowed into pub or not by using predicate*/
public class PredicateDemo9
{
	public static void main(String[] args)
	{
		SoftwareEngineer[] list = { new SoftwareEngineer("durga", 22, false), new SoftwareEngineer("ravi", 25, true),
				new SoftwareEngineer("sunil", 27, true), new SoftwareEngineer("sagar", 16, true),
				new SoftwareEngineer("subbu", 25, false) };

		Predicate<SoftwareEngineer> check = se -> se.age > 18 && se.isHavingGf == true;

		for (SoftwareEngineer softwareEngineer : list)
		{
			if (check.test(softwareEngineer))
			{
				System.out.println("Software Engineer is allowed : " + softwareEngineer.Name);
			}
		}
	}
}

class SoftwareEngineer
{
	String Name;
	int age;
	boolean isHavingGf;

	public SoftwareEngineer(String name, int age, boolean isHavingGf) {
		Name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}

}