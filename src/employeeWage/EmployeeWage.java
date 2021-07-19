package employeeWage;

import java.util.Random;

public class EmployeeWage {
	public static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	private static int EMP_RATE_PER_HOUR=20;
	private static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MNTH = 10;
	/*
	 * Calculating Employee Wage Computation 
	 */
	public static void employeeWage() {
System.out.println("Welcome to Employee Daily Wage");
		
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MNTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
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
		totalEmpHrs += empHrs;
		System.out.println("Day# " + totalWorkingDays + "Emp Hr: " +empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}


	public static void main(String[] args) {
		employeeWage();
	}

}
