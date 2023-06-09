package com.a195;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CafeEx 
{
	JFrame frame;
	JLabel l1;
	JCheckBox chk1,chk2,chk3;
	JButton btnorder;
	
	public CafeEx()
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		l1 =new JLabel("Cafe Ordering System");
		l1.setBounds(184, 10, 146, 14);
		
		chk1 =new JCheckBox("Pizza @ Rs. 100");
		chk1.setBounds(53, 40, 197, 23);
		
		chk2 =new JCheckBox("Burger @ Rs. 50");
		chk2.setBounds(53, 80, 197, 23);
		
		chk3 =new JCheckBox("Coffee @ Rs. 120");
		chk3.setBounds(53, 120, 197, 23);
		
		btnorder =new JButton("Order");
		btnorder.setBounds(53, 160, 97, 23);
		
		btnorder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					
				StringBuffer buffer =new StringBuffer("\n selected Items");
				int amount =0;
				
				if(chk1.isSelected())
				{
					buffer.append("\n Pizza @ Rs. 100");
					amount+=100;
				}
				if(chk2.isSelected())
				{
					buffer.append("\n Burger @ Rs. 50");
					amount+=50;
				}
				if(chk3.isSelected())
				{
					buffer.append("\n Coffee @ Rs. 120");
					amount+=120;
				}
				
				buffer.append("\n Total :"+amount);
				
				//System.out.println(buffer.toString());
				JOptionPane.showMessageDialog(frame,buffer.toString());
			}
		});
		
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btnorder);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new CafeEx();
	}
}
