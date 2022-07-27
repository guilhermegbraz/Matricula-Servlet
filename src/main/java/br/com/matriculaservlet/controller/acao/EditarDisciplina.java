package br.com.matriculaservlet.controller.acao;

import br.com.matriculaservlet.modelo.BancoDisciplinas;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditarDisciplina implements Acao{
    @Override
    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("disciplina", new BancoDisciplinas().getDisciplinaPeloId(id));
        return "dispatcher:editar_disciplina.jsp";

    }
}
