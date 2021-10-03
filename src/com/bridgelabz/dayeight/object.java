package com.bridgelabz.dayeight;

class Employee {
	// declaration of variables
	int empCheck, empHr, empWage, totalEmpWage, totalWorkingDays, totalEmpHrs;
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	void CalculateWage() {
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("" + empCheck);

		totalWorkingDays++;

		switch (empCheck) {
		case 1:
			empHr = 8;
			System.out.print("full time");
			break;
		case 2:
			empHr = 4;
			System.out.print("part time");
			break;
		case 0:
			empHr = 0;
			System.out.println("absent");
			break;

		default:
			empHr = 0;
			break;
		}
		empWage = empHr * EMP_RATE_PER_HOUR;
		totalEmpWage = totalEmpWage + empWage;
		System.out.println("days" + totalWorkingDays + "emphrs" + empHr);
		System.out.println("wage" + totalEmpWage);
	}

}

public class object {

	public static void main(String[] args) {
		Employee emp = new Employee();

		for (int i = 0; i < 20; i++) {
			emp.CalculateWage();
		}

	}

}
