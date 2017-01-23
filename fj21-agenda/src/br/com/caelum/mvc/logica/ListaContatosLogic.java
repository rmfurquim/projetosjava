package br.com.caelum.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class ListaContatosLogic  implements Logica {
	
	public String executa(HttpServletRequest req,
			HttpServletResponse res) throws Exception
	{
		
		ContatoDao dao = new ContatoDao();
		List<Contato> lista = dao.getLista();
		req.setAttribute("contatos", lista);
		System.out.println("Listando contato.....");
		
		return "/WEB-INF/jsp/listacontatostaglibs.jsp";


	}

}
