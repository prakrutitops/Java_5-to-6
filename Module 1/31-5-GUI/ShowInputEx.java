package com.a315;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowInputEx 
{
	JFrame frame = new JFrame();
	
	public ShowInputEx() 
	{
		frame =new JFrame();
		String name=JOptionPane.showInputDialog(frame,"Enter Name");      
		
	}
	
	public static void main(String[] args) {
		
		new ShowInputEx();
		
	}
}
