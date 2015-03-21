package com.shev4enkostr.objectWrapper;
import java.util.*;

public class WrapperTest
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(4);
		
		System.out.println(list.get(0));
		
		Integer number = list.get(0);
		
		number++;
		
		System.out.println(number);
		
		Integer a = 1000;
		Integer b = 1000;
		
		if (a == b)
			System.out.println("Сравнение a == b сработало!");
		else
			System.out.println("Сравнение a == b НЕ сработало!");
			
		if (a.equals(b))
			System.out.println("Сравнение a.equals(b) сработало!");
		else
			System.out.println("Сравнение a.equals(b) НЕ сработало!");
			
		
		Integer x = 10;
		Integer y = 10;

		if (x == y)
			System.out.println("Сравнение x == y сработало!");
		else
			System.out.println("Сравнение x == y НЕ сработало!");
			
		int z =Integer.parseInt("12345");
		System.out.println(z);
	}
}
