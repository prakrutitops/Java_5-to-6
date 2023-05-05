package com.a55;

public class StringEx1 
{
	public static void main(String[] args) {
		
		String s1="sachin"; //literal String
		
		String s2=new String("sachin");//new keyword string
		
		char ch[]= {'s','a','c','h','i','n'};//character array string
		String s3 =new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
