package com.shev4enkostr.inheritance;

public class Manager extends Employee
{
	private double bonus = 0;
	
	public Manager(String name, double salary, int year, int month, int day)
	{
		super(name, salary, year, month, day);
	}
	
	public Manager(String name, double salary)
	{
		super(name, salary);
	}
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	public double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	public double getBonus()
	{
		return bonus;
	}
}
