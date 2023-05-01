package com.a15;

class GrandFather
{
	void gfather()
	{
		System.out.println("Grandfather Accessed");
	}
}
class Father extends GrandFather
{
	void father()
	{
		System.out.println("father Accessed");
	}
}
class Son extends Father
{
	void son()
	{
		System.out.println("son Accessed");
	}
}


public class MultilevelEx 
{
	
	public static void main(String[] args) 
	{
		
		
		Son s = new Son();
		
		s.gfather();
		s.father();
		s.son();
		
		
	}
	
}
