import br.com.matriculaservlet.modelo.Banco;
import br.com.matriculaservlet.modelo.Disciplina;

public class TestSet {
    public static void main(String[] args) {
        Disciplina md = new Disciplina("Matematica Discreta", "4 - 0 - 5");
        Disciplina algelin = new Disciplina("Algebrar Linear", "6 - 0 - 8");

        Banco bd = new Banco();
        bd.adicionaDisciplina(md);
        bd.adicionaDisciplina(algelin);
        System.out.println(bd.getDisciplinas());
    }
}
