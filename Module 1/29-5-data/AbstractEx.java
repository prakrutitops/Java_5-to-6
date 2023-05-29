package com.a295;


abstract class My
{
	
	void getfun()
	{
		
		System.out.println(" Get Fun  method");

	}

	abstract void showfun();
	
}
class My2 extends My
{

	@Override
	void showfun() {
		// TODO Auto-generated method stub
		System.out.println("Show Fun Method");
	}
	
}


public class AbstractEx 
{
	public static void main(String[] args) {
		
		My2 m =new My2();
		
		m.getfun();
		m.showfun();
		
	}
	
	
}
