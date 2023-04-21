package com.infinity.empwagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		
		/***
		 * Random class object use for employee is present or absent
		 */
		Random random=new Random();
		
		int empStatus=random.nextInt(2);
		if(empStatus==1){
			System.out.println("Employee is Present");
		}else{
			System.out.println("Employee is Absent");
		}
	}

}
