package com.a315;

import javax.security.auth.Destroyable;

class A12 extends Thread
{
	public static int i=0;
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		//super.run();
	
		for(i=1;i<=10;i++)
		{
			try {
				
				System.out.println(i);
				Thread.sleep(2000);
				if(i==5)
				{
					stop();
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
}

public class Threadex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		A12 a =new A12();
		
		a.start();
		
		
		
	
		
		
		
	}
}
