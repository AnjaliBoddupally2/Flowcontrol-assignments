package com.batch.assignments;

import java.util.Scanner;

public class EmployeeEx {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter Employee id:");
		int id = scan.nextInt();
		System.out.println("enter Employee name:");
		String name = scan.next();
		System.out.println("enter Employee salary:");
		int salary = scan.nextInt();
		System.out.println("enter Employee address:");
		String address = scan.next();
		System.out.println("enter Employee contactno:");
		Long contactno = scan.nextLong();
		System.out.println("enter Employee gender:");
	    String gernder = scan.next();
		
   }

}
