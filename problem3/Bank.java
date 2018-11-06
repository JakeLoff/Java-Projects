package com.ualbany.hw1.problem3;

public class Bank {


	private String bankName;
	private Address bankAddress;


	public Bank(String name, Address address)
	{
		this.bankName = name;
		this.bankAddress = address;
	}
	
	public String getBankName()
	{
		return bankName;
	}
	
	public void setBankName(String bankName)
	{
		this.bankName = bankName;
	}
	
	public Address getBankAddress()
	{
		return bankAddress;
	}
	
	public void setBankAddress(Address bankAddress)
	{
		this.bankAddress = bankAddress;
	}
	
	public static void main(String[] args)
	{
		Address userAddress = new Address ("432 Hudson Avenue", "3rd Floor",  //both address objects
				"Albany", "NY", "12203");
		Address bankAddress = new Address ("1225 Central Avenue", "1st Floor", "Albany", 
				"NY", "12203");
		
		Bank TDBank = new Bank ("TD Bank", bankAddress);
		Person Jake = new Person ("Jake", "Loff", userAddress);
		
		System.out.println (Jake.getPersonsName() + " visits " + TDBank.getBankName()
		+ " and opens a new account."); //Simulating opening of acccount
		
		CheckingBankAccount JakesAccount = new CheckingBankAccount ();
		deposit (Jake, JakesAccount, 1000);
		withdraw (Jake, JakesAccount, 500);
	}
	
	public static void deposit (Person name, CheckingBankAccount account, int amount)
	{
				account.deposit(amount);
				System.out.println("Receipt for: " + name.getPersonsName() + " "
						+ name.getAddress1().getAddress());
				System.out.println("Balance: " + account.getBankValue());
	
	}
	
	public static void withdraw (Person name, CheckingBankAccount account, int amount)
	{
				account.withdraw(amount);
				System.out.println("Receipt for: " + name.getPersonsName() + " "
						+ name.getAddress1().getAddress());
				System.out.println("Balance: " + account.getBankValue());
	
	}
}
	



