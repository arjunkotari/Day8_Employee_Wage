package employeeWage;

import java.util.Random;

public class EmployeeWage {
	private static int IS_FULL_TIME=1;
	private static int EMP_RATE_PER_HOUR=20;
	private static int IS_PART_TIME = 2;
	/*
	 * Calculating Employee Wage Computation 
	 */
	public static void employeeWage() {
			System.out.println("Welcome to Employee Daily Wage");		
			int empHrs = 0;
			int empWage = 0;
			double empCheck = Math.floor(Math.random()*10)%3;
			if(empCheck == IS_FULL_TIME)
				empHrs = 8;
			else if (empCheck == IS_PART_TIME)
				empHrs = 4;
			else
				empHrs = 0;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage:" + empWage);
		
	}
	public static void main(String[] args) {
		employeeWage();
	}

}
