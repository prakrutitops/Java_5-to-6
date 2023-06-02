package com.a26;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		arrayList.add(4, "r");
		
		ArrayList<String>arraylist2 = new ArrayList<String>();
		
		arraylist2.add("1");
		arraylist2.add("2");
		arraylist2.add("3");
		arraylist2.add("4");
		arraylist2.add("5");
		arraylist2.add("d");
		
		arrayList.retainAll(arraylist2);
		
		
		/*
		 * arrayList.addAll(arraylist2); arrayList.remove(1); arrayList.remove("c");
		 * arrayList.removeAll(arraylist2);
		 */
		
		
		//System.out.println(arrayList);
		//System.out.println(arraylist2);
		
		Iterator i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
