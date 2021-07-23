package employeeWage;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeWageMain implements EmployeeWage {
	public int totalEmpWage = 0;
    /*
     * Calculating Employee Wage Computation
     */
    public void empWage() {            
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num of companies you want to add");
        int num = scanner.nextInt();
        // ArrayList
        // saving the total wage for each company in ArrayList.       
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter Comapny Name");
            String name = scanner.next();
            System.out.println("Enter Emp Rate PerHour");
            int empRatePerHour = scanner.nextInt();
            System.out.println("Enter numOf Working Days");
            int numOfWorkingDays = scanner.nextInt();
            System.out.println("Enter max Hours Per Month ");
            int maxHoursPerMonth = scanner.nextInt();
            
            System.out.println("Welcome to Employee Daily Wage " + name);
            int empHrs = 0;
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;            

            // Computation
            while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
                totalWorkingDays++;
                //Generating random number
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
                //calculating daily wage
                int dailyWage = empHrs * empRatePerHour;
                //storing daily wage into ArrayList
                al.add(dailyWage);
                System.out.println("Daily wage "+ dailyWage);
            }            
            totalEmpWage = totalEmpHrs * empRatePerHour;
            System.out.println("Total Emp Wage: " + totalEmpWage);
            //store the Total employee wage into ArrayList.            
            al.add(totalEmpWage);           
            //displaying ArrayList elements.
            System.out.println(al);
        }
        scanner.close();
    }
    /*
     * Total employee wage
     */
    public void EmpWageBuilder() {
    	System.out.println("Total wage: "+totalEmpWage);
    }
    public static void main(String[] args) {
    	EmployeeWageMain em  = new EmployeeWageMain();
    	em.empWage();
    	em.EmpWageBuilder();
    }

}
