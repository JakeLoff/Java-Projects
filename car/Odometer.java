package edu.albany.hw2.car;

public class Odometer {
	  
	    private final int max = 999999; //mile cap
	    private final int fuelEconomy = 22; //miles per gallon
	    private int current; //current miles 
	    private int lastDec; //miles since fuel was decremented
	    private FuelGauge fuelGauge; //Fuel Gauge object ref
	    private int  miles;
	    
	    public Odometer(FuelGauge fg, int miles)
	    {
	        fuelGauge = fg;  //fuel gauge ref
	        current = miles; //current miles ref
	   
	    }
	   
	    public int getMileage()  //gets the current miles
	    {
	        return current;
	    }
	   
	    public void incrementMileage() //if becomes greater than max number, resets to 0
	    { 
	    	
	    	if (current > max) 
	    	{
	    		current = 0;
	    	}
	    	else 
	    	{
	    		current++;
	    	}
	    
	    	int  miles = lastDec - current;   //change
	   
	    if (miles % fuelEconomy == 0) 
	    {
	    		fuelGauge.decrementGallons();
	    	}
	    	
	}    	
	  
	   
}
