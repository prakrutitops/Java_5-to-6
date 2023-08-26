package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Model;

public class Dao 
{
	
	public static Connection getconnect()
	{
		
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrud","root","");
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public static int savedata(Model m)
	{
		Connection con = Dao.getconnect();
		int status =0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into details(name,email,address,phone) values (?,?,?,?)");
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getAddress());
			ps.setString(4,m.getPhone());
		
			status = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
	public static List<Model>viewdata() 
	{
		 List<Model>list = new ArrayList<>(); 
		 Connection con = Dao.getconnect(); 
		 try 
		 { 
			 PreparedStatement ps = con.prepareStatement("select * from details"); 
			 ResultSet set = ps.executeQuery();
		  
		  while(set.next()) 
		  {
			  int id = set.getInt(1);
			  String name = set.getString(2);
			  String email = set.getString(3); 
			  String address = set.getString(4);
			  String phone = set.getString(5);
		 
			  Model m =new Model(); 
			  m.setId(id); 
			  m.setName(name);
			  m.setEmail(email);
			  m.setAddress(address);
			  m.setPhone(phone);
		  
			  list.add(m);
		  
		  }
		  
		  }
		 catch (SQLException e) 
		 { // TODO Auto-generated catch block
		  
			 e.printStackTrace(); 
		 }
		  
		  
		 
		 return list; 
		 
	}
	
	
	
	public static int deletedata(int id)
	{ 
		Connection con = Dao.getconnect();
		int status =0;
	  
	  try 
	  {
		  PreparedStatement ps = con.prepareStatement("delete from details where id =?");
		  ps.setInt(1,id);
	  
		  status = ps.executeUpdate();
	  
	  
		  
		  }
	  catch (SQLException e) 
	  { 
		  e.printStackTrace(); 
	}
	  
	 
	  
	  return status; }
	  
	
	
	
	
	
	
	
	
	
	
	/*
	 * public static Model Logindetails(Model model) { boolean flag = false;
	 * 
	 * Model obj = null;
	 * 
	 * try { Connection con = Dao.getconnect(); PreparedStatement ps =
	 * con.prepareStatement("select * from signup where email=? and password=?");
	 * ps.setString(1, model.getEmail()); ps.setString(2, model.getPassword());
	 * 
	 * ResultSet rs = ps.executeQuery();
	 * 
	 * if (rs.next()) { obj = new Model(); obj.setEmail(rs.getString("email"));
	 * obj.setPassword(rs.getString("password"));
	 * 
	 * }
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * return obj; }
	 * 
	 * public static int registerdata(ProductAddModel m) { Connection con =
	 * Dao.getconnect(); int status =0;
	 * 
	 * try { PreparedStatement ps = con.
	 * prepareStatement("insert into products(name,price,description) values (?,?,?)"
	 * ); ps.setString(1,m.getName()); ps.setString(2,m.getPrice());
	 * ps.setString(3,m.getDescription());
	 * 
	 * 
	 * status = ps.executeUpdate(); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * return status; } public static List<ProductAddModel>viewdata() {
	 * List<ProductAddModel>list = new ArrayList<>(); Connection con =
	 * Dao.getconnect(); try { PreparedStatement ps
	 * =con.prepareStatement("select * from products"); ResultSet set =
	 * ps.executeQuery();
	 * 
	 * while(set.next()) { int id = set.getInt(1); String p_name = set.getString(2);
	 * String p_price = set.getString(3); String p_des = set.getString(4);
	 * 
	 * ProductAddModel m =new ProductAddModel(); m.setId(id); m.setName(p_name);
	 * m.setPrice(p_price); m.setDescription(p_des);
	 * 
	 * list.add(m);
	 * 
	 * }
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * return list; }
	 * 
	 * public static int deletedata(int id) { Connection con = Dao.getconnect(); int
	 * status =0;
	 * 
	 * try { PreparedStatement ps =
	 * con.prepareStatement("delete from products where id =?"); ps.setInt(1,id);
	 * 
	 * status = ps.executeUpdate();
	 * 
	 * 
	 * status = ps.executeUpdate(); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * return status; }
	 * 
	 * public static ProductAddModel getdetailbyid(int id) {
	 * 
	 * ProductAddModel m = null;
	 * 
	 * Connection con = Dao.getconnect();
	 * 
	 * try { PreparedStatement ps =
	 * con.prepareStatement("select * from products where id =?"); ps.setInt(1,id);
	 * 
	 * ResultSet set = ps.executeQuery();
	 * 
	 * if(set.next()) { int id2 = set.getInt(1); String p_name = set.getString(2);
	 * String p_price = set.getString(3); String p_des = set.getString(4);
	 * 
	 * m =new ProductAddModel(); m.setId(id); m.setName(p_name);
	 * m.setPrice(p_price); m.setDescription(p_des);
	 * 
	 * }
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * return m; }
	 * 
	 * public static int updatedata(ProductAddModel m) { Connection con =
	 * Dao.getconnect(); int status =0;
	 * 
	 * try { PreparedStatement ps = con.
	 * prepareStatement("update products set name=?,price=?,description=? where id=?"
	 * ); ps.setString(1,m.getName()); ps.setString(2,m.getPrice());
	 * ps.setString(3,m.getDescription()); ps.setInt(4,m.getId());
	 * 
	 * 
	 * status = ps.executeUpdate(); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * return status; }
	 */
}
