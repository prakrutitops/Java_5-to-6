package com.a225;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.a175.FrameExample;

public class WindowEx extends WindowAdapter
{
	
		JFrame frame;
		
		public WindowEx() 
		{
			// TODO Auto-generated constructor stub
			frame = new JFrame();
			frame.addWindowListener(this);
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			frame.setSize(500,500);
			frame.setLayout(null);
			frame.setVisible(true);
		}
		
		public static void main(String[] args) 
		{
			
			new WindowEx();
		}
		
		@Override
		public void windowClosing(WindowEvent e) 
		{
			// TODO Auto-generated method stub
			//super.windowClosing(e);
			int ans = JOptionPane.showConfirmDialog(frame,"Are you sure?");
			
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
