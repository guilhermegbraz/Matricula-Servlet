package br.com.matriculaservlet.acao;

import br.com.matriculaservlet.modelo.BancoDisciplinas;
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

        BancoDisciplinas banco = new BancoDisciplinas();
        banco.adiciona(novaDisciplina);

        System.out.println("Nova disciplina Cadastrada");

        return "redirect:UnicaEntradaServlet?&acao=ListarDisciplinas";
    }
}
