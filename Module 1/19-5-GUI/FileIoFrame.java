package com.a195;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FileIoFrame implements ActionListener
{
	JFrame frame;
	JTextField tname,temail,tmob;
	JPasswordField pass,repass;
	JButton bsubmit;
	
	public FileIoFrame() 
	{
		frame =new JFrame();
		
		tname =new JTextField();
		tname.setBounds(34, 30, 186, 20);
		
		temail = new JTextField();
		temail.setBounds(34, 70, 186, 20);
		
		tmob =new JTextField();
		tmob.setBounds(34, 110, 186, 20);
		
		pass =new JPasswordField();
		pass.setBounds(34, 150, 186, 20);
		
		repass =new JPasswordField();
		repass.setBounds(34, 190, 186, 20);
		
		bsubmit =new JButton("Register");
		bsubmit.setBounds(34, 230, 186, 20);
		bsubmit.addActionListener(this);
		
		frame.add(tname);
		frame.add(temail);
		frame.add(tmob);
		frame.add(pass);
		frame.add(repass);
		frame.add(bsubmit);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		new FileIoFrame();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==bsubmit)
		{
			String myname ="\n Name is ";
			String myemail ="\n Email is ";
			String mymob ="\n Mobile is ";
			String mypass ="\n Password is ";
			String myrepass ="\n Repassword is ";
			
			
			String name = tname.getText().toString();
			String email=temail.getText().toString();
			String mob = tmob.getText().toString();
			String pass1= pass.getText().toString();
			String repass1=repass.getText().toString();
			
			
			if(pass1.equals(repass1))
			{
				try 
				{
					
					FileOutputStream fout =new FileOutputStream("E://data.txt");
					fout.write(myname.getBytes());
					fout.write(name.getBytes());
					fout.write(myemail.getBytes());
					fout.write(email.getBytes());
					fout.write(mymob.getBytes());
					fout.write(mob.getBytes());
					fout.write(mypass.getBytes());
					fout.write(pass1.getBytes());
					fout.write(myrepass.getBytes());
					fout.write(repass1.getBytes());
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Success");
				
			}
			else
			{
				System.out.println("Error");
			}
			
			
		}
	}
	
}
