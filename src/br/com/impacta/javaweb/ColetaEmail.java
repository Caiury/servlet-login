package br.com.impacta.javaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ColetaLogin
 */
@WebServlet("/ColetaEmail")
public class ColetaEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Usuario  usuario = (Usuario) request.getSession().getAttribute("usuario");
		
		out.println("<html><head>");
		out.println("<title>Cadastro Email</title>");
		out.println("<body>");
		out.println("<H2> "+usuario.getEmail()+" informe o seu email:  </H2><br/>");
		out.println("< form method=\"post\"action=\"AdicionaEmailCookie\">");
		out.println("Email: <br/> <input> type=\"text\"name\"email\" size=\"80\"> <br/>");
		out.println("<p> <input type=\" value=\"Enviar\"> </p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
