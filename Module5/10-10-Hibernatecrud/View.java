package com.controller;

import java.util.List;

import com.dao.MyDao;
import com.model.Person;

public class View 
{
	public static void main(String[] args) {
		
		List<Person>list = new MyDao().viewdata();
		
		System.out.println("ID"+" "+"NAME"+" "+"SURNAME");
		
		for(Person p : list)
		{
			System.out.println(p.getId()+" "+p.getName()+" "+p.getPassword());
		}
		
		
		
	}
}
