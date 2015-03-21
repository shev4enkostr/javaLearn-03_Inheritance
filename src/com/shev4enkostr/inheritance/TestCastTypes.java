package com.shev4enkostr.inheritance;

/**
 * @author shev4enkostr
 * Приведение типов объектов
 * оператор instanceof
 */
public class TestCastTypes
{
	public static void main(String[] args)
	{
		// Приведение типов разрешено
		Manager boss_1 = new Manager("Stas", 777);
		Employee staff_1 = new Manager("Maxx", 500000);
		
		if (staff_1 instanceof Manager)
			boss_1 = (Manager) staff_1;
		
		System.out.println(boss_1.getName()); // Выводится Maxx. Выполнено приведение типов!
		
		// Приведение типов запрещено!
		Manager boss_2 = new Manager("Stas", 777);
		Employee staff_2 = new Employee("Maxx", 500000);
		
		if (staff_2 instanceof Manager)
			boss_2 = (Manager) staff_2;
				
		System.out.println(boss_2.getName());  // Выводится Stas. Приведение типов не выполнено!
	}
}
