package employeeWage;

import java.util.Random;

public class EmployeeWage {
	public static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	private static int EMP_RATE_PER_HOUR=20;
	private static final int NUM_OF_WORKING_DAYS = 2;
	/*
	 * Calculating Employee Wage Computation 
	 */
	public static void employeeWage() {
		System.out.println("Welcome to Employee Daily Wage");
		
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
		int empCheck =(int) Math.floor(Math.random()*10) % 3;
		switch (empCheck) {
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("Emp Wage: " + empWage);
		}
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}


	public static void main(String[] args) {
		employeeWage();
	}

}
