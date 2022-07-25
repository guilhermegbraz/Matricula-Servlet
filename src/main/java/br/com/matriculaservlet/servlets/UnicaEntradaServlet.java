package br.com.matriculaservlet.servlets;

import br.com.matriculaservlet.acao.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UnicaEntradaServlet", value = "/UnicaEntradaServlet")
public class UnicaEntradaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String paramAcao = req.getParameter("acao");
        System.out.println(paramAcao);

        if(paramAcao.equals("ListarDisciplinas")) {


            ListarDisciplinas listarDisciplinas = new ListarDisciplinas();
            listarDisciplinas.executa(req, resp);
        }
        if(paramAcao.equals("RemoverDisciplina")) {


            RemoverDisciplina removerDisciplina = new RemoverDisciplina();
            removerDisciplina.executa(req, resp);
        }
        if(paramAcao.equals("EditarDisciplina")) {


            EditarDisciplina editarDisciplina = new EditarDisciplina();
            editarDisciplina.executa(req, resp);

        }
        if(paramAcao.equals("AlterarDisciplina")) {

            AlterarDisciplina alterarDisciplina = new AlterarDisciplina();
            alterarDisciplina.executa(req, resp);
        }

        if(paramAcao.equals("NovaDisciplina")) {
            NovaDisciplina novaDisciplina = new NovaDisciplina();
            novaDisciplina.executa(req, resp);
        }

        if(paramAcao.equals("Home")) {
            RequestDispatcher rd = req.getRequestDispatcher("/home.jsp");
            rd.forward(req, resp);
        }

    }
}
