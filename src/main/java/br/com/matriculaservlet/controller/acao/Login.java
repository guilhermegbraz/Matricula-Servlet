package br.com.matriculaservlet.controller.acao;

import br.com.matriculaservlet.modelo.Banco;
import br.com.matriculaservlet.modelo.Usuario;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login implements Acao{
    @Override
    public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        Banco banco = new Banco();
        Usuario usuario = banco.existeUsuario(email, senha);
        if (usuario == null) {
            return "dispatcher:form_login.jsp";
        }
        HttpSession secao = req.getSession();
        secao.setAttribute("usuarioLogado", usuario);
        return "dispatcher:home.jsp";
    }
}
