package com.bandtec.projeto.lista.desafio3;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
     */
    public

    Boolean existsAlunoPorNome(String nome) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
     */
    public void matricularAluno(Aluno aluno) {
        if (aluno == null) {
            return;
        }

        if (!existsAlunoPorNome(aluno.getNome())) {
            alunos.add(aluno);
        }
    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
     */
    public void cancelarMatricula(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equalsIgnoreCase(ra)) {
                alunos.get(i).setAtivo(false);
            }
        }
    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
     */
    public Integer getQuantidadeAlunos() {
        Integer quanttidadeAlunos = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).isAtivo()) {
                quanttidadeAlunos++;
            }
        }
        return quanttidadeAlunos;
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
     */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        Integer quantidadePorSemestre = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getSemestre().equals(semestre)) {
                quantidadePorSemestre++;
            }
        }
        return quantidadePorSemestre;
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
     */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        Integer quantidadeMatriculasCanceladas = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).isAtivo().equals(false)) {
                quantidadeMatriculasCanceladas++;
            }
        }
        return quantidadeMatriculasCanceladas;
    }

    public String getNome() {
        return null;
    }

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", alunos=" + alunos + '}';
    }

}
