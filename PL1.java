package com.a55;

import java.util.Scanner;

public class PL1 
{
	
	public static void main(String[] args) {
		
		int num;

		

		System.out.println("Enter the number to check of Palindrome : ");
		Scanner sc =new Scanner(System.in);
		num = sc.nextInt();


		if (num == reverse(num,0))
		{
			System.out.println("\nEnter Number is Palindrome");
			
		}
			
		else
		{
			System.out.println("\nEnter Number is NOT Palindrome");
		}
			
		
	}

	private static int reverse(int num, int i) 
	{
		int ld;	
		if (num <=0)
		{
			System.out.println("\nFinal RNUM Value is "+i);
			return i;
		}
		else
		{
			ld=num%10;
			i=(i*10)+ld;
			System.out.println("\nRNUM= "+i +"LD "+ld);
			return reverse(num/10,i);
		}
		
	}
}
