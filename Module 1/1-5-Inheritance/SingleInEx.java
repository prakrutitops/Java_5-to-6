package com.a15;

class ACRemote
{
	
	void ac()
	{
		System.out.println("Ac Accesssed");
	}
}
class Mobile extends ACRemote
{
	
	void mob()
	{
		System.out.println("Mobile Accessed");
	}
}

public class SingleInEx 
{
	public static void main(String[] args) {
		
		Mobile m1 =new Mobile();
		m1.ac();
		m1.mob();
		
	}
}
