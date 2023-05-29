package com.a295;

import java.io.File;
import java.io.IOException;

public class FileEx 
{
	public static void main(String[] args) throws IOException {
		
		FileEx fcd = new FileEx();
		
		File file = new File("E://MyFile.txt");
		file.createNewFile();
		
		fcd.getFileDetails(file);
		
	}

	private void getFileDetails(File file) 
	{
		// TODO Auto-generated method stub
	
		System.out.println(file.exists());;
		System.out.println(file.isDirectory());;
		//System.out.println(file.lastModified());;
		System.out.println(file.getName());;
		System.out.println(file.getAbsolutePath());;
		System.out.println(file.getPath());;
		System.out.println(file.canExecute());;
		System.out.println(file.canRead());;
	}
}
