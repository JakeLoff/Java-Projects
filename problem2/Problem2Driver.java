package com.ualbany.hw1.problem2;
import java.util.Scanner;

public class Problem2Driver {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); //allows users to use the multiple method
		
		System.out.println ("Enter two numbers: ");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		
		if (HW1Problem2.multiple(num1, num2) == true)
		{
			System.out.println(num2 + " is a multiple of " + num1);
		}
		else
		{
			System.out.println("These numbers are not multiples");
		}
		
		System.out.println("Enter a number that will be divided by 7: "); //allows users to use remainder method
		int remainderNum = keyboard.nextInt();
		System.out.println("The remainder is: " + HW1Problem2.remainder(remainderNum));
	
		
		//allows user to use distance method to find distance between two coordinates
		System.out.println("Enter the first set of coordinates: ");
		int x1 = keyboard.nextInt();
		int y1 = keyboard.nextInt();
		System.out.println("Enter the second set of coordinates: ");
		int x2 = keyboard.nextInt();
		int y2 = keyboard.nextInt();
		System.out.println("The distance between the coordinates is: " + HW1Problem2.distance(x1, y1, x2, y2));
		
		
		
		System.out.println ("Heads or Tails? ");
		HW1Problem2.coinFlip();
		
		keyboard.close();
	}
	
	
}
