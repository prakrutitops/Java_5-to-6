import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FeedbackServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		String name = req.getParameter("name");
		String email= req.getParameter("email");
		String subject = req.getParameter("subject");
		String message = req.getParameter("message");
		
		FeedbackModel f =new FeedbackModel();
		
		f.setName(name);
		f.setEmail(email);
		f.setSubject(subject);
		f.setMessage(message);
		
		int data = FeedbackDao.savedata(f);
		
		if(data>0)
		{
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			System.out.println("Fail");
		}
		
	
	}
}
