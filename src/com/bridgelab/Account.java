package com.bridgelab;

public class Account {
	double balance;
	public Account(double BankBalance) {//setting intial amountThe code you posted is a constructor for the Account class in Java.

//When an instance of the Account class is created using this constructor, it takes a double parameter BankBalance which represents the initial balance of the account.

// constructor first checks if the balance (presumably a field in the Account class) is greater than or equal to zero.// If it is, then the BankBalance value is assigned to balance.
//So the purpose of this code is to set the initial balance of an Account object to a non-negative value passed as a parameter,
		// as long as the object is being initialized with a non-negative balance value.
		if(balance>=0.0) {
		balance=BankBalance;
		}
	}
	void credit(double creditAmount) {//adds credited amount to bankbalance
		balance+=creditAmount;
	}
	void debit(double debitAmount) {//here debit ammount in bank balance if exceeds insufficient balance
		if(debitAmount>balance) {
			System.out.println("debit amount exceeded acount balance");
		}else {
			balance-=debitAmount;//deducting amount from bank balance
		}
	}
	public double getBalance() {//printing bank balance
		return balance;
	}

}
