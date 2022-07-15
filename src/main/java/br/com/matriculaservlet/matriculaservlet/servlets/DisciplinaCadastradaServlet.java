package br.com.matriculaservlet.matriculaservlet.servlets;

import br.com.matriculaservlet.matriculaservlet.classes.BancoDisciplinas;
import br.com.matriculaservlet.matriculaservlet.classes.Disciplina;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisciplinaCadastradaServlet", value = "/DisciplinaCadastradaServlet")
public class DisciplinaCadastradaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        pw.println("<html><body>");
       pw.println(" <head> <link rel=" + "stylesheet" + "type="+"text/css"+ "href="+"style_padrao.css"+"> </head>");
        BancoDisciplinas banco = new BancoDisciplinas();
        for(Disciplina dp : banco.getDisciplinas()) {
            pw.println("<p><h2>Disciplina " + dp.getNome() + " cadastrada</h2></p>");
        }
        pw.println("</body></html");
    }
}
