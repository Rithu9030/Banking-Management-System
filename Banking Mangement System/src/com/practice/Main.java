package com.practice;

public class Main {
public static void main(String[] args) {
	BankAccount b =  new BankAccount("rithika","SB-1055", 1000.0);
	b.showAccountDetails();
	b.deposit(500);
	b.withdraw(300);
System.out.println("final balance : "+b.getBalance());
	
}
}