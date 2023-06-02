package com.a26;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 
{
	
		public static void main(String[] args) 
		{
			
			HashSet<String> set =new HashSet<>();
			
			set.add("vijay");
			set.add("ajay");
			set.add("vishal");
			set.add("punit");
			set.add("akshit");
			set.add("hitexa");
			set.add("prakruti");
			set.add("akshit");
			
			Iterator i = set.iterator();
			
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
		}
}


