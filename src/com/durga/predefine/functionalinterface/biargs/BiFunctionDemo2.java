package com.durga.predefine.functionalinterface.biargs;

import java.util.ArrayList;
import java.util.function.BiFunction;

//Creation of Student object by taking name and rollNum as input with BiFunction
public class BiFunctionDemo2
{
	public static void main(String[] args)
	{
		ArrayList<Student> l = new ArrayList<>();
		BiFunction<String, Integer, Student> f = (name,rollNum) -> new Student(name, rollNum);
		l.add(f.apply("durga", 5008));
		l.add(f.apply("ravi", 5758));
		l.add(f.apply("shiva", 6907));
		
		for (Student s : l)
		{
			System.out.println("name : " + s.name);
			System.out.println("rollNum : " + s.rollNum + "\n");
		}
	}

}

class Student{
	String name;
	int rollNum;
	
	public Student(String name, int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}
}