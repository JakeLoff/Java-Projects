package edu.albany.hw2.morse;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

	public class morse{
		
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in); //scanner to accept user string
			
		Map<Character, String> map = new HashMap<>(); //hashmap
			
		map.put(' ', " "); map.put(',', "--..--"); map.put('.', ".-.-.-");
		map.put('?', "..--.."); map.put('a', ".-"); map.put('b', "-...");
		map.put('c', "-.-."); map.put('d', "-.."); map.put ('e', ".");
		map.put('f', "..-."); map.put('g', "--."); map.put ('h', "....");
		map.put('i', ".."); map.put('j', ".---"); map.put('k', "-.-");
		map.put('l', ".-.."); map.put('m', "--"); map.put ('n', "-.");
		map.put('o', "---"); map.put('p', ".--."); map.put('q', "--.-");
		map.put('r', ".-."); map.put('s', "..."); map.put('t', "-");
		map.put('u', "..-"); map.put('v', "...-"); map.put ('w', ".--"); 
		map.put ('x', "-..-"); map.put ('y', "-.--"); map.put ('z', "--..");
					
		System.out.println("Enter a string: ");   
		String next = input.nextLine();     //stores user input string
		
		for (char x:next.toCharArray()) 
		{
			System.out.print(" " + map.get(x));
			input.close();
		}
	}
}

