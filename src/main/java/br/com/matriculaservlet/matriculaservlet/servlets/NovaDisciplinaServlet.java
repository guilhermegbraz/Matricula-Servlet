package br.com.matriculaservlet.matriculaservlet.servlets;

import br.com.matriculaservlet.matriculaservlet.classes.BancoDisciplinas;
import br.com.matriculaservlet.matriculaservlet.classes.Disciplina;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NovaDisciplinaServlet", value = "/NovaDisciplinaServlet")
public class NovaDisciplinaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("form_disciplina.html");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeDisciplina = request.getParameter("nomeDisciplina");
        String TPIDisciplina = request.getParameter("TPIDisciplina");
        String professorDisciplina = request.getParameter("professorDisciplina");

        Disciplina novaDisciplina = new Disciplina(nomeDisciplina, TPIDisciplina);

        if (!(professorDisciplina.equals(null))) {
            novaDisciplina.setProfessor(professorDisciplina);
        }

        BancoDisciplinas banco = new BancoDisciplinas();
        banco.adiciona(novaDisciplina);

        System.out.println("Nova disciplina Cadastrada");

        response.sendRedirect("DisciplinaCadastradaServlet");
    }
}
