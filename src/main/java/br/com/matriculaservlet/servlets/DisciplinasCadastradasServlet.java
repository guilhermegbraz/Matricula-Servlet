package br.com.matriculaservlet.servlets;

import br.com.matriculaservlet.modelo.Banco;
import br.com.matriculaservlet.modelo.Disciplina;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "DisciplinaCadastradaServlet", value = "/disciplinas")
public class DisciplinasCadastradasServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Banco bd = new Banco();
        Collection<Disciplina> disciplinas = bd.getDisciplinas();

        Gson gson = new Gson();
        String json = gson.toJson(disciplinas);

        resp.setContentType("application/json");
        resp.getWriter().println(json);

    }
}
