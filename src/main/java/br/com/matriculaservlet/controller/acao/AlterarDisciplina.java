package br.com.matriculaservlet.controller.acao;

import br.com.matriculaservlet.modelo.Banco;
import br.com.matriculaservlet.modelo.Disciplina;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AlterarDisciplina implements Acao{
    @Override
    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Banco bancoDisciplinas = new Banco();
        Disciplina disciplinaAModificar = bancoDisciplinas.getDisciplinaPeloId(
                Integer.valueOf(req.getParameter("idDisciplina")));

        disciplinaAModificar.setNome(req.getParameter("nomeDisciplina"));
        disciplinaAModificar.setTPI(req.getParameter("TPIDisciplina"));
        disciplinaAModificar.setProfessor(req.getParameter("professorDisciplina"));

        return "redirect:UnicaEntradaServlet?&acao=ListarDisciplinas";
    }
}
