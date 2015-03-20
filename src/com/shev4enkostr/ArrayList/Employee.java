package com.shev4enkostr.ArrayList;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

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
	
	public Employee()
	{
	}
	
	public String getDescription()
	{
		return String.format("The salary of employee is $%.2f", salary);
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
	
	public String equalsString(Object otherObject)
	{
		//Быстро проверить объекты на идентичность
		if (this == otherObject)
			return String.valueOf(true + " 1" + " Employee");
			
		//Если явный параметр имеет пустое значение null
		//возвращаем логическое значение false
		if (otherObject == null)
			return String.valueOf(false + " 2" + " Employee");
			
		//Если классы не совпадают, они не равнозгачны
		if (this.getClass() != otherObject.getClass())
			return String.valueOf(false + " 3" + " Employee");
		//Теперь известно, что otherObject
		//является непустым объектом типа Employee
		//Выполняем операцию приведения типов
		Employee other = (Employee) otherObject;
		
		//Проверям содержат ли поля одинаковые значения
		return String.valueOf(this.getName().equals(other.getName())) +
			String.valueOf(this.salary == other.salary) +
			String.valueOf(this.hireDay.equals(other.hireDay) + " Employee");
			
		//return String.valueOf(Objects.equals(this.getName(), other.getName())) +
			//String.valueOf(this.salary == other.salary) +
			//String.valueOf(Objects.equals(this.hireDay, other.hireDay) + "Employee");
	}
	
	public boolean equals(Object otherObject)
	{
		if (this == otherObject)
			return true;

		if (otherObject == null)
			return false;

		if (this.getClass() != otherObject.getClass())
			return false;

		Employee other = (Employee) otherObject;

		return this.getName().equals(other.getName()) &&
			this.salary == other.salary &&
			this.hireDay.equals(other.hireDay);
	}
		
	public int hashCode()
	{
		return Objects.hash(this.getName(), this.salary, this.hireDay);
	}
	
	public String toString()
	{
		return getClass().getName() + 
			"[id = " + this.getId() + 
			", name = " + this.getName() +
			", salary = " + this.salary +
			", hireDay = " + this.hireDay +"]";
	}
}
