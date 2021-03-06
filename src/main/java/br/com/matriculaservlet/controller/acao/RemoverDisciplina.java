package br.com.matriculaservlet.controller.acao;

import br.com.matriculaservlet.modelo.Banco;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoverDisciplina implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Banco banco = new Banco();
        Integer idRemover = Integer.parseInt(req.getParameter("id"));
        banco.removeDisciplina(idRemover);
        return "redirect:UnicaEntradaServlet?&acao=ListarDisciplinas";

    }
}
