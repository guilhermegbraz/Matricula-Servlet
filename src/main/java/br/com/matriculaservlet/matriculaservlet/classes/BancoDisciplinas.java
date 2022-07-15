package br.com.matriculaservlet.matriculaservlet.classes;

import javax.print.attribute.UnmodifiableSetException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BancoDisciplinas {

    private static Set<Disciplina> disciplinas = new HashSet<>();

    public void adiciona(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void remove(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }

    public Set<Disciplina> getDisciplinas() {
        return Collections.unmodifiableSet(this.disciplinas);
    }
}
