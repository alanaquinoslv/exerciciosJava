package sptech.ac03.atividade03;

/**
 *
 * @author alan
 */
import java.util.ArrayList;
import java.util.List;

public class EscolaVirtual {

    private String nome;
    private int vagas;
    private List<Professor> listaProf;

    public EscolaVirtual(String nome, int vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaProf = new ArrayList<>();
    }

    public void contratarProfessor(Professor prof) {
        if (vagas > 0) {
            listaProf.add(prof);
            vagas--;
        } else {
            System.out.println("A escola virtual " + nome + " não possui vagas disponíveis.");
        }
    }

    public void exibirTodos() {
        if (!listaProf.isEmpty()) {
            for (Professor prof : listaProf) {
                System.out.println(prof.toString());
            }
        } else {
            System.out.println("A escola virtual " + nome + " não possui professores.");
        }
    }

    public void exibePalestrantes() {
        boolean possuiPalestrantes = false;
        for (Professor prof : listaProf) {
            if (prof instanceof Palestrante) {
                System.out.println(prof.toString());
                possuiPalestrantes = true;
            }
        }
        if (!possuiPalestrantes) {
            System.out.println("A escola virtual " + nome + " não possui palestrantes.");
        }
    }

    public void exibeFolhaDePagamento() {
        double totalSalarios = 0;
        int totalFuncionarios = listaProf.size();

        for (Professor prof : listaProf) {
            System.out.println("Nome: " + prof.getNome() + " | Salário: R$ " + prof.calcularGanho());
            totalSalarios += prof.calcularGanho();
        }

        System.out.println("Total de Funcionários: " + totalFuncionarios);
        System.out.println("Valor Total a ser Pago: R$ " + totalSalarios);
    }

    public void atualizarValorCurso(String nomeCurso, double valorNovo) {
        boolean cursoEncontrado = false;

        for (Professor prof : listaProf) {
            if (prof.getCurso().equals(nomeCurso)) {
                prof.setValorCurso(valorNovo);
                cursoEncontrado = true;
            }
        }

        if (!cursoEncontrado) {
            System.out.println("Curso inexistente.");
        }
    }

    public Professor buscarProfessor(String nome) {
        for (Professor prof : listaProf) {
            if (prof.getNome().equals(nome)) {
                return prof;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Escola Virtual: " + nome
                + "\nVagas Disponíveis: " + vagas
                + "\nVagas Restantes: " + vagas;
    }
}
