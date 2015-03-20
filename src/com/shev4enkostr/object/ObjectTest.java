package com.shev4enkostr.object;

public class ObjectTest
{
	public static void main(String[] args)
	{
		// Тестирование класса Object
		Object obj;
		
		obj = new Employee();
		
		Employee test = (Employee) obj;
		
		//System.out.println(obj.getName());
		System.out.println(test.getName());
		
		Employee[] staff = new Employee[10];
		obj = staff;
		obj = new int[10];
		
		int[] int_mass = (int[]) obj;
		
		System.out.println(int_mass[8]);
		
		
		// Тестирование метода equals()
		Person[] pers = new Person[10];
		
		pers[0] = new Employee("Stas", 50000, 1990, 5, 5);
		pers[1] = new Student("Andrey", "metrolog");
		pers[2] = new Manager("KNI", 75000);
		pers[3] = new Manager("Stas", 50000);
		pers[4] = new Employee("Stas", 50000, 1990, 5, 5);
		pers[5] = new Employee("Stas", 50000);
		pers[6] = new Employee("Stas", 50000);
		pers[7] = new Manager("Stas", 50000);
		
		Manager manag = (Manager) pers[3];
			manag.setBonus(5500);
		
		System.out.println(pers[0].equals(pers[4]));
		System.out.println(pers[0].equals(pers[0]));
		
		System.out.println();
		//System.out.println();
		
		System.out.println(pers[0].equals(pers[4]));
		
		//Тестирование метода equalsString()
		System.out.println();
		System.out.println(pers[0].equalsString(pers[5]));
		System.out.println(pers[0].equalsString(pers[1]));
		System.out.println(pers[1].equalsString(pers[0]));
		System.out.println(pers[6].equalsString(pers[5]));
		System.out.println(pers[3].equalsString(pers[5]));
		System.out.println(pers[2].equalsString(pers[3]));
		System.out.println(pers[3].equalsString(pers[7]));
		
		// Тестирование метода hashCode()
		System.out.println();
		System.out.println(pers[0].hashCode());
		System.out.println(pers[4].hashCode());
		System.out.println(pers[3].hashCode());
		
		// Тестирование метода toString
		System.out.println();
		System.out.println(pers[0].toString());
		System.out.println(pers[1].toString());
		System.out.println(pers[3].toString());
	}
}

