import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Db_Operations 
{
	
	JFrame insertframe,deleteframe,editframe,updateframe;
	JTextField tfname,tfsurname,tfid;
	JButton btnadd,btndelete,btnupdate,btnedit;
	JPanel jp,jp2;
	int did=0;
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
	
	public void viewdata()
	{
		String root="jdbc:mysql://localhost:3306/";
		String db="akshit";
		String url = root+db;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			String sql ="select * from jdbc";
			Statement stmt=(Statement) con.createStatement();
			ResultSet set = stmt.executeQuery(sql);
			System.out.println("ID"+"   "+"NAME"+"   "+"SURNAME");	
			while(set.next())
			{
				int id= set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				
				System.out.println(id+"   "+name+"   "+surname);	
			}
			
			
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	public void deletedata()
	{
		
		deleteframe =new JFrame();
		
		tfid =new JTextField(20);
		btndelete =new JButton("DELETE");
		
		btndelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				String root="jdbc:mysql://localhost:3306/";
				String db="akshit";
				String url = root+db;
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String myid = tfid.getText().toString();
					int myid2 = Integer.parseInt(myid);
					
					String sql ="delete from jdbc where id='"+myid2+"'";
					
					Statement stmt = con.createStatement();
					
					int deletedata = stmt.executeUpdate(sql);
					
					
					if(deletedata>0)
					{
						deleteframe.setVisible(false);
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
		
		deleteframe.add(tfid);
		deleteframe.add(btndelete);
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
		
		
		
	}

	public void updatedata()
	{
		
		updateframe =new JFrame();
		
		tfid =new JTextField(20);
		btnupdate =new JButton("UPDATE");
		tfname =new JTextField(20);
		tfsurname=new JTextField(20);
		btnedit =new JButton("EDIT");
		
		jp =new JPanel();
		jp2 =new JPanel();
		
		
		jp.add(tfid);
		jp.add(btnupdate);
		
		
		
		
		
		
		
		btnupdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				String root="jdbc:mysql://localhost:3306/";
				String db="akshit";
				String url = root+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String myid = tfid.getText().toString();
					int myid2 = Integer.parseInt(myid);
					
					String sql ="select * from jdbc where id='"+myid2+"'";
					
					Statement stmt = con.createStatement();
					ResultSet set = stmt.executeQuery(sql);
					
					if(set.next())
					{
						
						did= set.getInt(1);
						String name = set.getString(2);
						String surname = set.getString(3);
						
						tfname.setText(name);
						tfsurname.setText(surname);
					}
							
					
					
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
				jp2.add(tfname);
				jp2.add(tfsurname);
				jp2.add(btnedit);
				jp2.setVisible(true);
				jp.setVisible(false);
				
			}
		});
		
		btnedit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				String root="jdbc:mysql://localhost:3306/";
				String db="akshit";
				String url = root+db;
			
				try 
				{	
					
					String myname = tfname.getText().toString();
					String mysurname =tfsurname.getText().toString();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String sql ="update jdbc set name='"+myname+"',surname='"+mysurname+"' where id='"+did+"'";
					Statement stmt=(Statement) con.createStatement();
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						updateframe.setVisible(false);
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
		
	
		
		
		
		jp2.setVisible(false);
		jp.setVisible(true);
		jp.add(jp2);
		updateframe.add(jp);
		updateframe.add(jp2);
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
		
		
	}
}
	
	

