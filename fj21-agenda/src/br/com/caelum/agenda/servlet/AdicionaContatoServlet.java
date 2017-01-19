package br.com.caelum.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

/**
 * Servlet implementation class AdicionaContatoServlet
 */
@WebServlet("/AdicionaContatoServlet")
public class AdicionaContatoServlet extends HttpServlet {
	protected void service(HttpServletRequest request,
							HttpServletResponse response)
			throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		
		//buscando parametros no request
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		
		//monta um objeto contato
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail("");
		contato.setEndereco("");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao contatodao = new ContatoDao();
		contatodao.adiciona(contato);
		
		out.println("Contato Gravado");
		
	}
}
