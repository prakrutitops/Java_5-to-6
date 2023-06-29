import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Db_Operations 
{
	
	JFrame insertframe;
	JTextField tfname,tfsurname;
	JButton btnadd;
	
	public void insertdata()
	{
		
		insertframe =new JFrame();
		
		tfname =new JTextField(20);
		tfsurname =new JTextField(20);
		btnadd =new JButton("INSERT");
		
		btnadd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				String name = tfname.getText().toString();
				String surname =tfsurname.getText().toString();
				
				String root="jdbc:mysql://localhost:3306/";
				String db="akshit";
				String url = root+db;
				
				try 
				{	
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String sql ="insert into jdbc values(null,'"+name+"','"+surname+"')";
					Statement stmt=(Statement) con.createStatement();
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
			}
		});
		
		
		insertframe.add(tfname);
		insertframe.add(tfsurname);
		insertframe.add(btnadd);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	
}
