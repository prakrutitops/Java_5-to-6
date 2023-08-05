import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductAddServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String des = req.getParameter("description");
		
		ProductAddModel m =new ProductAddModel();
		m.setName(name);
		m.setPrice(price);
		m.setDescription(des);
		int data = Dao.registerdata(m);
		
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
