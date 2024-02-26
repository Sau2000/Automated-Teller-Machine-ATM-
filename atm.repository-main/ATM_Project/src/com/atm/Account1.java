package com.atm;

import java.util.Scanner;

public class Account1 {
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	
	Scanner sc = new Scanner(System.in);
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	public double getChechingBalance() {
		return checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	public double calcSevingWithdeaw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + checkingBalance+" Rs.");
		System.out.println("Amount you want to withdraw from Checking Account: ");
		double amount = sc.nextDouble();
		
		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Balance: " + checkingBalance+" Rs.");
		}
		else {
			System.err.println("Balance can not be Negative !!!" + "\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + savingBalance+" Rs.");
		System.out.println("Amount you want to withdraw from Saving Account: ");
		double amount = sc.nextDouble();
		
		if ((savingBalance - amount) >= 0) {
			calcSevingWithdeaw(amount);
			System.out.println("New Saving Account Balance: " + savingBalance+" Rs.");
		}
		else {
			System.err.println("Balance can not be Negative !!!" + "\n");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + checkingBalance+" Rs.");
		System.out.println("Amount you want to Diposit from Checking Account: ");
		double amount = sc.nextDouble();
		
		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance: " + checkingBalance+" Rs.");
		}
		else {
			System.err.println("Balance can not be Negative !!!" + "\n");
		}
	}
	
	public void getSavingDipositInput() {
		System.out.println("Checking Saving Account Balance: " + savingBalance+" Rs.");
		System.out.println("Amount you want to Diposit from Saving Account: ");
		double amount = sc.nextDouble();
		
		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Cheking Account Balance: " + savingBalance+" Rs.");
		}
		else {
			System.err.println("Balance can not be Negative !!!" + "\n");
		}
	}
}
