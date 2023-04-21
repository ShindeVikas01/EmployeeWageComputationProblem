package com.infinity.empwagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		/**
		 * empAttendance use for employee is present or absent
		 * empWage use to calculate daily employee wage
		 * WAGE_PER_HOUR use for per hour wage
		 * FULL_DAY_HOUR use for full day hours 
		 */
		int empAttendance,empWage;
		final int WAGE_PER_HOUR=20;
		final int FULL_DAY_HOUR=8;
		
		System.out.println("Welcome to Employee Wage Computation");
		
		/***
		 * Random class object use for employee is present or absent
		 */
		Random random=new Random();
		
		empAttendance=random.nextInt(2);
		if(empAttendance==1){
			System.out.println("Employee is Present");
			empWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
			System.out.println("Employee Wage="+empWage);
		}else{
			System.out.println("Employee is Absent");
		}
	}

}
