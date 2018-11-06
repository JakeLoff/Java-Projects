package com.ualbany.hw1.problem3;

public class Person {

	private String first;
	private String last;
	private Address address1;
	
	public Person (String firstName, String lastName, Address address)
	{
		this.first = firstName;
		this.last = lastName;
		this.address1 = address;
	}
	
	public String getFirst() 
	{
		return this.first;
	}
	
	public void setFirst(String firstName)
	{
		this.first = firstName;
	}
	
	public String getLast()
	{
		return this.last;
	}
	
	public void setLast(String lastName)
	{
		this.last = lastName;
	}
	
	public Address getAddress1()
	{
		return address1;
	}
	
	public void setAddress1(Address address1)
	{
		this.address1 = address1;
	}
	
	public String getPersonsName() 
	{
		return (this.first + " " + this.last);
	}
}
