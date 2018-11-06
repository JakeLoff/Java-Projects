package com.ualbany.hw1.problem2;
import java.util.Random;

public class HW1Problem2 {
	//multiple method to test if there is an even division between two ints
	public static Boolean multiple(int one, int two)
	{
		if (one%two == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//remainder method
	public static double remainder (int number)
	{
		return (number % 7);
	}
	
	//distance method to calculate distance between 2 points
	public static double distance (double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	}
	
	//Bonus coin flip
	public static void coinFlip()
	{
		Random flip = new Random();
		for (int i = 0; i<10; i++)
		{
			int coinFlip = flip.nextInt(100);
			if (coinFlip <= 50)
			{
				System.out.println ("Heads");
			}
			else
			{
				System.out.println ("Tails");
			}
		}
	}
}
