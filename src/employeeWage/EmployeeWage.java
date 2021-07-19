package employeeWage;

import java.util.Random;

public class EmployeeWage {
	private static int IS_FULL_TIME=1;
	private static int EMP_RATE_PER_HOUR=20;	
	/*
	 * Calculating Employee Wage Computation 
	 */
	public static void employeeWage() {
		//Displaying welcome message
		System.out.println("Welcome to Employee Wage Computation");		
		int empHrs=0;
		int empWage=0;
		//Calculating daily employee wage
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			empHrs=8;
		else
			empHrs=0;
		empWage	= empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " +empWage);
		
	}
	public static void main(String[] args) {
		employeeWage();
	}

}
