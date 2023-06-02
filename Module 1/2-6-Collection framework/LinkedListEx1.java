package com.a26;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 
{
	public static void main(String[] args) 
	{
		
		LinkedList<String>list =new LinkedList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.addFirst("E");
		list.addLast("F");
		
		
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	} 
	
}
