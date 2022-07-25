package br.com.matriculaservlet.acao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Acao {

    public void executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
