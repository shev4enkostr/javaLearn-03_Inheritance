package com.shev4enkostr.abstractClasses;
/**
 * Абстрактный класс Person
 * @author shev4enkostr
 */
public abstract class Person 
{
	abstract String getDescription();
	
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
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public static int getNextId()
	{
		return nextId;
	}
}
