package com.a55;

public class StringCompareEx 
{
	public static void main(String[] args) 
	{
		String s1="sachin";
		String s2 ="SACHIN";
		String s3 =new String("sachin");
		String s4 ="sachin";
		String s5="satan";
		
		System.out.println(s1.equals(s2));//only check value
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1==s3);//Check value with initialization way
		
		System.out.println(s1.compareTo(s5));//Character wise ASCII value
		
		
	}
}
