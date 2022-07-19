package br.com.matriculaservlet.servlets;

import br.com.matriculaservlet.classes.BancoDisciplinas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ExibeDisciplinaServlet", value = "/ExibeDisciplinaServlet")
public class ExibeDisciplinaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id = Integer.valueOf(request.getParameter("id"));
        request.setAttribute("disciplina", new BancoDisciplinas().getDisciplinaPeloId(id));
        RequestDispatcher rd = request.getRequestDispatcher("editar_disciplina.jsp");
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
