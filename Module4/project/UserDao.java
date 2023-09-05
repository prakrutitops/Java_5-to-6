package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.model.ProductModel;
import com.model.SignupModel;

public class UserDao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data8","root","");
			} 
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return con;
		
	}
	
	//Signup Data
	public static int signup(SignupModel m)
	{
		int status =0;
		
		Connection con = UserDao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into signup(fullname,email,phone,password) values (?,?,?,?)");
			ps.setString(1,m.getFullname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPhone());
			ps.setString(4,m.getPassword());
			
			status = ps.executeUpdate();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	//Login Data
	
	public SignupModel Login(SignupModel model) {
		boolean flag = false;

		SignupModel obj = null;

		try {
			Connection con = UserDao.getconnect();
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
			ps.setString(1, model.getEmail());
			ps.setString(2, model.getPassword());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) 
			{
				obj = new SignupModel();
				obj.setFullname(rs.getString("fullname"));
				obj.setEmail(rs.getString("email"));
				obj.setPhone(rs.getString("phone"));
				obj.setPassword(rs.getString("password"));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}
	
	//View Product
	public static List<ProductModel>viewdata() 
	{
		 List<ProductModel>list = new ArrayList<>(); 
		 Connection con = UserDao.getconnect(); 
		 try 
		 { 
			 PreparedStatement ps = con.prepareStatement("select * from products"); 
			 ResultSet set = ps.executeQuery();
		  
		  while(set.next()) 
		  {
			  int id = set.getInt(1);
			  String name = set.getString(2);
			  String price = set.getString(3); 
			  String image = set.getString(4);
			  
		 
			  ProductModel m =new ProductModel(); 
			  m.setPid(id);
			  m.setPname(name);
			  m.setPprice(price);
			  m.setPimage(image);
		  
			  list.add(m);
		  
		  }
		  
		  }
		 catch (SQLException e) 
		 { // TODO Auto-generated catch block
		  
			 e.printStackTrace(); 
		 }
		  
		  
		 
		 return list; 
		 
	}
	
	
	
}
