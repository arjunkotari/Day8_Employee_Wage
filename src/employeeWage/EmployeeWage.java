package employeeWage;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
	// Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static int company;
	public static int empHrs;
	public static int totalEmpHrs;
	public static int totalWorkingDays;

	/*
	 * Calculating Employee Wage Computation
	 */
	public static int employeeWageBuilder(String company, int empRatePerHour, int numOfWorkingDays,
			int maxHoursPerMonth) {
		System.out.println("Welcome to Employee Daily Wage " + company);
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
		// saving the total wage for each company in Array.
		// company1 = employeeWageBuilder("DMart", 20, 2, 10);
		// company2 = employeeWageBuilder("Reliance", 10, 4, 20);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num of companies you want to add");
		int num = scanner.nextInt();
		// array
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter Comapny Name");
			String name = scanner.next();
			System.out.println("Enter Emp Rate PerHour");
			int empRatePerHour = scanner.nextInt();
			System.out.println("Enter numOf Working Days");
			int numOfWorkingDays = scanner.nextInt();
			System.out.println("Enter max Hours Per Month ");
			int maxHoursPerMonth = scanner.nextInt();
			company = employeeWageBuilder(name, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
			array[i] = company;
		}
		scanner.close();
	}
}
