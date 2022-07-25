package br.com.matriculaservlet.acao;

import br.com.matriculaservlet.modelo.BancoDisciplinas;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoverDisciplina implements Acao {

    @Override
    public void executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BancoDisciplinas banco = new BancoDisciplinas();
        Integer idRemover = Integer.parseInt(req.getParameter("id"));
        banco.remove(idRemover);
        resp.sendRedirect("UnicaEntradaServlet?&acao=ListarDisciplinas");

    }
}
