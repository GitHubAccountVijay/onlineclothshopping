package com.farm.contactus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/contactus")
public class ContactusServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String comment = request.getParameter("comment");
		ContactusDAO contactusDAO = new ContactusDAO();
		contactusDAO.addContactDetails(fullname,email,phone,comment);
		PrintWriter writer = response.getWriter();
		writer.println("<body style=\"background: url('nature1.jpeg');background-repeat: no-repeat;background-size: 100% 650px;\"><center><div><h3 style=\"color: wheat;margin-top:5%;\">Hello '"+fullname+"' ,Thanks for contacting us, our team will get back to you within 48 hours<br><br></h3><a href=\"\" style=\"font-size: 20px; color: indigo;\">Click here to go to Home</a></div></center></body>");
	}
}
