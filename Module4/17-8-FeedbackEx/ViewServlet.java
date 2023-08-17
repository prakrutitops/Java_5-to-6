import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.print("<center>");
		out.print("<a href='index.html'>Add Feedback</a>");
		out.print("<br>");
		out.print("<br>");
		out.print("<table border='1' cellspacing='5' cellpadding='5'>");
		
		out.print("<tr><th>Id</th><th>Person Name</th><th>Person Email</th><th>Subject</th><th>Message</th></tr>");
		
		List<FeedbackModel>list = FeedbackDao.viewdata();
		
		for(FeedbackModel p :list)
		{
			out.print("<tr><td>"+p.getId()+"</td><td>"+p.getName()+"</td><td>"+p.getEmail()+"</td><td>"+p.getSubject()+"</td><td>"+p.getMessage()+"</td>");
		}
		
		out.print("</table>");
		out.print("</center>");
	
	}
}

