package br.com.matriculaservlet.modelo;

import java.util.Objects;

public class Usuario {

    private String nomeDeUsuario;
    private String email;
    private String senha;
    private String RA;

    public Usuario(String nomeDeUsuario, String email, String senha) {
        this.nomeDeUsuario = nomeDeUsuario;
        this.email = email;
        this.senha = senha;
    }


    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return  this.getEmail().equals(usuario.getEmail()) && this.getSenha().equals(usuario.getSenha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getSenha());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "'nomeDeUsuario' :'" + nomeDeUsuario + '\'' +
                ", 'email' :'" + email + '\'' +
                ", 'senha' :'" + senha + '\'' +
                '}';
    }
}
