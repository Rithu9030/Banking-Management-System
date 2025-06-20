package com.practice;
class BankAccount{
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	
	BankAccount(String name,String number,double bal){
		this.accountHolderName=name;
		this.accountNumber=number;
		this.balance=bal;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		if(accountHolderName !=null && accountHolderName.trim().isEmpty())
		this.accountHolderName = accountHolderName;
		else {
			System.out.println("invalid name");
		}
		
		
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("successfully deposited : "+ amount);
		}
			else {
			    System.out.println("invalid deposit amount");
			}
	}
		
		public void withdraw(double amount) {
			if(amount>0 && amount<=balance) {
				balance -= amount;
				System.out.println("successfully withdrawed : "+ amount);
			}
			else {
			    System.out.println("invalid withdraw amount");
			}
		}
			
		public void showAccountDetails() {
		System.out.println("Account number : "+accountNumber);	
			System.out.println("Account holder : "+accountHolderName);
			System.out.println("current balance : "+balance);
		}
		
   
	   
   }
		
		
	
	



