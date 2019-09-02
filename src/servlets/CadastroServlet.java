package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Aluno;

/**
 * @author fernando.felix
 *
 */
@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Aluno> lstAlunos = new ArrayList<>();

	public CadastroServlet() {
		super();
		this.lstAlunos = new ArrayList<>();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.printAlunos(response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			System.out.println("fofdsakdjaskd");
			List<String> discs = new ArrayList<>();
			discs.add("on".equals(request.getParameter("sog")) ? "S.O.G" : null);
			discs.add("on".equals(request.getParameter("pog")) ? "P.O.G" : null);
			Aluno aluno = new Aluno();
			aluno.setNome(request.getParameter("nome"));
			aluno.setGenero(request.getParameter("genero"));
			aluno.setIdade(Integer.parseInt(request.getParameter("idade")));
			aluno.setDisciplinas(discs);
			this.lstAlunos.add(aluno);
		} catch (Exception e) {
		}
		this.printAlunos(response);
	}

	private void printAlunos(HttpServletResponse response) throws IOException {
		PrintWriter p = response.getWriter();
		p.print("<!DOCTYPE html> <html> <head> <meta charset='ISO-8859-1'> <title>Login</title> <link href='http://localhost:8080/PW1/css/bootstrap.css' rel='stylesheet'> <link href='http://localhost:8080/PW1/css/ui.css' rel='stylesheet'> </head> <body> <div class='mt-4 p-4 container'>");
		p.print("<h3>Alunos</h3>");

		p.print("<table class='table'>");
		p.print("<thead class='thead-dark'><tr><th scope='col'>Nome</th><th scope='col'>Idade</th><th scope='col'>Gênero</th><th scope='col'>Disciplinas</th></tr><thead>");

		for (Aluno a : this.lstAlunos) {
			p.print("<tbody><tr><td scope='col'>");
			p.print(a.getNome());
			p.print("</td>");
			p.print("<td scope='col'>");
			p.print(a.getIdade());
			p.print("</td>");
			p.print("<td scope='col'>");
			p.print(a.getGenero());
			p.print("</td>");
			p.print("<td scope='col'>");

			for (String d : a.getDisciplinas()) {
				if (d != null) {
					p.print(" | " + d + " | ");
				}
			}
			p.print("</td></tr></tbody>");
		}
		p.print("</table>");
		p.print("<a class='btn btn-secondary mr-2' href='http://localhost:8080/PW1/menu_usuario.html'>Voltar</a><a class='btn btn-primary' href='http://localhost:8080/PW1/cadastrar_aluno.html'>Novo Aluno</a></div></body></html>");

	}
}
