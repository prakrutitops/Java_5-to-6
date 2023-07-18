import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet
{
	//doget
	//dopost
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		String name1 = req.getParameter("name");
		String email1 = req.getParameter("email");
		String subject1 = req.getParameter("subject");
		String message1= req.getParameter("message");
		
		/*
		 * System.out.println(name); System.out.println(email);
		 * System.out.println(subject); System.out.println(message);
		 */
		out.print("Details: ");
		out.print("<br>");
		out.println(" Your Name is :"+name1);
		out.print("<br>");
		out.println(" Your Email is :"+email1);
		out.print("<br>");
		out.println(" Your Subject is :"+subject1);
		out.print("<br>");
		out.println(" Your Message is :"+message1);
		out.print("<br>");
	}
}
