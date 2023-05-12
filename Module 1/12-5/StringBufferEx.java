package com.a105;

public class StringBufferEx 
{
	public static void main(String[] args) 
	{
		
		StringBuffer sf = new StringBuffer("Hello");
		sf.append(" Java");
		System.out.println(sf);
		
		System.out.println("--------INSERT-----------");
		StringBuffer sf2 = new StringBuffer("Hello");
		sf2.insert(1, "Java");
		System.out.println(sf2);
		
		System.out.println("--------DELETE-----------");
		StringBuffer sf3 = new StringBuffer("Hello");
		sf3.delete(1, 3);
		System.out.println(sf3);
		
		System.out.println("--------Replace-----------");
		StringBuffer sf4 = new StringBuffer("Hello");
		sf4.replace(1, 3, "Java");
		System.out.println(sf4);
		
		System.out.println("--------Reverse-----------");
		StringBuffer sf5 = new StringBuffer("Hello");
		sf5.reverse();
		System.out.println(sf5);
		
		
		
	}
}
