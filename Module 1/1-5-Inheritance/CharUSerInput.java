package com.a15;

import java.util.Scanner;

public class CharUSerInput 
{
	
	
	public static void main(String[] args) 
	{
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single character : ");
		String input = sc.next();
		boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") ||
				input.equals("o") || input.equals("u");
		
		boolean lowercase=input.charAt(0)>=97 && input.charAt(0) <= 122; 
		boolean uppercase=input.charAt(0)>=65 && input.charAt(0) <= 90; 	
		
		
		if(input.length() >1)
		{
			System.out.println("Error. not a single charactor.");
		}
		else if(!(uppercase || lowercase))
		{
			System.out.println("Error.not a letter. Enter uppercase or lowercase letter.");
		}
		else if(vowels)
		{
			System.out.println("Input letter is vowel");
		}
		else
		{
			System.out.println("Inpter letter is constant");
		}
		
		
		
		
		
		
		
		
	}
	
}
