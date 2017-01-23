package br.com.caelum.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
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
		String dataemtexto = request.getParameter("dataNascimento");
		Calendar dataNascimento = null;
		try{
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataemtexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(data);
		} catch (ParseException e) 
		{
			out.println("Erro de conversao da data");
			return;
		}
		
		//monta um objeto contato
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail("");
		contato.setEndereco("");
		contato.setDataNascimento(dataNascimento);
		
		ContatoDao contatodao = new ContatoDao();
		contatodao.adiciona(contato);
		
		RequestDispatcher rd = request.getRequestDispatcher("/contato-adicionado.jsp");
		rd.forward(request, response);
		
		out.println("Contato Gravado");
		
	}
}
