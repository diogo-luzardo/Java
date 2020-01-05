package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/minhaCasa")
public class MinhaCasa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Familiar Cadastrado com sucesso.");
		PrintWriter out = response.getWriter();
		String novoFamiliar = request.getParameter("nome");
		out.println("<html><body>O "+ novoFamiliar + " é o mais novo membro de nossa familia!</body></html>");
	}

}
