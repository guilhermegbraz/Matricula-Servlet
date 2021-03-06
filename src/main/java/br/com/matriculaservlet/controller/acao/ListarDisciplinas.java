package br.com.matriculaservlet.controller.acao;

import br.com.matriculaservlet.modelo.Banco;
import br.com.matriculaservlet.modelo.Disciplina;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

public class ListarDisciplinas implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Banco bd = new Banco();
        Collection<Disciplina> disciplinas = bd.getDisciplinas();

        req.setAttribute("disciplinas", disciplinas);
        return "dispatcher:lista_disciplinas.jsp";

    }
}
