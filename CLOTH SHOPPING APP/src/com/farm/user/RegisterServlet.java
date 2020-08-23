package com.farm.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Register1")
public class RegisterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		
		try
		{
			UserDao userDao = new UserDao();
			Register register = userDao.selectUserDaoDetails(email);
			if(register==null)
			{
				userDao.addDetails(email, fullname, password, phone);
				response.sendRedirect("relogin.html");
				
				
			}
			else
			{
				response.sendRedirect("reregister.html");
			}
		} catch (Exception e) {
//			 TODO: handle exception
		}
	
		
	}
}
