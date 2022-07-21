package br.com.matriculaservlet.servlets;

import br.com.matriculaservlet.modelo.BancoDisciplinas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RemoveDisciplinaServlet", value = "/RemoveDisciplinaServlet")
public class RemoveDisciplinaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BancoDisciplinas banco = new BancoDisciplinas();
        Integer idRemover = Integer.parseInt(request.getParameter("id"));
        banco.remove(idRemover);
        response.sendRedirect("DisciplinaCadastradaServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
