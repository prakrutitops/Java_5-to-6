package com.a295;

enum enumex2 
{
	
	John(11), Bella(10), Sam(13), Viraaj(9);
	
	 int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	private enumex2(int age) {
		this.age= age;
	}
	
	
}
public class enumex
{
	public static void main(String[] args) {
		
		
		System.out.println(enumex2.Bella.age+" "+enumex2.Sam.age);
		
	}
}
