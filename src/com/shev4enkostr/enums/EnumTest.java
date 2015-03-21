package com.shev4enkostr.enums;
import java.util.*;

public class EnumTest
{
	public static void main(String... args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE, EXTRA_EXTRA_LARGE, EXTRA_EXTRA_EXTRA_LARGE) ");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("size = " + size);
		System.out.println("abbreviation = " + size.getAbbreviation());
		
		if (size == Size.EXTRA_LARGE | size == Size.EXTRA_EXTRA_LARGE | size == Size.EXTRA_EXTRA_EXTRA_LARGE)
			System.out.println("Good job--you paid attention to the _.");
			
		Size[] test = new Size[6];
		test[0] = Size.SMALL;
		test[1] = Size.MEDIUM;
		test[2] = Size.LARGE;
		test[3] = Size.EXTRA_LARGE;
		test[4] = Size.EXTRA_EXTRA_LARGE;
		test[5] = Size.EXTRA_EXTRA_EXTRA_LARGE;
		
		for (Size s : test)
			System.out.println(s);
	}
}

