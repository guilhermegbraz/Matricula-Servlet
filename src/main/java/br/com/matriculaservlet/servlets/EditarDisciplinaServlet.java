package br.com.matriculaservlet.servlets;

import br.com.matriculaservlet.modelo.Banco;
import br.com.matriculaservlet.modelo.Disciplina;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

//@WebServlet(name = "EditarDisciplinaServlet", value = "/EditarDisciplinaServlet")
public class EditarDisciplinaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Banco bancoDisciplinas = new Banco();
        Disciplina disciplinaAModificar = bancoDisciplinas.getDisciplinaPeloId(
                Integer.valueOf(request.getParameter("idDisciplina")));

        disciplinaAModificar.setNome(request.getParameter("nomeDisciplina"));
        disciplinaAModificar.setTPI(request.getParameter("TPIDisciplina"));
        disciplinaAModificar.setProfessor(request.getParameter("professorDisciplina"));

        response.sendRedirect("DisciplinaCadastradaServlet");
    }

}
