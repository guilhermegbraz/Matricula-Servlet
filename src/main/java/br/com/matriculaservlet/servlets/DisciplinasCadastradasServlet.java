package br.com.matriculaservlet.servlets;

import br.com.matriculaservlet.modelo.Banco;
import br.com.matriculaservlet.modelo.Disciplina;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Collection;

//@WebServlet(name = "DisciplinaCadastradaServlet", value = "/DisciplinaCadastradaServlet")
public class DisciplinasCadastradasServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Banco bd = new Banco();
        Collection<Disciplina> disciplinas = bd.getDisciplinas();

        req.setAttribute("disciplinas", disciplinas);
        RequestDispatcher rd = req.getRequestDispatcher("lista_disciplinas.jsp");
        rd.forward(req, resp);

    }
}
