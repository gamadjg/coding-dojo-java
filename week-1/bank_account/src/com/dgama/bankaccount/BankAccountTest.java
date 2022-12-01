package com.dgama.bankaccount;

import com.dgama.bankaccount.models.BankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		account1.displayAccountDetails();
		BankAccount account2 = new BankAccount(300, 500);
		account2.displayAccountDetails();
	}

}