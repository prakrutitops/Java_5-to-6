package com.a175;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordEx1 implements ActionListener 
{
	JFrame frame;
	JLabel l1;
	JPasswordField tf1;
	
	
	public PasswordEx1()
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame("Tops Technologies");
		
		l1 = new JLabel("Enter First Value");
		l1.setBounds(10, 30, 146, 14);
		
		
		
		tf1 =new JPasswordField();
		tf1.setBounds(134, 30, 130, 20);
		
		
		frame.add(l1);
		
		frame.add(tf1);
		
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new PasswordEx1();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		
		
	}
	
}
