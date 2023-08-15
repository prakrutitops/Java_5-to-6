import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		
		ProductAddModel m = Dao.getdetailbyid(id2);
		
		out.print("<form action ='UpdateServlet2' method='post'>");
		
		out.print("<p>");
		out.print("<input type='text' name='name' value='"+m.getName()+"'");
		out.print("</p>");
		
		out.print("<p>");
		out.print("<input type='text' name='price' value='"+m.getPrice()+"'");
		out.print("</p>");
		
		out.print("<p>");
		out.print("<input type='text' name='description' value='"+m.getDescription()+"'");
		out.print("</p>");
		
		out.print("<p>");
		out.print("<input type='hidden' name='id' value='"+m.getId()+"'");
		out.print("</p>");
		
		out.print("<p>");
		out.print("<input type='submit' name='submit' value='submit'");
		out.print("</p>");
		
		out.print("</form>");
		
	}
}
