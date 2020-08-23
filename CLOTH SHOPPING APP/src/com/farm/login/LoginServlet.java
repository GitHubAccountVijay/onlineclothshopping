package com.farm.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farm.user.Register;
@WebServlet("/usercall")
public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			LoginDAO userDao = new LoginDAO();
			Register loginSelect = userDao.loginSelect(email, password);
			if(loginSelect==null)
			{
				response.sendRedirect("loginnotexists.html");
			}
			else
			{
				if(loginSelect.getEmail().equals(email)&&loginSelect.getPassword().equals(password))
				{
					response.sendRedirect("buy.jsp");
				}
				else
				{
//					response.setContentType("text/html");
//					
//					out.println("<h6 style=\"margin-left:20%;\">email or password incprrect</h6>");
//					RequestDispatcher requestDispatcher = request.getRequestDispatcher("user.html");
//					requestDispatcher.include(request, response);
					response.sendRedirect("logincheck.html");
					
					
				}
			}
			
			
		} catch (Exception e) {
			
		}
	}
}
