package com.a295;

import java.util.Scanner;

public class BankDemo 
{
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Amount");
		int data = sc.nextInt();
		BankDemo d = new BankDemo();
		CheckingAccount ca = new CheckingAccount(101);
		ca.deposite(20000);
		
		try
		{
			ca.withdral(data);
			System.out.println("Your balance is = "+ca.getBalance());
		}
		catch(InsufficintFundException e)
		{
			System.out.println(e);
			System.out.println("You have no sufficient balance, You need more  "+e.getAmount());
			System.out.println("Your balance is = "+ca.getBalance());
		}

		
		
		
		
	}
	
}
