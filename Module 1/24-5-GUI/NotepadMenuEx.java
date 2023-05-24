package com.a245;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class NotepadMenuEx extends WindowAdapter implements ActionListener
{
	JFrame frame;
	JMenuBar mb;
	JMenu file,edit,help;
	JMenuItem i1,i2,i3,i4,i5;
	JTextArea textarea;
	
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
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		
		textarea =new JTextArea();
		textarea.setBounds(50, 43, 400, 200);
		
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		
		
		edit.add(i1);
		edit.add(i2);
		edit.add(i3);
		edit.add(i4);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(this);
		frame.add(textarea);
		frame.setJMenuBar(mb);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	public static void main(String[] args) 
	{
		new NotepadMenuEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		//cut
		if(e.getSource()==i1)
		{
			textarea.cut();
		}
		//copy
		if(e.getSource()==i2)
		{
			textarea.copy();
		}
		//paste
		if(e.getSource()==i3)
		{
			textarea.paste();
		}
		//selectall
		if(e.getSource()==i4)
		{
			textarea.selectAll();
		}
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		//super.windowClosing(e);
		
		int ans = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
	
		if(ans==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(ans==JOptionPane.NO_OPTION)
		{
			
		}
		if(ans==JOptionPane.CANCEL_OPTION)
		{
			
		}
		
	}
}
