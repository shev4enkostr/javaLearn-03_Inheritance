package com.shev4enkostr.abstractClasses;
/**
 * В этой программе демонстрируется применение абстрактных классов
 * @author stas
 */
public class PersonTest 
{
	public static void main(String[] args)
	{
		Person[] people = new Person[2];
		
		people[0] = new Employee("Marlin Manson", 100_000, 1991, 4, 21);
		people[1] = new Student("Jack Potroshytel", "economist");
		
		for (Person p : people)
			System.out.println("ID: " + p.getId() + ", " + p.getName() + ". " + p.getDescription() + ".");
	}
}
