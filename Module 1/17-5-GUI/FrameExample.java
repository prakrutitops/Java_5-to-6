package com.a175;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameExample implements ActionListener 
{
	JFrame frame;
	JLabel l1,l2;
	JTextField tf1,tf2,tf3;
	JButton btn1,btn2;
	
	public FrameExample()
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame("Tops Technologies");
		
		l1 = new JLabel("Enter First Value");
		l1.setBounds(10, 30, 146, 14);
		
		l2 = new JLabel("Enter Second Value");
		l2.setBounds(10, 70, 146, 14);
		
		tf1 =new JTextField();
		tf1.setBounds(134, 30, 130, 20);
		
		tf2 =new JTextField();
		tf2.setBounds(134, 70, 130, 20);
		
		tf3 =new JTextField();
		tf3.setBounds(134, 110, 130, 20);
		tf3.setEditable(false);
	
		btn1 =new JButton("+");
		btn1.setBounds(71, 148, 50, 50);
		
		btn2 =new JButton("-");
		btn2.setBounds(140, 148, 50, 50);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btn1);
		frame.add(btn2);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new FrameExample();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		String a = tf1.getText().toString();
		String b = tf2.getText().toString();
		
		int c=0;
		
		if(e.getSource()==btn1)
		{
			c = Integer.parseInt(a)+Integer.parseInt(b);
		}
		
		if(e.getSource()==btn2)
		{
			c = Integer.parseInt(a)-Integer.parseInt(b);
		}
		
		tf3.setText(String.valueOf(c));
		
	}
	
}
