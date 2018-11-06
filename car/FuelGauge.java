package edu.albany.hw2.car;

public class FuelGauge {

	private int gal; //current
    public final static int max = 15; //fuel cap
   
    public FuelGauge()   //initialize
    {
        gal = 0; 
    }
 
    public int getGallons() //obtain amount of gallons
    {   
        return gal;
    }
    
    public void decrementGallons() //burning fuel
    {  
   
    	if (gal > 0) 
    	{
    		gal--;
    	}
    
    }
    	
    public void incrementGallons() //filling up tank
    { 
        if (gal < max)
            gal+= 1;
    }
    
   public static void main(String args[]) {  
	  
	FuelGauge fuelGauge = new FuelGauge();
	Odometer odometer = new Odometer(fuelGauge, 0);
	
	for(int i = 0; i < FuelGauge.max; i++)   
		
	{
		fuelGauge.incrementGallons();
	}
	
	
	  
	while (fuelGauge.getGallons() > 0) 
	{
		odometer.incrementMileage();
		System.out.println("You have: " + fuelGauge.getGallons() + " gallons.");
		System.out.println("You have: "+ odometer.getMileage() + " miles.");
		  
	}
	     
	
}
    
}
