import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao 
{
	
	public static Connection getconnect()
	{
		
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/akshit","root","");
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
			PreparedStatement ps = con.prepareStatement("insert into signup(first_name,last_name,company,email,area_code,phone,subject,exist,password) values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1,m.getFirst_name());
			ps.setString(2,m.getLast_name());
			ps.setString(3,m.getCompany());
			ps.setString(4,m.getEmail());
			ps.setInt(5,m.getArea_code());
			ps.setString(6,m.getPhone());
			ps.setString(7,m.getSubject());
			ps.setString(8,m.getExist());
			ps.setString(9,m.getPassword());
			status = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
	public static Model Logindetails(Model model) 
	{
		boolean flag = false;

		Model obj = null;

		try {
			Connection con = Dao.getconnect();
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
			ps.setString(1, model.getEmail());
			ps.setString(2, model.getPassword());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				obj = new Model();
				obj.setEmail(rs.getString("email"));
				obj.setPassword(rs.getString("password"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}
	
	
}
