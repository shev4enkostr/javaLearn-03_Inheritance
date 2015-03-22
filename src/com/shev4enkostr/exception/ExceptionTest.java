package com.shev4enkostr.exception;

import java.util.Date;
import java.util.*;

public class ExceptionTest
{
	public static void main(String... args) throws ClassNotFoundException, IllegalAccessException, InstantiationException
	{
		try
		{
			Date d = new Date();
			String className = d.getClass().getName();
			Class cl = Class.forName(className);
			System.out.println("Class cl = " + cl);
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			System.out.println();
		
			Scanner in = new Scanner(System.in);
			System.out.println("Enter class name: ");
			String name = in.next();
			System.out.println();
			in.close();
		
			Class cl2 = Class.forName(name);
			System.out.println("Class cl2 = " + cl2);
		
			Object obj = cl2.newInstance();
			System.out.println("Object obj = " + obj);
		}
		
		catch (Exception ClassNotFoundException)
		{
			System.out.println("Возникло исключение!");
			System.out.println(ClassNotFoundException.getCause());
		}
		
		/*Date d = new Date();
		String className = d.getClass().toString();
		
		//Class cl = Class.forName(className);
		//System.out.println("Class cl = " + cl.toString());
		
		//Object obj = cl.newInstance();
		
		Object m = Class.forName(className).newInstance();
		*/
	}
}
