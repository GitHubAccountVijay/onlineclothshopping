package com.farm.subscription;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/subscription")
public class SubscriptionServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		
		SubscriptionDAO subscriptionDAO = new SubscriptionDAO();
		subscriptionDAO.subscriptionDetails(fname,lname,email);
		PrintWriter writer = response.getWriter();
		writer.println("<body style=\"background-color:lightblue;\"><div style=\"margin-top:10%;\"><center><h2>Subscribed <br><br><a href=\"index.html\" style=\\\"font-size:10px;>Click here to Home</a></h2></center></div></body>");
	}
}
