package com.dgama.bankaccount.models;

import java.util.Random;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private static int totalAccounts=0;
	private static double totalFunds;

	private String accountNumber;

// CONSTRUCTORS
	public BankAccount(){
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		totalAccounts++;
		this.accountNumber = generateAccountNumber();
	}
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		this.accountNumber = generateAccountNumber();
	}
//	MAIN METHODS
	public void checkingDeposit(double amount){
		this.checkingBalance += amount;
		totalFunds += amount;
	}
	public void checkingWithdraw(double amount){
		this.checkingBalance -= amount;
		totalFunds -= amount;
	}

	public void savingsDeposit(double amount){
		this.savingsBalance += amount;
		totalFunds += amount;
	}
	public void savingsWithdraw(double amount){
		this.savingsBalance -= amount;
		totalFunds -= amount;
	}

	private static String generateAccountNumber(){
		Random rand = new Random();
		long upperbound = 1000000000;
		long randomAcctNumber = 1L + (long) (Math.random() * (1000000000L- 1L));
		String acctNumber = String.valueOf( randomAcctNumber);

		if(acctNumber.length() != 10){
			for(int i=acctNumber.length(); i<10; i++){
				acctNumber = "0"+ acctNumber;

			}
		}
		System.out.printf("Account Number: %s\n", acctNumber);
		return acctNumber;
	}

	public void displayAccountDetails(){
		System.out.printf("Checking: %f\n", this.checkingBalance);
		System.out.printf("Savings: %f\n", this.savingsBalance);
	}

//	GET/SET METHODS

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
}
