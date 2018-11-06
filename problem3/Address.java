package com.ualbany.hw1.problem3;

public class Address {

	private String line1;
	private String line2;
	private String City;
	private String State;
	private String Zip;
	
	public Address (String line1, String line2, String city, String state, String zip)
	{
		this.line1 = line1;
		this.line2 = line2;
		this.City = city;
		this.State = state;
		this.Zip = zip;
	}
	
	public String getAddress()
	{
		return (this.line1 + ", " + this.line2 + ", " + this.City +
				", " + this.State + ", " + this.Zip);
	}
	
	public String getLine1()
	{
		return line1;
	}
	
	public void setLine1 (String line1)
	{
		this.line1 = line1;
	}
	
	public String getLine2()
	{
		return line2;
	}
	
	public void setLine2 (String line2)
	{
		this.line2 = line2;
	}
	
	public String getCity()
	{
		return City;
	}
	
	public void setCity (String city)
	{
		this.City = city;
	}
	
	public String getState()
	{
		return State;
	}
	
	public void setState (String state)
	{
		this.State = state;
	}
	public String getZip()
	{
		return Zip;
	}
	
	public void setZip (String zip)
	{
		Zip = zip;
	}
}
