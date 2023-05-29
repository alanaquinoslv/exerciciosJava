package faculdade;

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

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cancelarMatricula(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equalsIgnoreCase(ra)) {
                alunos.get(i).setAtivo(false);
            }
        }
    }

    public void exibirAlunos() {
        System.out.println(alunos);
    }

    public void exibirAlunosPorSemestre(Integer semestre) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getSemestre().equals(semestre)) {
                System.out.println(alunos.get(i));
            }
        }
    }

    public void exibirCancelados() {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getAtivo().equals(false)) {
                System.out.println(alunos.get(i));
            }
        }
    }

}
