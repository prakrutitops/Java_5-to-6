package com.a284;

public class CopyConstructorEx 
{
	int id;
	String name;
	
	 CopyConstructorEx(CopyConstructorEx c) 
	{
		// TODO Auto-generated constructor stub\
		 
		 System.out.println(c.id+" "+c.name);
	}
	 
	 CopyConstructorEx(int id,String name) 
	{
			this.id=id;
			this.name=name;
	}
	 
	
	public static void main(String[] args) 
	{
		CopyConstructorEx c1 =new CopyConstructorEx(101, "a");
		CopyConstructorEx c2 =new CopyConstructorEx(c1);
	}
	
}
