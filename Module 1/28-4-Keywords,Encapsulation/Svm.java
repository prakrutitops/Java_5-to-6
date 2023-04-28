package com.a284;

import javax.swing.text.ChangedCharSetException;

public class Svm 
{
	int id;
	String name;
	static String college="abcd";
	
	public Svm(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	static void change()
	{
		college="VVP";
	}
	public static void main(String[] args)
	{
		change();
		
		Svm s1 =new Svm(101, "a");
		Svm s2 =new Svm(102, "b");
		Svm s3 =new Svm(103, "c");
	
		s1.display();
		s2.display();
		s3.display();
		
	}
}
