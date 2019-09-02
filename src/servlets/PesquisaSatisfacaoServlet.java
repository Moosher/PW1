package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fernando.felix
 *
 */
@WebServlet("/PesquisaSatisfacaoServlet")
public class PesquisaSatisfacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int positivas, negativas, neutras;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("passo").equals("1")) {
			this.positivas = 0;
			this.negativas = 0;
			this.neutras = 0;

			for (int i = 1; i < 6; i++) {
				int resposta = Integer.parseInt(request.getParameter("pergunta" + i));
				switch (resposta) {
				case 0:
					this.neutras++;
					break;
				case 1:
					this.positivas++;
					break;
				case 2:
					this.negativas++;
					break;
				}
			}
			response.sendRedirect("http://localhost:8080/PW1/pesquisa_passo2.html");
		} else if (request.getParameter("passo").equals("2")) {
			for (int i = 1; i < 6; i++) {
				int resposta = Integer.parseInt(request.getParameter("pergunta" + i));
				switch (resposta) {
				case 0:
					this.neutras++;
					break;
				case 1:
					this.positivas++;
					break;
				case 2:
					this.negativas++;
					break;
				}
			}

			PrintWriter p = response.getWriter();
			p.print("<!DOCTYPE html> <html> <head> <meta charset='ISO-8859-1'> <title>Login</title> <link href='http://localhost:8080/PW1/css/bootstrap.css' rel='stylesheet'> <link href='http://localhost:8080/PW1/css/ui.css' rel='stylesheet'> </head> <body> <div class='mt-4 p-4 container'>");
			p.print("<h3>Resultado da Pesquisa</h3>");
			p.print("<ul>");
			p.print("<li>");
			p.print("Respostas Positivas: ");
			p.print(this.positivas);
			p.print("</li>");
			p.print("<li>");
			p.print("Resposta Negativas: ");
			p.print(this.negativas);
			p.print("</li>");
			p.print("<li>");
			p.print("Respostas Neutras: ");
			p.print(this.neutras);
			p.print("</li>");
			p.print("</ul>");
			p.print("<a class='btn btn-primary' href='http://localhost:8080/PW1/'>Voltar</a></div></body></html>");

		}
	}
}
