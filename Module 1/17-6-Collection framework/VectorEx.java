package com.a136;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) {
		
		
		Vector v = new Vector<>(5);
		
		v.add("android");
		v.add("java");
		v.add("php");
		v.add("python");
		v.add("ios");
		v.add("ios");
		v.add("php");
		v.add("python");
		v.add("ios");
		v.add("ios");
		v.add("ios");
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		if(v.contains("PHP"))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
	}
}
