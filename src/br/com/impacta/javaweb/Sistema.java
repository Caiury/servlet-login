package br.com.impacta.javaweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.javaweb.bean.Usuario;

/**
 * Servlet implementation class Sistema
 */
@WebServlet("/sistema")
public class Sistema extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Usuario user = (Usuario) request.getSession().getAttribute("usuario");

		if (user.getEmail() == null || user.getEmail().isBlank()) {
			RequestDispatcher rd = request.getRequestDispatcher("/ColetaEmail");
			rd.forward(request, response);
		} else {

			StringBuilder sb = new StringBuilder("<H1>Bem vindo " + user.getLogin() + " <H1><p>");
			sb.append("<H2>Está é a pagina principal do sistema</H2>");
			sb.append("<H3>Seu email cadastrado é "+user.getEmail()+"< /H3>");

			response.getWriter().append(sb.toString());

		}
	}

}
