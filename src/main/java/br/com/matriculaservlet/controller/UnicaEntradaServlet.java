package br.com.matriculaservlet.controller;


import br.com.matriculaservlet.controller.acao.Acao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UnicaEntradaServlet", value = "/UnicaEntradaServlet")
public class UnicaEntradaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paramAcao = req.getParameter("acao");

        boolean acaoPermitidaSemLogin = paramAcao.equals("Login") || paramAcao.equals("LoginForm")
                || paramAcao.equals("Home");
        boolean usuarioNaoLogado = req.getSession().getAttribute("usuarioLogado") == null;

        String nomeDaClasse = "br.com.matriculaservlet.controller.acao." + paramAcao;
        String endereco = null;

        if(!acaoPermitidaSemLogin && usuarioNaoLogado) {
            resp.sendRedirect("UnicaEntradaServlet?&acao=LoginForm");
            return;
        }

        try{

        Class classe = Class.forName(nomeDaClasse);
        Acao acao = (Acao) classe.getConstructor().newInstance();
        endereco= acao.executa(req,resp);

        } catch (Exception e) {
            throw new ServletException("A ação requisitada não possuí uma classe mapeada");
        }

        List<String> resposta = new ArrayList<>(List.of(endereco.split(":")));
        if (resposta.get(0).equals("dispatcher")) {
            RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/" + resposta.get(1));
            rd.forward(req, resp);
        } else {
            resp.sendRedirect( resposta.get(1));
        }
    }
}
