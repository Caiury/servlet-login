package br.com.impacta.javaweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sistema
 */
@WebServlet("/sistema")
public class Sistema extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
       String login = request.getParameter("login"); 
		StringBuilder sb = new StringBuilder("<H1>Bem vindo "+login+" <H1><p>");
		
		
	       sb.append("<H2>Está é a pagina principal do sistema</H2>");
	       
	       response.getWriter().append(sb.toString());
		
		
		
	}

}
