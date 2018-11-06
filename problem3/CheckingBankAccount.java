package com.ualbany.hw1.problem3;

public class CheckingBankAccount {
	
	private double bankValue;
	
	public double getBankValue()
	{
		return bankValue;
	}
	
	public void setValue(double bankValue)
	{
		this.bankValue = bankValue;
	}
	
	public void withdraw (double amount)
	{
		this.bankValue = this.bankValue - amount;
	}
	
	public void deposit (double amount)
	{
		this.bankValue = this.bankValue - amount;
	}
}

