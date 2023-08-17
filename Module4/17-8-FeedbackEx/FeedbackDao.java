import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedbackDao 
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
	
	//save
	
	public static int savedata(FeedbackModel f)
	{
		int status = 0;
		
		Connection con = FeedbackDao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into feedback(name,email,subject,message) values (?,?,?,?)");
			ps.setString(1,f.getName());
			ps.setString(2,f.getEmail());
			ps.setString(3,f.getSubject());
			ps.setString(4,f.getMessage());
		
			status = ps.executeUpdate();
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}
	
	
	public static List<FeedbackModel>viewdata()
	{
		Connection con = FeedbackDao.getconnect();
		
		List<FeedbackModel>list = new ArrayList();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("Select * from feedback");
		
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String email = set.getString(3);
				String subject = set.getString(4);
				String message = set.getString(5);
			
				FeedbackModel f =new FeedbackModel();
				f.setId(id);
				f.setName(name);
				f.setEmail(email);
				f.setSubject(subject);
				f.setMessage(message);
				list.add(f);
			}
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
}
