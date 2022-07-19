package br.com.matriculaservlet.classes;

import java.util.*;

public class BancoDisciplinas {

    private static Map<Integer,Disciplina> disciplinas = new HashMap<>();
    private static Integer chaveCadastro = 1;

    public void adiciona(Disciplina disciplina) {
        disciplina.setId(BancoDisciplinas.chaveCadastro);
        BancoDisciplinas.disciplinas.put(chaveCadastro, disciplina);
        BancoDisciplinas.chaveCadastro++;
    }

    public void remove(Integer id) {
        BancoDisciplinas.disciplinas.remove(id);
    }

    public Collection<Disciplina> getDisciplinas() {
        return Collections.unmodifiableCollection(BancoDisciplinas.disciplinas.values());
    }

    public Disciplina getDisciplinaPeloId(Integer id) {
        return BancoDisciplinas.disciplinas.get(id);
    }
}
