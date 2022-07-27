package br.com.matriculaservlet.servlets;

import br.com.matriculaservlet.modelo.Banco;
import br.com.matriculaservlet.modelo.Disciplina;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

//@WebServlet(name = "NovaDisciplinaServlet", value = "/NovaDisciplinaServlet")
public class NovaDisciplinaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("form_disciplina.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String nomeDisciplina = request.getParameter("nomeDisciplina");
        String TPIDisciplina = request.getParameter("TPIDisciplina");
        String professorDisciplina = request.getParameter("professorDisciplina");

        Disciplina novaDisciplina = new Disciplina(nomeDisciplina, TPIDisciplina);

        if (!(professorDisciplina == null)) {
            novaDisciplina.setProfessor(professorDisciplina);
        }

        Banco banco = new Banco();
        banco.adicionaDisciplina(novaDisciplina);

        System.out.println("Nova disciplina Cadastrada");

        response.sendRedirect("DisciplinaCadastradaServlet");
    }
}
