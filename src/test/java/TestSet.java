import br.com.matriculaservlet.classes.BancoDisciplinas;
import br.com.matriculaservlet.classes.Disciplina;

public class TestSet {
    public static void main(String[] args) {
        Disciplina md = new Disciplina("Matematica Discreta", "4 - 0 - 5");
        Disciplina algelin = new Disciplina("Algebrar Linear", "6 - 0 - 8");

        BancoDisciplinas bd = new BancoDisciplinas();
        bd.adiciona(md);
        bd.adiciona(algelin);
        System.out.println(bd.getDisciplinas());
    }
}
