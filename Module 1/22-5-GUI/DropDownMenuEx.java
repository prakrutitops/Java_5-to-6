package com.a225;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class DropDownMenuEx 
{
	
	JFrame frame;
	String city[]= {"Rajkot","Baroda","Surat"};
	JComboBox<String>cb;
	JButton btn;
	
	public DropDownMenuEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		cb =new JComboBox<>(city);
		cb.setBounds(199, 117, 130, 22);

		btn =new JButton("Submit");
		btn.setBounds(300, 117, 89, 23);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource()==btn)
				{
					System.out.println(cb.getItemAt(cb.getSelectedIndex()));
				}
				
				
				
			}
		});
		frame.add(cb);
		frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new DropDownMenuEx();
	}
}
