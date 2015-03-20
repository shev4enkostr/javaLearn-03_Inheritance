package com.shev4enkostr.object;

abstract public class Person
{
	private static int nextId = 1;
	
	private String name = "No name";
	private int id;
	
	{
		id = nextId;
		nextId++;
	}
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public Person()
	{
	}
	
	abstract public String getDescription()
	
	public String getName()
	{
		return name;
	}
	
	abstract public boolean equals(Object otherObject)
	
	abstract public String equalsString(Object otherObject)
	
	abstract public int hashCode()
	
	abstract public String toString()
	
	public int getId()
	{
		return id;
	}
	
	public static int getNextId()
	{
		return nextId;
	}
}
