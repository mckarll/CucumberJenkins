package com.neotech.practice;

import java.util.ArrayList;
import java.util.List;

public class ListOfPerson {

	public static void main(String[] args) {

		List<Person> listOfPeople = new ArrayList<>();
		listOfPeople.add(new Person("Emre", 30));
		listOfPeople.add(new Person("Yildirim", 25));
		listOfPeople.add(new Person("Can", 20));
		
		System.out.println(listOfPeople);
		
		for ( Person p : listOfPeople)
		{
			System.out.println(p);
		}
		
		//if you do not have toString
		// you can still print info -- only if attributes are visible
		/*
		 * for (Person p : listOfPeople) { System.out.println(p.name + " : " + p.age); }
		 */
		
	}

}


class Person
{
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	
	public String toString()
	{
		return name + " : " + age;
	}
	
}