package com.bridgelab;

public class AccountMain {

	public static void main(String[] args) {
		Account acc=new Account(1000.0);
		
		System.out.println("initial balance "+acc.getBalance());
		acc.credit(500.0);
		System.out.println("after credit "+acc.getBalance());
		acc.debit(100.0);
		System.out.println("after debit "+acc.getBalance());
		acc.debit(2000.0);
		System.out.println("Insuffiecient balance "+acc.getBalance());
	}

}
