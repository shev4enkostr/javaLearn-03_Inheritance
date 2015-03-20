package com.shev4enkostr.ArrayList;
import java.util.Objects;

public class Student extends Person
{
	private String major = "nothing";
	
	public Student(String name, String major)
	{
		super(name);
		this.major = major;
	}
	
	public Student()
	{
	}
	
	public String getDescription()
	{
		return "the specialist of " + major;
	}
	
	public boolean equals(Object otherObject)
	{
		if (this == otherObject)
			return true;
			
		if (this.getClass() != otherObject.getClass())
			return false;
			
		Student object = (Student) otherObject;
		
		return this.getName() == object.getName() &&
			this.major == object.major;
	}
	
	public String equalsString(Object otherObject)
	{
		if (this == otherObject)
			return String.valueOf(true + " 1" + " Student");
			
		if (otherObject == null)
			return String.valueOf(false + " 2" + " Student");

		if (this.getClass() != otherObject.getClass())
			return String.valueOf(false + " 3" + " Student");
			
		Student object = (Student) otherObject;
		
		return String.valueOf(this.getName() == object.getName()) +
			String.valueOf(this.major == object.major) + " Student";
	}
	
	public int hashCode()
	{
		return Objects.hash(this.getName(), this.major);
	}
	
	public String toString()
	{
		return getClass().getName() +
			"[name = " + this.getName() +
			", major = " + this.major +"]";
	}
}
