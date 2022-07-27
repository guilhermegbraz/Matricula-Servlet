package br.com.matriculaservlet.modelo;

import java.util.*;

public class Banco {

    private static Map<Integer,Disciplina> disciplinas = new HashMap<>();
    private static Integer chaveCadastro = 1;

    private static Set<Usuario> usuariosCadastrados = new HashSet<>();

    static {
        usuariosCadastrados.add(new Usuario(
                "Guilherme Gonçalves","g.braz@aluno.ufabc.edu.br", "20453"));
    }

    public void adicionaDisciplina(Disciplina disciplina) {
        disciplina.setId(Banco.chaveCadastro);
        Banco.disciplinas.put(chaveCadastro, disciplina);
        Banco.chaveCadastro++;
    }

    public void removeDisciplina(Integer id) {
        Banco.disciplinas.remove(id);
    }

    public Collection<Disciplina> getDisciplinas() {
        return Collections.unmodifiableCollection(Banco.disciplinas.values());
    }

    public Disciplina getDisciplinaPeloId(Integer id) {
        return Banco.disciplinas.get(id);
    }

    public void adicionaUsuario(Usuario usuario) {
        Banco.usuariosCadastrados.add(usuario);
    }

    public Usuario existeUsuario(String email, String senha) {

        Usuario possivelUsuario = new Usuario("admin", email, senha);

        for (Usuario usuario : Banco.usuariosCadastrados) {
            if (usuario.equals(possivelUsuario)) {
                return usuario;
            }
        }
        return null;
    }

}
