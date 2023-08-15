import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String des = req.getParameter("description");
		
		ProductAddModel m =new ProductAddModel();
		m.setId(id2);
		m.setName(name);
		m.setPrice(price);
		m.setDescription(des);
		
		int data = Dao.updatedata(m);
		
		if(data>0)
		{
			//out.print("success");
			resp.sendRedirect("ProductViewServlet");
		}
		else
		{
			out.print("fail");
		}
	
	}
}
