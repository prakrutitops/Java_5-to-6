package com.a55;

public class Moex 
{
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static int add(int a,int b,int c)
	{
		return a*b*c;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(add(5, 6, 7));
		System.out.println(add(2, 3, 4));
	}
}
