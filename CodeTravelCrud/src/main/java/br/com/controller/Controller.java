package br.com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.AgendamentoDAO;
import br.com.model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/inserir", "/selecionar", "/alterar" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AgendamentoDAO dao = new AgendamentoDAO();
	JavaBeans cadastro = new JavaBeans();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		System.out.println(action);

		if (action.equals("/main")) {
			cadastros(request, response);
		} else if (action.equals("/inserir")) {
			novoCadastro(request, response);
		} else if (action.equals("/selecionar")) {
			listarCadastro(request, response);
		} else if (action.equals("/alterar")) {
			editarCadastro(request, response);
		} else {
			response.sendRedirect("Index.html");
		}
		// dao.testeConexao();
	}

	protected void cadastros(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<JavaBeans> lista = dao.listarCadastros();

		request.setAttribute("cadastros", lista);
		RequestDispatcher rd = request.getRequestDispatcher("Agendamento.jsp");
		rd.forward(request, response);

		// Teste de Read dos dados
		/**
		 * for (int i = 0; i < lista.size(); i++) {
		 * System.out.println(lista.get(i).getOrigem());
		 * System.out.println(lista.get(i).getDestino());
		 * System.out.println(lista.get(i).getDataIda());
		 * System.out.println(lista.get(i).getDataVolta());
		 * System.out.println(lista.get(i).getQtdCrianca());
		 * System.out.println(lista.get(i).getQtdAdulto());
		 * System.out.println(lista.get(i).getClasse()); }
		 **/
	}

	protected void novoCadastro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Inserir Cadastro
		cadastro.setOrigem(request.getParameter("origem"));
		cadastro.setDestino(request.getParameter("destino"));
		cadastro.setDataIda(request.getParameter("dataida"));
		cadastro.setDataVolta(request.getParameter("datavolta"));
		cadastro.setQtdCrianca(request.getParameter("crianca"));
		cadastro.setQtdAdulto(request.getParameter("adulto"));
		cadastro.setClasse(request.getParameter("classe"));

		dao.inserirCadastro(cadastro);

		response.sendRedirect("main");

	}
	   // Editar Cadastro

	protected void listarCadastro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int idAgenda = Integer.parseInt(request.getParameter("idAgenda"));

		cadastro.setIdAgenda(idAgenda);

		dao.selecionarCadastro(cadastro);

		request.setAttribute("id", cadastro.getIdAgenda());
		request.setAttribute("origem", cadastro.getOrigem());
		request.setAttribute("destino", cadastro.getDestino());
		request.setAttribute("dataida", cadastro.getDataIda());
		request.setAttribute("datavolta", cadastro.getDataVolta());
		request.setAttribute("crianca", cadastro.getQtdCrianca());
		request.setAttribute("adulto", cadastro.getQtdAdulto());
		request.setAttribute("classe", cadastro.getClasse());

		RequestDispatcher rd = request.getRequestDispatcher("Editar.jsp");
		rd.forward(request, response);
	}	
		protected void editarCadastro(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			
			
			
			cadastro.setOrigem( request.getParameter("origem"));
			cadastro.setDestino( request.getParameter("destino"));
			cadastro.setDataIda( request.getParameter("dataida"));
			cadastro.setDataVolta( request.getParameter("datavolta"));
			cadastro.setQtdCrianca( request.getParameter("crianca"));
			cadastro.setQtdAdulto( request.getParameter("adulto"));
			cadastro.setClasse( request.getParameter("classe"));
			
			dao.alterarCadastro(cadastro);
			
			response.sendRedirect("main");
			// Teste de recebimento
			
		/**	  System.out.println(request.getParameter("id"));
			  System.out.println(request.getParameter("origem"));
			  System.out.println(request.getParameter("destino"));
			  System.out.println(request.getParameter("dataida"));
			  System.out.println(request.getParameter("datavolta"));
			  System.out.println(request.getParameter("crianca"));
			  System.out.println(request.getParameter("adulto"));
			  System.out.println(request.getParameter("classe"));
		**/	  
			  
		} 
		
		 
}
