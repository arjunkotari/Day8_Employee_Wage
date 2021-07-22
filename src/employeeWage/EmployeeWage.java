package employeeWage;

import java.util.List;
import java.util.Random;

public class EmployeeWage {
	// Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static int company1;
	public static int company2;
	public static int empHrs;
	public static int totalEmpHrs;
	public static int totalWorkingDays;

	/*
	 * Calculating Employee Wage Computation
	 */
	public static int employeeWageBuilder(String company, int empRatePerHour, int numOfWorkingDays,
			int maxHoursPerMonth) {
		System.out.println("Welcome to Employee Daily Wage " + company);
		// Variables
		empHrs = 0;
		totalEmpHrs = 0;
		totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		// save the total wage for each company
		company1 = employeeWageBuilder("DMart", 20, 2, 10);
		company2 = employeeWageBuilder("Reliance", 10, 4, 20);
	}
}
