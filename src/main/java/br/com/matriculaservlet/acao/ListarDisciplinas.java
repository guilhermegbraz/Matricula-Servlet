package br.com.matriculaservlet.acao;

import br.com.matriculaservlet.modelo.BancoDisciplinas;
import br.com.matriculaservlet.modelo.Disciplina;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

public class ListarDisciplinas implements Acao {

    @Override
    public void executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BancoDisciplinas bd = new BancoDisciplinas();
        Collection<Disciplina> disciplinas = bd.getDisciplinas();

        req.setAttribute("disciplinas", disciplinas);
        RequestDispatcher rd = req.getRequestDispatcher("lista_disciplinas.jsp");
        rd.forward(req, resp);
    }
}
