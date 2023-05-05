package com.a55;

class MyBank
{
	int rate()
	{
		return 0;
	}
}
class Sbi extends MyBank
{
	int rate()
	{
		return 7;
	}
}
class Icici extends MyBank
{
	int rate()
	{
		return 8;
	}
}
class Axis extends MyBank
{
	int rate()
	{
		return 9;
	}
}

public class OverridingEx 
{
	public static void main(String[] args) 
	{
		MyBank b;
		
		b =new Sbi();
		System.out.println(b.rate());
		
		b =new Icici();
		System.out.println(b.rate());
		
		b =new Axis();
		System.out.println(b.rate());
		
	}
}
