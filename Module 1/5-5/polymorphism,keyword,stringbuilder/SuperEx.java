package com.a55;

class Color
{
	String color="black";
}
class Color2 extends Color
{
	String color="white";
	
	void display()
	{
		System.out.println(color);//current variable - from same class
		System.out.println(super.color);//parent variable from parent class
	}
}
public class SuperEx 
{
	public static void main(String[] args) 
	{
		Color2 c =new Color2();
		c.display();
	}
}
