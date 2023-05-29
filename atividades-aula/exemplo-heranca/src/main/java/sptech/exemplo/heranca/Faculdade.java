package sptech.exemplo.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan
 */
public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void exibirTodosAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void exibirAlunosPosGraduacao() {
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoPosGraduacao) {
                System.out.println(aluno);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", alunos=" + alunos + '}';
    }

}
