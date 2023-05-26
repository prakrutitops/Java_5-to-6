package com.a265;

import java.util.Scanner;

public class UserInputArrayEx
{
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		int arr[] =new int[5];
		int total =0;
		double per;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Value for Marks :"+i);
			arr[i] = sc.nextInt();
			total+=arr[i];
		}
		
		
		
		System.out.println("total is: "+total);
		per = total/5;
		
		System.out.println("Percentage is "+per);
		
		
		
		//print
		/*
		 * for(int i=0;i<5;i++) { System.out.println(arr[i]); }
		 */
		
		
	}
	
}
