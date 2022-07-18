package br.com.matriculaservlet.classes;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BancoDisciplinas {

    private static Set<Disciplina> disciplinas = new HashSet<>();
    private static Integer chaveCadastro = 1;

    public void adiciona(Disciplina disciplina) {
        disciplina.setId(BancoDisciplinas.chaveCadastro);
        BancoDisciplinas.disciplinas.add(disciplina);
        BancoDisciplinas.chaveCadastro++;
    }

    public void remove(Integer id) {
        for (Disciplina disciplina : BancoDisciplinas.disciplinas) {
            if(disciplina.getId().equals(id)) {
                BancoDisciplinas.disciplinas.remove(disciplina);
            }
        }
    }

    public Set<Disciplina> getDisciplinas() {
        return Collections.unmodifiableSet(BancoDisciplinas.disciplinas);
    }
}
