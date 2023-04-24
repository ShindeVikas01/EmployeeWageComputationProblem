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
		 * totalWage use for to calculate total wage
		 * IS_PART_TIME use for employee is part time present
		 * IS_FULL_TIME use for employee is full time present
		 */
		int empAttendance;
		int empWage=0;
		int totalWage=0;
		int empType;
		final int IS_PRESENT=1;
		final int WAGE_PER_HOUR=20;
		final int FULL_TIME_HOUR=8;
		final int PART_TIME_HOUR=4;
		final int IS_PART_TIME=0;
		final int IS_FULL_TIME=1;
		
		System.out.println("Welcome to Employee Wage Computation");
		
		Random random=new Random();
		/***
		 * 1.Random class object use for employee is present or absent
		 * 2.for is use for to calculate employee total wage for 20 days
		 */
		for(int i=1;i<=20;i++){
			System.out.println("###### DAY"+i+ "######");
			empWage=0;
			empAttendance=random.nextInt(2);
			/**
			 * 1.if else loop use for employee attendance
			 * 2.switch case use for to calculate Full time and 
			 * Part time employee wage calculation
			 */
			if(empAttendance==IS_PRESENT){
				System.out.println("Employee is Present");
				empType=random.nextInt(2);
				switch(empType){
				case IS_PART_TIME:
					System.out.println("Employee is Part time");
					empWage=WAGE_PER_HOUR*PART_TIME_HOUR;
					break;
					
				case IS_FULL_TIME:
					System.out.println("Employee is Full time");
					empWage=WAGE_PER_HOUR*FULL_TIME_HOUR;
					break;
				}
				System.out.println("Employee Wage="+empWage);
			}else{
				System.out.println("Employee is Absent");
				System.out.println("Employee Wage="+empWage);
			} 
			totalWage=totalWage+empWage;
		}
		System.out.println("--------------------------");
		System.out.println("Employee Total Wages="+totalWage);
		
	}

}
