package com.a136;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	
	public static void main(String[] args) 
	{
		HashMap<String,String> map =new HashMap<>();
		
		map.put("A","1");
		map.put("B","2");
		map.put("C","3");
		
		
		//System.out.println(map.get(map));
		//System.out.println(map.get("A"));
		
		for(Map.Entry<String, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+" = "+m.getValue());
		}
		
		
	}
}
