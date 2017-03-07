package br.com.desafio.twitter.rest;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import br.com.desafio.twitter.OrdenaListaTwitter;
import br.com.desafio.twitter.RecuperaListaTwitter;
import br.com.desafio.twitter.DAO.Tweet;

/**
 * Servlet implementation class MostRelevants
 */
@WebServlet("/MostRelevants")
public class MostRelevants extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected List<Tweet> listaTwitter;
	
	public MostRelevants() {
    	String urlWebService = "http://tweeps.locaweb.com.br/tweeps";
		String usuario = "thiago.cobalt@gmail.com";
		
		//recupera a lista de tweets
		listaTwitter = RecuperaListaTwitter.getObjeto(urlWebService, usuario);
		//ordena a lista de tweets
		OrdenaListaTwitter.ordenaTweet(listaTwitter);
    }
    
    
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("listaTwitter",listaTwitter);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
}
