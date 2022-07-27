package br.com.matriculaservlet.servlets;

import br.com.matriculaservlet.modelo.Banco;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

//@WebServlet(name = "RemoveDisciplinaServlet", value = "/RemoveDisciplinaServlet")
public class RemoveDisciplinaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Banco banco = new Banco();
        Integer idRemover = Integer.parseInt(request.getParameter("id"));
        banco.removeDisciplina(idRemover);
        response.sendRedirect("DisciplinaCadastradaServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
