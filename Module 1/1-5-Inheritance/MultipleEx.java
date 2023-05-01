package com.a15;

interface M
{
	void m();
}
interface N
{
	void n();
}
class P implements M,N
{

	@Override
	public void n() 
	{
		// TODO Auto-generated method stub
		System.out.println("N executed");
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("M executed");
	}
	
}

public class MultipleEx 
{
	public static void main(String[] args) {
		
		P p =new P();
		
		p.m();
		p.n();
		
		
	}
}
