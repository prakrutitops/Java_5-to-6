package com.a105;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			String s="Welcome to tops";
			FileOutputStream fout = new FileOutputStream("E://akshit.txt");
			fout.write(s.getBytes());
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("Success");
	}
}
