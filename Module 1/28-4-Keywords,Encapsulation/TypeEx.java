package com.a284;

public class TypeEx 
{
	public static void main(String[] args) {
		
		/*
		 * int a=50; Integer b =new Integer(60);
		 */
		
		String a="50";
		String b="60";
		// int - datatype , Integer-wrapper class
		int c=Integer.parseInt(a)+Integer.parseInt(b);
		
		System.out.println(c);
		
		
	}
}
