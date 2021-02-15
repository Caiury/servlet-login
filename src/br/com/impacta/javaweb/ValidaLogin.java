package br.com.impacta.javaweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidaLogin
 */
@WebServlet("/valida-login")
public class ValidaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String senha = request.getParameter("senha");
		
		
		if (senha !=null && senha.equals("impacta123") )  {
			
			RequestDispatcher rd = request.getRequestDispatcher("/sistema");
			rd.forward(request, response);
			
		}else {
		response.sendRedirect("/servlet-login/erroLogin.html");
		}
		
	}

}
