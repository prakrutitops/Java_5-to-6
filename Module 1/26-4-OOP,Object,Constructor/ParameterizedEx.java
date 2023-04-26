package com.a264;

public class ParameterizedEx 
{
	int id;
	String name;
	
	public ParameterizedEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		id=id;
		name=name;
		
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		
		ParameterizedEx p1 =new ParameterizedEx(101, "a");
		
		p1.display();
	}
}
