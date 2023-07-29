import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//ssuper.doPost(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String email= req.getParameter("email");
		String pass = req.getParameter("password");
		
		Model m =new Model();
		m.setEmail(email);
		m.setPassword(pass);
		
		Model m2 = Dao.Logindetails(m);
		
		if(m2!=null)
		{
			System.out.println("Logged in ");
		}
		else
		{
			System.out.println("Error");
		}
		
	}
}
