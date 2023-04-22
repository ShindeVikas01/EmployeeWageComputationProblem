package com.infinity.empwagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		/**
		 * empAttendance use for employee is present or absent
		 * empWage use to calculate daily employee wage
		 * empType use for employee is part time or full time
		 * WAGE_PER_HOUR use for per hour wage
		 * FULL_DAY_HOUR use for full time hours 
		 * PART_TIME_HOUR use for part time hours
		 */
		int empAttendance;
		int empWage=0;
		int empType;
		final int IS_PRESENT=1;
		final int WAGE_PER_HOUR=20;
		final int FULL_TIME_HOUR=8;
		final int PART_TIME_HOUR=4;
		final int IS_FULL_TIME=1;
		
		System.out.println("Welcome to Employee Wage Computation");
		
		/***
		 * Random class object use for employee is present or absent
		 */
		Random random=new Random();
		
		empAttendance=random.nextInt(2);
		/**
		 * if else loop use for employee attendance
		 */
		if(empAttendance==IS_PRESENT){
			System.out.println("Employee is Present");
			empType=random.nextInt(2);
			if(empType==IS_FULL_TIME){
				System.out.println("Emplyee is Full time");
				empWage=WAGE_PER_HOUR*FULL_TIME_HOUR;
				System.out.println("Employee Wage="+empWage);
			}else{
				System.out.println("Employee is Part time");
				empWage=WAGE_PER_HOUR*PART_TIME_HOUR;
				System.out.println("Employee Wage="+empWage);
			}
		}else{
			System.out.println("Employee is Absent");
		}
		
	}

}
