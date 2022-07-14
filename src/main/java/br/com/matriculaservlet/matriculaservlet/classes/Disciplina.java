package br.com.matriculaservlet.matriculaservlet.classes;

import java.util.Objects;

public class Disciplina {

    private String nome;
    private String TPI;
    private String professor;

    public Disciplina(String nome, String TPI) {
        this.nome = nome;
        this.TPI = TPI;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public String getTPI() {
        return TPI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina)) return false;
        Disciplina curso = (Disciplina) o;
        return this.nome.equals(curso.getNome()) && this.getTPI().equals(curso.getTPI())
                && this.getProfessor().equals(curso.getProfessor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getTPI(), getProfessor());
    }
}
