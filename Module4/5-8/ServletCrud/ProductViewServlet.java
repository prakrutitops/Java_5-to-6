import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductViewServlet extends HttpServlet
{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//super.doGet(req, resp);
			
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			out.print("<center>");
			out.print("<a href='addproduct.html'>Add Product</a>");
			out.print("<br>");
			out.print("<br>");
			out.print("<table border='1' cellspacing='5' cellpadding='5'>");
			
			out.print("<tr><th>Id</th><th>Product Name</th><th>Product Price</th><th>Product Description</th><th>Update</th><th>Delete</th></tr>");
			
			List<ProductAddModel>list = Dao.viewdata();
			
			for(ProductAddModel p :list)
			{
				out.print("<tr><td>"+p.getId()+"</td><td>"+p.getName()+"</td><td>"+p.getPrice()+"</td><td>"+p.getDescription()+"</td><td><a href='UpdateServlet?id='"+p.getId()+"''>Update</a></td><td><a href='DeleteServlet?id="+p.getId()+"'>Delete</a></td></tr>");
			}
			
			out.print("</table>");
			out.print("</center>");
		
		}
		
		
}
