package com.a105;

public class Exception1 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Start");
		
		try
		{
			int data = 10/5;
			System.out.println(data);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Program End");
		}
		
		
	}
}
