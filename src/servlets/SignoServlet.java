package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calc.CalculaSigno;

/**
 * @author fernando.felix
 *
 */
@WebServlet("/SignoServlet")
public class SignoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String data = request.getParameter("data");
		int dia = Integer.parseInt(data.substring(8));
		int mes = Integer.parseInt(data.substring(5, 7));
		PrintWriter p = response.getWriter();
		p.print("<!DOCTYPE html> <html> <head> <meta charset='ISO-8859-1'> <title>Login</title> <link href='http://localhost:8080/PW1/css/bootstrap.css' rel='stylesheet'> <link href='http://localhost:8080/PW1/css/ui.css' rel='stylesheet'> </head> <body> <div class='mt-4 p-4 container'>");
		p.print("<h3>Olá ");
		p.print(request.getParameter("nome"));
		p.print(" seu signo é ");
		p.print(CalculaSigno.getSigno(dia, mes));
		p.print("</h3>");
		p.print("<a class='btn btn-secondary' href='http://localhost:8080/PW1/'>Voltar</a></div></body></html>");
	}
}
