package com.custometag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CopyrightTag extends SimpleTagSupport 
{
	
	public void doTag() throws JspException 
	{
		JspWriter out = getJspContext().getOut();
		try 
		{
			out.println("Dont Copy My Data..");
		}
		catch (java.io.IOException e) 
		{
			throw new JspException(e.getMessage());
		}
	}
}
