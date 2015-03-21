package com.shev4enkostr.abstractClasses;

import java.util.Date;
import java.util.GregorianCalendar;
/**
 * Подкласс абстрактного суперкласса Person
 * @author stas
 */
public class Employee extends Person
{
	private double salary = 0;
	private Date hireDay = new Date();
			
	public Employee(String name, double salary, int year, int month, int day)
	{
		super(name);
		this.salary = salary;
		GregorianCalendar date = new GregorianCalendar(year, month - 1, day);
		hireDay = date.getTime();
	}
	
	public Employee(String name, double salary)
	{
		super(name);
		this.salary = salary;
	}
	
	public String getDescription()
	{
		return String.format("In employee with a salary of $%.2f", salary);
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return (Date) hireDay.clone();
	}
	
	public double raiseSalary(double byPercent)
	{
		double raise = (salary * byPercent) / 100;
		return salary += raise;
	}
}
