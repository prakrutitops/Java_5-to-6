package com.a105;

public class SleepEx 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			try 
			{
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i);
			
		}
		
	}
}
