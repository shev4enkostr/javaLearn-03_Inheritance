package com.shev4enkostr.ArrayList;

import java.util.ArrayList;

/** 
  * Применение класса ArrayList
  * @author shev4enkostr
 */

public class ArrayListTest
{
	public static void main(String[] args)
	{
		ArrayList<Employee> staff = new ArrayList<>();
		
		staff.add(new Employee("Stas", 50000, 2009, 07, 13));
		staff.add(new Employee("Maxx", 40000, 2013, 12, 15));
		staff.add(new Employee("Serg", 20000, 2004, 03, 01));
		
		for (Employee e : staff)
			System.out.println(e);
		System.out.println();
			
		for (Employee e : staff)
			e.raiseSalary(5);
			
		for (Employee e : staff)
			System.out.println(e);
		
		
		/*ArrayList<Employee> staff = new ArrayList<>(1);
		
		System.out.println("Размер массива = " + staff.size());
		
		staff.add(new Employee());
		System.out.println("Размер массива = " + staff.size());
		
		staff.add(new Employee("Stas", 50000, 2011, 07, 22));
		System.out.println("Размер массива = " + staff.size());
		
		System.out.println("Нулевой элемент массива: " + staff.get(0));
		System.out.println("Первый элемент массива: " + staff.get(1));
		System.out.println(staff.get(1));
		
		Employee[] temp = new Employee[3];
		temp[0] = new Employee("Stas", 50000, 2000, 01, 01);
		System.out.println("Массив temp[0]: " + temp[0]);
		
		System.out.println();
		System.out.println("Кол-во элементов staff: " + staff.size());
		System.out.println("Кол-во элементов temp: " + temp.length);
		
		Employee e = staff.get(0);
		e.setName("Bob");
		System.out.println("Нулевой элемент массива: " + staff.get(0));
		*/
	}
}
