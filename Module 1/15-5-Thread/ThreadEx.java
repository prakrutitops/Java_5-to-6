package com.a155;

public class ThreadEx 
{
	public static void main(String[] args) 
	{
		
		Thread t = Thread.currentThread();
		
		t.getName();
		System.out.println("Current Thread Name : -"+t);
		
		t.setName("ThreadEx");
		System.out.println("Current Thread Name : -"+t);
		
		t.setPriority(7);
		System.out.println("Current Thread Name : -"+t);
		
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" :-"+i);
			}
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
