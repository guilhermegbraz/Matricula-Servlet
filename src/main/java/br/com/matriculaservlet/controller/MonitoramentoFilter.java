package br.com.matriculaservlet.controller;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//O mapeamento do filtro é igual a do servlet para toda requisição entrar no filtro
// antes de ir para a servlet unica
@WebFilter(urlPatterns = "/UnicaEntradaServlet")
public class MonitoramentoFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        long antes = System.currentTimeMillis();

        //executa a ação (continua a requisição)
        chain.doFilter(request, response);

        long depois = System.currentTimeMillis();
        System.out.printf("O tempo de execução da ação %s foi %s mili-segundos\n",
                request.getParameter("acao"),(depois - antes));
    }

}
