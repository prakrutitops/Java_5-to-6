package com.a194;

import java.util.Scanner;

public class MyScannerEx 
{
	public static void main(String[] args) 
	{
		
		//object 
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Id");//printf
		int id = sc.nextInt();//scanf
				
		System.out.println("Enter Your Name");
		String name= sc.next();
				
		System.out.println("Enter Your Number");
		double num = sc.nextDouble();
		
		System.out.println(id+" "+name+" "+num);
				
		
	}
}
