package br.com.caelum.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/contador")
public class Contador extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int contador = 0; // Variável de instância

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		contador++; // a cada requisição a mesma variável é incrementada

		// recebe o writer
		PrintWriter out = response.getWriter();

		// escreve o texto
		out.println("<html>");
		out.println("<head><title>Contador de Requisições</title></head>");
		out.println("<body>");
		out.println("<h3>Contador agora é: </h3>" + contador);
		out.println("</body></html>");
	}

}
