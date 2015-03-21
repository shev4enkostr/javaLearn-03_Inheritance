package com.shev4enkostr.inheritance;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee 
{
	private static int nextId = 1;
	
	private String name = "No name";
	private double salary = 0;
	private Date hireDay = new Date();
	private int id;
	
	{
		id = nextId;
		nextId++;
	}
	
	public Employee(String name, double salary, int year, int month, int day)
	{
		this.name = name;
		this.salary = salary;
		GregorianCalendar date = new GregorianCalendar(year, month - 1, day);
		hireDay = date.getTime();
	}
	
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return (Date) hireDay.clone();
	}
	
	public int getId()
	{
		return id;
	}
	
	public double raiseSalary(double byPercent)
	{
		double raise = (salary * byPercent) / 100;
		return salary += raise;
	}
}
