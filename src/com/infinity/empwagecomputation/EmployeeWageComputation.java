package com.infinity.empwagecomputation;

import java.util.Random;

public class EmployeeWageComputation {
	/*
	 * empAttendance use for employee is present or absent
	 * empWage use to calculate daily employee wage
	 * empType use for employee is part time or full time
	 * totalWage use for to calculate total wage
	 * total_hr use for to calculate total hours
	 * total_days use for to calculate total days
	 * Random class object use for random number generation which is use employee is present or absent
	 */
	int empAttendance;
	int empType;
	int empWage=0;
	int totalWage=0;
	int total_hours=0;
	int total_days=1;
	int wage_per_hours=0;
	int total_working_days;
	int total_working_hours;
	
	Random random=new Random();
	/*
	 * showAttendace(String statement) function use for print employee is present or absent and 
	 * empAttendance variable use for pass present or absent string value
	 */
	public void showAttendance(String empAttendance){
		System.out.println("Employee is "+empAttendance);
	}
	/*
	 * calculateWage(int hours,String statement) function use for to calculate employee wage and
	 * hour variable use for employee present hours and 
	 * empStatus variable use for employee is Part time or Full time
	 */
	public void calculateWage(int hours,int wage_per_hours,String empStatus){ 
		System.out.println("Employee is "+empStatus); 
		empWage=wage_per_hours*hours; 
		total_hours=total_hours+hours;
		System.out.println("Employee Wage="+empWage);
	}
	public void employeeWage(String c_name,int total_working_days,int total_working_hours,int wage_per_hours){
		this.total_working_days=total_working_days;
		this.total_working_hours=total_working_hours;
		this.wage_per_hours=wage_per_hours;
		
		System.out.println("Company Name ="+c_name);
		System.out.println("Wage Per Hour= "+wage_per_hours);
		System.out.println("Monthly Total Days= "+total_working_days);
		System.out.println("Total Working Hours= "+total_working_hours);
		System.out.println("------------------------------");
		while(total_days != total_working_days && total_hours < total_working_hours) {
			System.out.println("Day = "+total_days+"   Total Hr="+total_hours);
			empWage=0;
			empAttendance=random.nextInt(2);
			/*
			 * 1.if else loop use for employee attendance
			 * 2.switch case use for to calculate Full time and 
			 * Part time employee wage calculation
			 */
			if(empAttendance==Constants.IS_PRESENT){
				showAttendance("Present");
				empType=random.nextInt(2);
				switch(empType){
				case Constants.IS_PART_TIME:
					calculateWage(Constants.PART_TIME_HOUR,wage_per_hours,"Part time");
					break;
					
				case Constants.IS_FULL_TIME:
					calculateWage(Constants.FULL_TIME_HOUR,wage_per_hours,"Full time");
					break;
				}
			}else{
				showAttendance("Absent");
				System.out.println("Employee Wage="+empWage);
			} 
			totalWage=totalWage+empWage;
			System.out.println("--------------------------");
			total_days++;
		}
		System.out.println("--------------------------");
		System.out.println("Employee Total Wages="+totalWage);
		System.out.println("Total hours="+total_hours);
		System.out.println("Total days="+total_days);
	}

	public static void main(String[] args) {
		//ewc is object of EmployeeWageComputation class
		EmployeeWageComputation ewc=new EmployeeWageComputation();
		System.out.println("Welcome to Employee Wage Computation");
		ewc.employeeWage("TCS",20,100,30);
	}

}
