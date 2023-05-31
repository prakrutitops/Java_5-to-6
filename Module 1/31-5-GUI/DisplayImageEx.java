package com.a315;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class DisplayImageEx extends Canvas
{
	@Override
	public void paint(Graphics g)
	{
		// TODO Auto-generated method stub
		//super.paint(g);
		 	Toolkit t=Toolkit.getDefaultToolkit();  
	        Image i=t.getImage("E:\\photos\\a.jpg");  
	        g.drawImage(i, 120,100,this);  
	}
	
	public static void main(String[] args) 
	{
		DisplayImageEx m=new DisplayImageEx();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
	}
}
