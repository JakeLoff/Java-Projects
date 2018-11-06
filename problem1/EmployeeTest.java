package com.ualbany.hw1.problem1;

public class EmployeeTest {

	public static void main(String[] args)
	{
		Employee Michael = new Employee ("Michael", "Scott", 3000.00); //Two employee objects
		Employee Dwight = new Employee ("Dwight", "Schrute", 2000.00);
		
		//print salaries for the year
		System.out.println("Michael's yearly salary is $" + Michael.getMonthlySalary()*12.0);
		
		System.out.println("Dwight's yearly salary is $" + Dwight.getMonthlySalary()*12.0);
		
		Michael.setMonthlySalary(Michael.getMonthlySalary()*1.1); //10% raises
		Dwight.setMonthlySalary(Dwight.getMonthlySalary()*1.1);
		
		System.out.println("Michael's yearly salary "
				+ "after a 10% bonus is $" + Michael.getMonthlySalary()*12.0); //bonus salaries printed
		
		System.out.println("Dwight's yearly salary "
				+ "after a 10% bonus is $" + Dwight.getMonthlySalary()*12.0);
	}
}
