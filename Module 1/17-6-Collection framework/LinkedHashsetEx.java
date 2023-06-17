package com.a136;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetEx 
{
	public static void main(String[] args) 
	{
		
		LinkedHashSet<String> set =new LinkedHashSet<>();
		
		set.add("android");
		set.add("java");
		set.add("php");
		set.add("flutter");
		
		//System.out.println(set);
		
		Iterator<String> i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
