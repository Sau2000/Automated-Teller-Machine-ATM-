package com.atm;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Manu1 extends Account1{
	Scanner sc = new Scanner(System.in);
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x= 1;
		do {
			try {
			data.put(876655, 996040);
			data.put(123789, 159963);
			
			System.out.println("Welcome to the ATM Project");
			System.out.println("Enter your customer Number");
			setCustomerNumber(sc.nextInt());
			
			System.out.print("Enter you Pin :");
			setPinNumber(sc.nextInt());
			}
			catch(Exception e) {
				System.err.println("\n" + "Invalid Charectere(s). Only Number "+"\n");
				x=2;
			}
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			 
			if (data.containsKey(cn) && data.get(cn)==pn) {
				getAccountType();
			}
			else {
				System.err.println("\n" + "Worng Customer Number or Pin Number" + "\n");
			}
		}while(x==1);
	}
	
	public void getAccountType() {
		System.out.println("Select the Account you want to Access: ");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you for Using this ATM, Ok byee." + "\n");
			break;

		default:
			System.err.println("\n" + "Invalid Choice !!!" + "\n");
			break;
		}
	}
	public void getChecking() {
		System.out.println("Checking Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Fund");
		System.out.println("Type 3 - Diposit Fund");
		System.out.println("Type 4 - Exit");
		
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("Checking Account Balance: " + getChechingBalance()+" Rs.");
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for Using this ATM, ok byee.");
			break;
			
		default:
			System.err.println("\n" + "Invalid Choice !!!" + "\n");
			break;
		}
	}
	public void getSaving() {
		System.out.println("Saving Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Fund");
		System.out.println("Type 3 - Diposit Fund");
		System.out.println("Type 4 - Exit");
		
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("Checking Account Balance: " + getSavingBalance() +" Rs.");
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDipositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for Using this ATM, ok byee.");
			break;
			
		default:
			System.err.println("\n" + "Invalid Choice !!!" + "\n");
			break;
		}
	}
}
