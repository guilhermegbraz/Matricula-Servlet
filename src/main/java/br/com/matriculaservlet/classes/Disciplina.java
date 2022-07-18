package br.com.matriculaservlet.classes;

import java.util.Objects;



public class Disciplina {

    private Integer id;
    private String nome;
    private String TPI;
    private String professor;

    public Disciplina(String nomeDisciplina, String TPI) {
        this.nome = nomeDisciplina;
        this.TPI = TPI;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getNomeDisciplina() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public String getTPI() {
        return TPI;
    }

    public Integer getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina)) return false;
        Disciplina curso = (Disciplina) o;
        return this.nome.equals(curso.getNomeDisciplina()) && this.getTPI().equals(curso.getTPI());
    }

    @Override
    public String toString() {
        return "Disciplina[" +
                "nome='" + nome + '\'' +
                ", TPI='" + TPI + '\'' +
                ']';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeDisciplina(), getTPI());
    }


}
