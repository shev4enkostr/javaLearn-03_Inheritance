package com.shev4enkostr.inheritance;

public class ManagerTest 
{
	public static void main(String[] args)
	{
		Manager boss = new Manager("KNI", 6500);
		boss.setBonus(650);
		
		Employee[] staff = new Employee[3];
		
		staff[0] = boss;
		staff[1] = new Employee("Stas", 3850);
		staff[2] = new Employee("Maxx", 3100);
		
		for (Employee e : staff)
			System.out.println("ID: " + e.getId() + ". " + e.getName() + ", " + e.getSalary());
	}
}