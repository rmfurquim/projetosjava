package br.com.caelum.mvc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("*")
public class FiltroTeste implements Filter {
	public void init(FilterConfig filterConfig) 
		      throws ServletException {
		      
	}
	public void destroy() {
	    
	}
	
	public void doFilter(ServletRequest request,
    ServletResponse response, FilterChain chain) 
    throws IOException, ServletException 
	{
		long tempoInicial = System.currentTimeMillis();
		System.out.println(" Filtrando ....." );
		chain.doFilter(request, response);
		long tempoFinal = System.currentTimeMillis();
		System.out.println(" saindo do Filtro ....." );
		System.out.println(" Tempo Requisicao:" + (tempoFinal - tempoInicial) );
	}
}
