package com.shev4enkostr.abstractClasses;

/**
 * Подкласс абстрактного суперкласса Person
 * @author stas
 */

public class Student extends Person
{
	private String major = "";
	
	public Student(String name, String major)
	{
		super(name);
		this.major = major;
	}
	
	public String getDescription()
	{
		return "A student majoring in " + major;
	}
}
