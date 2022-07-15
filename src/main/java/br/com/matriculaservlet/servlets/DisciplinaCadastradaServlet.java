package br.com.matriculaservlet.servlets;

import br.com.matriculaservlet.classes.BancoDisciplinas;
import br.com.matriculaservlet.classes.Disciplina;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Set;

@WebServlet(name = "DisciplinaCadastradaServlet", value = "/DisciplinaCadastradaServlet")
public class DisciplinaCadastradaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BancoDisciplinas bd = new BancoDisciplinas();
        Set<Disciplina> disciplinas = bd.getDisciplinas();

        req.setAttribute("disciplinas", disciplinas);
        RequestDispatcher rd = req.getRequestDispatcher("lista_disciplinas.jsp");
        rd.forward(req, resp);

    }
}
