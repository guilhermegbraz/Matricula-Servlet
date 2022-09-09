package br.com.matriculaservlet.controller;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;

@WebFilter(urlPatterns = "/UnicaEntradaServlet")
public class AutorizacaoFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws ServletException, IOException {

        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse resp = (HttpServletResponse) response;

        String paramAcao = req.getParameter("acao");

        boolean acaoPermitidaSemLogin = paramAcao.equals("Login") || paramAcao.equals("LoginForm")
                || paramAcao.equals("Home");
        boolean usuarioNaoLogado = req.getSession().getAttribute("usuarioLogado") == null;

        if(!acaoPermitidaSemLogin && usuarioNaoLogado) {
            resp.sendRedirect("UnicaEntradaServlet?&acao=LoginForm");
            return;
        }
        chain.doFilter(request, response);
    }
}
