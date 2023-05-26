package com.a265;

public class GCex 
{
	@Override
	protected void finalize() throws Throwable 
	{
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println("Garbage collection called");
		
	}
	public static void main(String[] args) {
		
		
	
		GCex g1 =new GCex();
		GCex g2 =new GCex();
		GCex g3 =new GCex();
		GCex g4 =new GCex();
		GCex g5 =new GCex();
		
		g4 =null;
		g5=null;
		 
		System.gc();
		
	}
	
}
