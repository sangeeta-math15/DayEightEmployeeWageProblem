package com.bridgelabz.dayeight;

/**
 * Employee Wage Computation Problem
 * 
 * @author CHANDRU
 *
 */
public class EmployeeWageProblem {
	// Driver Code
	public static void main(String args[]) {

		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		// use random function gives value 0 or 1
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		// print random values
		System.out.println("Random values=>" + empCheck);
		if (empCheck == 1) {
			System.out.println("Employee Present");
		} else {
			System.out.println("Employee Absent");
		}

	}
}
