package br.com.matriculaservlet.controller.acao;

import br.com.matriculaservlet.modelo.Banco;
import br.com.matriculaservlet.modelo.Disciplina;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NovaDisciplina implements Acao{
    @Override
    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nomeDisciplina = req.getParameter("nomeDisciplina");
        String TPIDisciplina = req.getParameter("TPIDisciplina");
        String professorDisciplina = req.getParameter("professorDisciplina");

        Disciplina novaDisciplina = new Disciplina(nomeDisciplina, TPIDisciplina);

        Banco banco = new Banco();
        banco.adicionaDisciplina(novaDisciplina);

        System.out.println("Nova disciplina Cadastrada");

        return "redirect:UnicaEntradaServlet?&acao=ListarDisciplinas";
    }
}
