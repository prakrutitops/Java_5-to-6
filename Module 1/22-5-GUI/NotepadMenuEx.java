package com.a225;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class NotepadMenuEx 
{
	JFrame frame;
	JMenuBar mb;
	JMenu file,edit,help;
	JMenuItem i1,i2,i3,i4,i5;
	
	
	public NotepadMenuEx() 
	{
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		
		mb =new JMenuBar();
		
		file =new JMenu("File");
		edit =new JMenu("Edit");
		help =new JMenu("Help");
		
		i1 =new JMenuItem("Cut");
		i2 =new JMenuItem("Copy");
		i3 =new JMenuItem("Paste");
		i4 =new JMenuItem("Select All");
		
		
		
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		
		
		edit.add(i1);
		edit.add(i2);
		edit.add(i3);
		edit.add(i4);
		
		
		frame.setJMenuBar(mb);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	public static void main(String[] args) 
	{
		new NotepadMenuEx();
	}
}
