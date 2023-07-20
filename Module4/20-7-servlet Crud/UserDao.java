import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao 
{
	
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshit","root","");
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
		int status =0;
		Connection con = UserDao.getconnect();
		//Query Execute
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into details(fname,lname,email,country,feedback) values (?,?,?,?,?)");
			
			ps.setString(1, m.getFname());
			ps.setString(2, m.getLname());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getCountry());
			ps.setString(5, m.getFeedback());
			
			status = ps.executeUpdate();
			
			
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
}
