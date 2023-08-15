import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String fname = req.getParameter("first_name");
		String lname = req.getParameter("last_name");
		String company = req.getParameter("company");
		String email = req.getParameter("email");
		String areacode = req.getParameter("area_code");
		int areacode2 = Integer.parseInt(areacode);
		String phone = req.getParameter("phone");
		String subject = req.getParameter("subject");
		String exist = req.getParameter("exist");
		String password = req.getParameter("password");
	
		Model m =new Model();
		m.setFirst_name(fname);
		m.setLast_name(lname);
		m.setCompany(company);
		m.setEmail(email);
		m.setArea_code(areacode2);
		m.setPhone(phone);
		m.setSubject(subject);
		m.setExist(exist);
		m.setPassword(password);
		
		int data = Dao.savedata(m);
		
		if(data>0)
		{
			System.out.println("Pass");
			resp.sendRedirect("login.html");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
	}
}
