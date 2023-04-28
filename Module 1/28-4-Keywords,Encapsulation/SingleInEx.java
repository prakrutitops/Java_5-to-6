package com.a284;

class ACRemote
{
	int temp;
	void ac()
	{
		temp=24;
		System.out.println(temp);
	}
}
class Mobile extends ACRemote
{
	int pin;
	void mob()
	{
		pin=1234;
		System.out.println(pin);
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
