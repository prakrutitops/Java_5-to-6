package com.a136;

import java.util.ArrayList;
import java.util.Collections;

import com.a195.a;

class Student implements Comparable<Student>
{
	int sid;
	String sname;

	public Student(int id,String name)
	{
		// TODO Auto-generated constructor stub
		
		sid = id;
		sname = name;
	}
	
	@Override
	public int compareTo(Student o) 
	{
		// TODO Auto-generated method stub
		
		int value=0;
		
		
		if(this.sid > o.sid) 
		{
			return 1;
		}
		else if (this.sid < o.sid) 
		{
			return -1;
		} 
		else if(this.sid == o.sid) 
		{
			return 0;
		}
		
		return value;
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args) {
		
		
		Student s1 = new Student(15, "Parth");
		Student s2 = new Student(10, "Jay");
		Student s3 = new Student(1, "Dhaval");
		Student s4 = new Student(12, "RAhul");
		Student s5 = new Student(7, "Tapan");
		
		
		
		ArrayList<Student>arrayList = new ArrayList<>();
		
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		arrayList.add(s5);
		
		Collections.sort(arrayList);
		
		for(Student s : arrayList)
		{
			System.out.println(s.sid+" "+s.sname);
		}
		
	}
}
