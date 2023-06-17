package com.a136;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx 
{
	public static void main(String[] args) 
	{
		
		HashSet<String> set =new HashSet<>();
		
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
