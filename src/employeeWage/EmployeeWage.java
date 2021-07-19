package employeeWage;

import java.util.Random;

public class EmployeeWage {
	/*
	 * Calculating Employee Wage Computation 
	 */
	public static void employeeWage() {
		//Displaying welcome message
		System.out.println("Welcome to Employee Wage Computation");
		int check = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == check)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		
	}
	public static void main(String[] args) {
		employeeWage();
	}

}
