package com.bridgelabz.stockaccount.controller;

import java.util.Scanner;

import com.bridgelabz.stockaccount.service.StockAccountMethod;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a Program Manage Stock Account
 */

public class StockAccountMain {

	static StockAccountMethod method = new StockAccountMethod();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	method.readCompJsonFile();
	
	int choice1;
	do {
		System.out.println("Enter Customer Details...");
		System.out.println("Press 1 to Add Customer Details\nPress 2 to Save Details");
		choice1 = scanner.nextInt();
		
		switch (choice1) {
		case 1:
			method.addCustomer();
			break;
			
		case 2:
			method.saveCustomer();
			break;

		default:
			System.out.println("Invalid Choice.. Please Enter valid choice");
			break;
		}
		
	} while (choice1 !=3);
	}
}

