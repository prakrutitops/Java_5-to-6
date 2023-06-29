import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass implements ActionListener
{
	
	JFrame frame;
	JButton btn1insert,btnview,btnupdate,btndelete;
	
	public MainClass() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		btn1insert = new JButton("INSERT");
		btnview =new JButton("VIEW");
		btnupdate =new JButton("UPDATE");
		btndelete =new JButton("DELETE");
		
		btn1insert.addActionListener(this);
		
		
		frame.add(btn1insert);
		frame.add(btnview);
		frame.add(btnupdate);
		frame.add(btndelete);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) 
	{
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Db_Operations d =new Db_Operations();
		
		if(e.getSource()==btn1insert)
		{
			d.insertdata();
		}
		
		
	}
	
	
}
