package com.shev4enkostr.object;
import java.util.Objects;

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
	
	public Manager()
	{
	}
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	public double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary += bonus;
	}
	
	public boolean equals(Object otherObject)
	{
		if (! super.equals(otherObject))
			return false;
			
		Manager other = (Manager) otherObject;
		
		return this.bonus == other.bonus;
	}
	
	public String equalsString(Object otherObject)
	{
		if (! super.equals(otherObject))
			return String.valueOf(false) + " Manager 1";
			
		Manager other = (Manager) otherObject;
		
		return String.valueOf(this.bonus == other.bonus) + " Manager 2";
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), this.bonus);
	}

	@Override
	public String toString()
	{
		return super.toString() + 
			"[bonus = " + this.bonus + "]";
	}
}
