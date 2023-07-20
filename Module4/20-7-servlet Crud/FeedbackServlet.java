import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.border.EmptyBorder;

public class FeedbackServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();//Web page value print
		
		String fname = req.getParameter("firstname");
		String lname = req.getParameter("lastname");
		String mail = req.getParameter("mailid");
		String country = req.getParameter("country");
		String feedback = req.getParameter("subject");
		
		
		/*
		 * out.print(fname); out.print("<br>"); out.print(lname); out.print("<br>");
		 * out.print(mail); out.print("<br>"); out.print(country); out.print("<br>");
		 * out.print(feedback); out.print("<br>");
		 */
		
		Model m =new Model();
		m.setFname(fname);
		m.setLname(lname);
		m.setEmail(mail);
		m.setCountry(country);
		m.setFeedback(feedback);
		
		
		int status = UserDao.savedata(m);
		
		if(status>0)
		{
			out.print("Success");
		}
		else
		{
			out.print("Fail");
		}
		
		
	}
}
