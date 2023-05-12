package com.a105;

import java.io.IOException;

class M
{
	void m() throws IOException
	{
		System.out.println("M executed");
	}
}
class N extends M
{
	void n() throws IOException
	{
		System.out.println("N executed");
	}
}
class P extends N
{
	void p() throws IOException
	{
		System.out.println("P executed");
	}
}

public class ThrowsEx 
{
	public static void main(String[] args) throws IOException
	{
		P p1 =new P();
		p1.p();
		p1.m();
		p1.n();
	}
}
